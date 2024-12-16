package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import DTO.Candidato;
import DTO.Pessoa;
import Conexao.Conexao;

public class CandidatoDAO {

	final String NOMEDATABELA = "CANDIDATO";
	
	PartidoDAO partido = new PartidoDAO();
	PessoaDAO pessoa = new PessoaDAO();


	public boolean inserir(Candidato candidato) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (cargoPolitico, numero, apelido, vice, idPartido, idPessoa) VALUES (?, ?, ?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, candidato.getCargoPolitico());
			ps.setInt(2, candidato.getNumero());
			ps.setString(3, candidato.getApelido());
			ps.setString(4, candidato.getVice());
			
			ps.setInt(5, candidato.getPartido().getIdPartido());
			ps.setInt(6, candidato.getIdPessoa());
			
			ps.executeUpdate();
			
			candidato.setIdCandidato(procuraIdPorTodosDados(candidato));
			
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Candidato procurarPorId(int idCandidato) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idCandidato = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idCandidato);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				Candidato obj = new Candidato();
				PessoaDAO pesDAO = new PessoaDAO();
				Pessoa pes = pesDAO.procurarPorId(rs.getInt(7));
				PartidoDAO part = new PartidoDAO();
				
				obj.setCargoPolitico(rs.getString(2));
				obj.setNumero(rs.getInt(3));
				obj.setApelido(rs.getString(4));
				obj.setVice(rs.getString(5));
				obj.setPartido(part.procurarPorId(rs.getInt(6)));
				obj.setIdPessoa(rs.getInt(7));
				
				
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


	public boolean alterar(Candidato Candidato) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET cargoPolitico = ?, numero = ?, apelido = ? , vice = ?, idPartido = ?, idPessoa = ? WHERE idCandidato = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, Candidato.getCargoPolitico());
			ps.setInt(2, Candidato.getNumero());
			ps.setString(3, Candidato.getApelido());
			ps.setString(4, Candidato.getVice());
			ps.setInt(5, Candidato.getPartido().getIdPartido());
			ps.setInt(6, Candidato.getIdPessoa());
			
			ps.setInt(7, Candidato.getIdCandidato());

			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	


	public int procuraIdPorTodosDados(Candidato candidato) {
		try {

			//(pais, estado, cidade, zonaEleitoral, sessaoEleitoral)
			Connection conn = Conexao.conectar();			
			String sqlSelectId = "SELECT idCandidato FROM " + NOMEDATABELA + " WHERE cargoPolitico = ? AND numero = ? AND apelido = ? AND vice = ? AND idPartido = ? AND idPessoa = ?;";

			PreparedStatement ps = conn.prepareStatement(sqlSelectId);
			
			ps.setString(1, candidato.getCargoPolitico());
			ps.setInt(2, candidato.getNumero());
			ps.setString(3, candidato.getApelido());
			ps.setString(4, candidato.getVice());
			ps.setInt(5, candidato.getPartido().getIdPartido());
			ps.setInt(6, candidato.getIdPessoa());

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

	public boolean excluir(Candidato candidato) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idCandidato = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, procuraIdPorTodosDados(candidato));
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean existe(Candidato candidato) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cargoPolitico = ? AND numero = ? AND apelido = ? AND vice = ? AND idPartido = ? AND idPessoa = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, candidato.getCargoPolitico());
			ps.setInt(2, candidato.getNumero());
			ps.setString(3, candidato.getApelido());
			ps.setString(4, candidato.getVice());
			ps.setInt(5, candidato.getPartido().getIdPartido());
			ps.setInt(6, candidato.getIdPessoa());
			
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

	public List<Candidato> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Candidato> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Candidato> montarLista(ResultSet rs) {
		List<Candidato> listObj = new ArrayList<Candidato>();
		try {
			while (rs.next()) {
				Candidato obj = new Candidato();
				
				PessoaDAO pesDAO = new PessoaDAO();
				Pessoa pes = pesDAO.procurarPorId(rs.getInt(7));
				
				obj.setIdCandidato(rs.getInt(1));
				obj.setCargoPolitico(rs.getString(2));
				obj.setNumero(rs.getInt(3));
				obj.setApelido(rs.getString(4));
				obj.setVice(rs.getString(5));
				obj.setPartido(partido.procurarPorId(rs.getInt(6)));
				obj.setIdPessoa(rs.getInt(7));
				
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
	
	public Candidato buscarCandidatoPorId(int idCandidato) {
	    String sql = "SELECT * FROM eleicao.candidato WHERE idCandidato = ?";

	    try (Connection conn = Conexao.conectar();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setInt(1, idCandidato);
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            Candidato candidato = new Candidato();

	            candidato.setIdCandidato(rs.getInt("idCandidato"));
	            candidato.setCargoPolitico(rs.getString("cargoPolitico"));
	            candidato.setApelido(rs.getString("apelido"));
	            candidato.setNumero(rs.getInt("numero"));
	            candidato.setVice(rs.getString("vice"));
	            candidato.setPartido(partido.procurarPorId(rs.getInt("idPartido")));
	            candidato.setIdPessoa(rs.getInt("idPessoa"));

	            return candidato;
	        }
	        return null;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
	
	public HashMap<Candidato, Integer> buscarCandidatosComTotalDeVotos(String cargo) {
	    String sql = """
	        SELECT 
	            c.idCandidato,
	            COUNT(v.idCandidato) AS total_votos
	        FROM 
	            eleicao.voto v
	        JOIN 
	            eleicao.candidato c
	        ON 
	            v.idCandidato = c.idCandidato
	        WHERE 
	            c.cargoPolitico = ?
	        GROUP BY 
	            c.idCandidato
	        ORDER BY 
	            total_votos DESC;
	        """;

	    try (Connection conn = Conexao.conectar();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setString(1, cargo);

	        ResultSet rs = ps.executeQuery();
	        HashMap<Candidato, Integer> candidatosComVotos = new HashMap<>();

	        while (rs.next()) {
	            int idCandidato = rs.getInt("idCandidato");
	            int totalVotos = rs.getInt("total_votos");

	            Candidato candidato = buscarCandidatoPorId(idCandidato);
	            candidatosComVotos.put(candidato, totalVotos);
	        }

	        return candidatosComVotos;

	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}



}
