package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DTO.Pessoa;

import Conexao.Conexao;

public class PessoaDAO {

	EnderecoDAO endereco = new EnderecoDAO();

	final String NOMEDATABELA = "PESSOA";

	public boolean inserir(Pessoa pessoa) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (nome, idade, cpf, sexo, idEndereco) VALUES (?, ?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, pessoa.getNome());
			ps.setInt(2, pessoa.getIdade());
			ps.setString(3, pessoa.getCpf());
			ps.setString(4, pessoa.getSexo());
			ps.setInt(5, endereco.procuraIdPorTodosDados(pessoa.getEndereco()));
			ps.executeUpdate();
			
			pessoa.setIdPessoa(procuraIdPorTodosDados(pessoa));
			
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Pessoa procurarPorId(int idPessoa) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idPessoa = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idPessoa);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Pessoa obj = new Pessoa();
				EnderecoDAO ed = new EnderecoDAO();
				
				obj.setIdPessoa(rs.getInt(1));
				obj.setNome(rs.getString(2));
				obj.setIdade(rs.getInt(3));
				obj.setCpf(rs.getString(4));
				obj.setSexo(rs.getString(5));
				obj.setEndereco(ed.procurarPorId(rs.getInt(6)));
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


	public boolean alterar(Pessoa pessoa) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, idade = ?, cpf = ? , sexo = ?, idEndereco = ? WHERE idPessoa = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, pessoa.getNome());
			ps.setInt(2, pessoa.getIdade());
			ps.setString(3, pessoa.getCpf());
			ps.setString(4, pessoa.getSexo());
			ps.setInt(5, endereco.procuraIdPorTodosDados(pessoa.getEndereco()));
			ps.setInt(6, procuraIdPorTodosDados(pessoa));

			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	


	public int procuraIdPorTodosDados(Pessoa pessoa) {
		try {

			//(pais, estado, cidade, zonaEleitoral, sessaoEleitoral)
			Connection conn = Conexao.conectar();			
			String sqlSelectId = "SELECT idPessoa FROM " + NOMEDATABELA + " WHERE nome = ? AND idade = ? AND cpf = ? AND sexo = ? AND idEndereco = ?";

			PreparedStatement ps = conn.prepareStatement(sqlSelectId);

			ps.setString(1, pessoa.getNome());
			ps.setInt(2, pessoa.getIdade());
			ps.setString(3, pessoa.getCpf());
			ps.setString(4, pessoa.getSexo());
			ps.setInt(5, endereco.procuraIdPorTodosDados(pessoa.getEndereco()));

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

	public boolean excluir(Pessoa pessoa) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idPessoa = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, procuraIdPorTodosDados(pessoa));
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean existe(Pessoa pessoa) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idPessoa = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, procuraIdPorTodosDados(pessoa));
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

	public List<Pessoa> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Pessoa> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Pessoa> montarLista(ResultSet rs) {
		List<Pessoa> listObj = new ArrayList<Pessoa>();
		try {
			while (rs.next()) {
				//nome, idade, cpf, sexo, idEndereco
				Pessoa obj = new Pessoa();
				EnderecoDAO ed = new EnderecoDAO();
				
				obj.setIdPessoa(rs.getInt(1));
				obj.setNome(rs.getString(2));
				obj.setIdade(rs.getInt(3));
				obj.setCpf(rs.getString(4));
				obj.setSexo(rs.getString(5));
				obj.setEndereco(ed.procurarPorId(rs.getInt(6)));
				
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
