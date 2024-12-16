package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DTO.Eleitor;
import DTO.Pessoa;
import Conexao.Conexao;

public class EleitorDAO {

	final String NOMEDATABELA = "ELEITOR";
	
	PartidoDAO partido = new PartidoDAO();
	PessoaDAO pessoa = new PessoaDAO();

	public boolean inserir(Eleitor eleitor) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (numeroTitulo, idPessoa) VALUES (?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, eleitor.getNumeroTitulo());
			ps.setInt(2, pessoa.procuraIdPorTodosDados(eleitor));
			ps.executeUpdate();
			
			eleitor.setIdEleitor(procuraIdPorTodosDados(eleitor));
			
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Eleitor procurarPorId(int idEleitor) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idEleitor = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idEleitor);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				Eleitor obj = new Eleitor();
				PessoaDAO pesDAO = new PessoaDAO();
				Pessoa pes = pesDAO.procurarPorId(rs.getInt(3));
			
				obj.setNumeroTitulo(rs.getString(2));
				
				obj.setNome(pes.getNome());
				obj.setIdade(pes.getIdade());
				obj.setCpf(pes.getCpf());
				obj.setSexo(pes.getSexo());
				obj.setEndereco(pes.getEndereco());
				
				ps.close();
				rs.close();
				conn.close();
				return obj;
			} else {
				ps.close();
				rs.close();
				conn.close();
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	public boolean alterar(Eleitor eleitor) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET numeroTitulo = ?, idPessoa = ? WHERE idEleitor = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, eleitor.getNumeroTitulo());
			ps.setInt(2, eleitor.getIdPessoa());
			
			ps.setInt(3, eleitor.getIdEleitor());

			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	


	public int procuraIdPorTodosDados(Eleitor eleitor) {
		try {

			//(pais, estado, cidade, zonaEleitoral, sessaoEleitoral)
			Connection conn = Conexao.conectar();			
			String sqlSelectId = "SELECT idEleitor FROM " + NOMEDATABELA + " WHERE numeroTitulo = ? AND idPessoa = ?;";

			PreparedStatement ps = conn.prepareStatement(sqlSelectId);
			
			ps.setString(1, eleitor.getNumeroTitulo());
			ps.setInt(2, eleitor.getIdPessoa());

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int id = rs.getInt(1);
				ps.close();
				rs.close();
				conn.close();
				return id;
			} else {
				ps.close();
				rs.close();
				conn.close();
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public boolean excluir(Eleitor eleitor) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE numeroTitulo = ? AND idPessoa = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, eleitor.getNumeroTitulo());
			ps.setInt(1, eleitor.getIdPessoa());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean existe(Eleitor eleitor) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numeroTitulo = ? AND idPessoa = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, eleitor.getNumeroTitulo());
			ps.setInt(2, eleitor.getIdPessoa());
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ps.close();
				rs.close();
				conn.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	public List<Eleitor> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Eleitor> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Eleitor> montarLista(ResultSet rs) {
		List<Eleitor> listObj = new ArrayList<Eleitor>();
		try {
			while (rs.next()) {
				Eleitor obj = new Eleitor();
				
				PessoaDAO pesDAO = new PessoaDAO();
				Pessoa pes = pesDAO.procurarPorId(rs.getInt(3));
				
				
				obj.setIdEleitor(rs.getInt(1));
				obj.setNumeroTitulo(rs.getString(2));
				obj.setIdPessoa(rs.getInt(3));
				
				obj.setNome(pes.getNome());
				obj.setIdade(pes.getIdade());
				obj.setCpf(pes.getCpf());
				obj.setSexo(pes.getSexo());
				obj.setEndereco(pes.getEndereco());
				
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<String> pesquisarNomesEleitores() {
	    try {
	        Connection conn = Conexao.conectar();
	        String sql = """
	            SELECT p.nome
	            FROM eleicao.eleitor e
	            JOIN eleicao.pessoa p ON e.idPessoa = p.idPessoa;
	        """;
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

	        List<String> nomesEleitores = new ArrayList<>();
	        while (rs.next()) {
	            nomesEleitores.add(rs.getString("nome"));
	        }

	        return nomesEleitores;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}

}
