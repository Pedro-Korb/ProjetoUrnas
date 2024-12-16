package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import DTO.Partido;

public class PartidoDAO {

	final String NOMEDATABELA = "PARTIDO";

	public boolean inserir(Partido partido) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (numero, nomePartido, siglaPartido) VALUES (?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, partido.getNumero());
			ps.setString(2, partido.getNomePartido());
			ps.setString(3, partido.getSiglaPartido());
			ps.executeUpdate();
			
			partido.setIdPartido(procuraIdPorTodosDados(partido));
			
			
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public boolean alterar(Partido partido) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET numero = ?, nomePartido = ?, siglaPartido = ? WHERE idPartido = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, partido.getNumero());
			ps.setString(2, partido.getNomePartido());
			ps.setString(3, partido.getSiglaPartido());
			ps.setInt(4, partido.getIdPartido());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public int procuraIdPorTodosDados(Partido partido) {
		try {
			Connection conn = Conexao.conectar();			
			String sqlSelectId = "SELECT idPartido FROM " + NOMEDATABELA + " WHERE numero = ? AND nomePartido = ? AND siglaPartido = ?";

			PreparedStatement ps = conn.prepareStatement(sqlSelectId);
			ps.setInt(1, partido.getNumero());
			ps.setString(2, partido.getNomePartido());
			ps.setString(3, partido.getSiglaPartido());
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
	
	public Partido procurarPorId(int idPartido) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idPartido = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idPartido);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Partido obj = new Partido ();
				
				obj.setIdPartido(rs.getInt(1));
				obj.setNumero(rs.getInt(2));
				obj.setNomePartido(rs.getString(3));
				obj.setSiglaPartido(rs.getString(4));
				
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


	public int procuraIdPorNumero(Partido partido) {
		try {
			Connection conn = Conexao.conectar();			
			String sqlSelectId = "SELECT idPartido FROM " + NOMEDATABELA + " WHERE numero = ?;";


			PreparedStatement ps = conn.prepareStatement(sqlSelectId);
			ps.setInt(1, partido.getNumero());
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



	public boolean excluir(Partido partido) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE numero = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, partido.getNumero());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public Partido procurarPorCodigo(Partido partido) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numero = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, partido.getNumero());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Partido obj = new Partido();
				obj.setNumero(rs.getInt(1));
				obj.setNomePartido(rs.getString(2));
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
	public Partido procurarPorDescricao(Partido partido) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numero = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, partido.getNumero());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Partido obj = new Partido();
				obj.setNumero(rs.getInt(1));
				obj.setNomePartido(rs.getString(2));
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
			return null;
		}
	}
	public boolean existe(Partido partido) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numero = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, partido.getNumero());
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
	public List<Partido> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Partido> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Partido> montarLista(ResultSet rs) {
		List<Partido> listObj = new ArrayList<Partido>();
		try {
			while (rs.next()) {
				Partido obj = new Partido();
				
				obj.setIdPartido(rs.getInt(1));
				obj.setNumero(rs.getInt(2));
				obj.setNomePartido(rs.getString(3));
				obj.setSiglaPartido(rs.getString(4));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

