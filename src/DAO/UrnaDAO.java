package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import DTO.Urna;

public class UrnaDAO {

	final String NOMEDATABELA = "URNA";

	public boolean inserir(Urna urna) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (cidade, zonaEleitoral, sessaoEleitoral) VALUES (?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, urna.getCidade());
			ps.setInt(2, urna.getZonaEleitoral());
			ps.setInt(3, urna.getSessaoEleitoral());
			ps.executeUpdate();
			
			urna.setIdUrna(procuraIdPorTodosDados(urna));
			
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Urna procurarPorId(int idUrna) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idPartido = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idUrna);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Urna obj = new Urna();
				
				obj.setIdUrna(rs.getInt(1));
				obj.setCidade(rs.getString(2));
				obj.setZonaEleitoral(rs.getInt(3));
				obj.setSessaoEleitoral(rs.getInt(4));
				
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


	public boolean alterar(Urna urna) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET cidade = ?, zonaEleitoral = ?, sessaoEleitoral = ? WHERE idUrna = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, urna.getCidade());
			ps.setInt(2, urna.getZonaEleitoral());
			ps.setInt(3, urna.getSessaoEleitoral());
			ps.setInt(4, urna.getSessaoEleitoral());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public int procuraIdPorTodosDados(Urna urna) {
		try {
			Connection conn = Conexao.conectar();			
			String sqlSelectId = "SELECT idUrna FROM " + NOMEDATABELA + " WHERE cidade = ? AND zonaEleitoral = ? AND sessaoEleitoral = ?";

			PreparedStatement ps = conn.prepareStatement(sqlSelectId);
			ps.setString(1, urna.getCidade());
			ps.setInt(2, urna.getZonaEleitoral());
			ps.setInt(3, urna.getSessaoEleitoral());
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



	public boolean excluir(Urna urna) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idUrna = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, procuraIdPorTodosDados(urna));
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean existe(Urna urna) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idUrna = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, procuraIdPorTodosDados(urna));
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
	public List<Urna> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Urna> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Urna> montarLista(ResultSet rs) {
		List<Urna> listObj = new ArrayList<Urna>();
		try {
			while (rs.next()) {
				Urna obj = new Urna();
				obj.setIdUrna(rs.getInt(1));
				obj.setCidade(rs.getString(2));
				obj.setZonaEleitoral(rs.getInt(3));
				obj.setSessaoEleitoral(rs.getInt(4));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

