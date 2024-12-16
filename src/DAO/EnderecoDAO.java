package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import DTO.Endereco;

public class EnderecoDAO {

	final String NOMEDATABELA = "ENDERECO";

	
	public boolean inserir(Endereco endereco) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (pais, estado, cidade, zonaEleitoral, sessaoEleitoral) VALUES (?, ?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, endereco.getPais());
			ps.setString(2, endereco.getEstado());
			ps.setString(3, endereco.getCidade());
			ps.setInt(4, endereco.getZonaEleitoral());
			ps.setInt(5, endereco.getSessaoEleitoral());
			ps.executeUpdate();
			
			endereco.setIdEndereco(procuraIdPorTodosDados(endereco));
			
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public boolean alterar(Endereco endereco) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET pais = ?, estado = ?, cidade = ? , zonaEleitoral = ?, sessaoEleitoral = ? WHERE idEndereco = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, endereco.getPais());
			ps.setString(2, endereco.getEstado());
			ps.setString(3, endereco.getCidade());
			ps.setInt(4, endereco.getZonaEleitoral());
			ps.setInt(5, endereco.getSessaoEleitoral());
			ps.setInt(6, procuraIdPorTodosDados(endereco));
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public int procuraIdPorTodosDados(Endereco endereco) {
		try {
			
			//(pais, estado, cidade, zonaEleitoral, sessaoEleitoral)
			Connection conn = Conexao.conectar();			
			String sqlSelectId = "SELECT idEndereco FROM " + NOMEDATABELA + " WHERE pais = ? AND estado = ? AND cidade = ? AND zonaEleitoral = ? AND sessaoEleitoral = ?";


			PreparedStatement ps = conn.prepareStatement(sqlSelectId);
			ps.setString(1, endereco.getPais());
			ps.setString(2, endereco.getEstado());
			ps.setString(3, endereco.getCidade());
			ps.setInt(4, endereco.getZonaEleitoral());
			ps.setInt(5, endereco.getSessaoEleitoral());
			
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



	public boolean excluir(Endereco endereco) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idEndereco = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, procuraIdPorTodosDados(endereco));
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Endereco procurarPorId(int idEndereco) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idEndereco = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idEndereco);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Endereco obj = new Endereco();
				
				obj.setIdEndereco(rs.getInt(1));
				obj.setPais(rs.getString(2));
				obj.setEstado(rs.getString(3));
				obj.setCidade(rs.getString(4));
				obj.setZonaEleitoral(rs.getInt(5));
				obj.setSessaoEleitoral(rs.getInt(6));
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
	
	public boolean existe(Endereco endereco) {
		try {
			Connection conn = Conexao.conectar();
			String sqlSelectId = "SELECT * FROM " + NOMEDATABELA + " WHERE pais = ? AND estado = ? AND cidade = ? AND zonaEleitoral = ? AND sessaoEleitoral = ?";
			PreparedStatement ps = conn.prepareStatement(sqlSelectId);
			ps.setString(1, endereco.getPais());
			ps.setString(2, endereco.getEstado());
			ps.setString(3, endereco.getCidade());
			ps.setInt(4, endereco.getZonaEleitoral());
			ps.setInt(5, endereco.getSessaoEleitoral());
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
	
	public List<Endereco > pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Endereco > listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Endereco > montarLista(ResultSet rs) {
		List<Endereco > listObj = new ArrayList<Endereco >();
		try {
			while (rs.next()) {
				Endereco  obj = new Endereco ();
				
				obj.setIdEndereco(rs.getInt(1));
				obj.setPais(rs.getString(2));
				obj.setEstado(rs.getString(3));
				obj.setCidade(rs.getString(4));
				obj.setZonaEleitoral(rs.getInt(5));
				obj.setSessaoEleitoral(rs.getInt(6));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
}

