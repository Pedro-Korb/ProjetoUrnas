package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DTO.Voto;
import Conexao.Conexao;

public class VotoDAO {

	final String NOMEDATABELA = "VOTO";

	EleitorDAO eleitor = new EleitorDAO();
	UrnaDAO urna = new UrnaDAO();
	CandidatoDAO candidato = new CandidatoDAO();

	public boolean inserir(Voto voto) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (anoVoto, idEleitor, idUrna, idCandidato) VALUES (?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, voto.getAnoVoto());
			ps.setInt(2, voto.getEleitor().getIdEleitor());
			ps.setInt(3, voto.getUrna().getIdUrna());
			ps.setInt(4, voto.getCandidato().getIdCandidato());
			ps.executeUpdate();

			voto.setIdVoto(procuraIdPorTodosDados(voto));

			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Voto procurarPorId(int idVoto) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idVoto = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idVoto);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Voto obj = new Voto();
				
				UrnaDAO urna = new UrnaDAO();
				CandidatoDAO candidato = new CandidatoDAO();
				EleitorDAO eleitor = new EleitorDAO();

				obj.setAnoVoto(rs.getInt(2));
				obj.setEleitor(eleitor.procurarPorId(rs.getInt(3)));
				obj.setUrna(urna.procurarPorId(rs.getInt(4)));
				obj.setCandidato(candidato.procurarPorId(rs.getInt(5)));



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


	public boolean alterar(Voto voto) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET anoVoto = ?, idEleitor = ?, idUrna = ?, idCandidato = ? WHERE idVoto = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, voto.getAnoVoto());
			ps.setInt(2, voto.getEleitor().getIdEleitor());
			ps.setInt(3, voto.getUrna().getIdUrna());
			ps.setInt(4, voto.getCandidato().getIdCandidato());
			ps.setInt(5, voto.getIdVoto());

			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	public int procuraIdPorTodosDados(Voto voto) {
		try {

			//(pais, estado, cidade, zonaEleitoral, sessaoEleitoral)
			Connection conn = Conexao.conectar();			
			String sqlSelectId = "SELECT idVoto FROM " + NOMEDATABELA + " WHERE anoVoto = ? AND idEleitor = ? AND idUrna = ? AND idCandidato = ?;";

			PreparedStatement ps = conn.prepareStatement(sqlSelectId);

			ps.setInt(1, voto.getAnoVoto());
			ps.setInt(2, voto.getEleitor().getIdEleitor());
			ps.setInt(3, voto.getUrna().getIdUrna());
			ps.setInt(4, voto.getCandidato().getIdCandidato());


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

	public boolean excluir(Voto voto) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idVoto = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, procuraIdPorTodosDados(voto));
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	
	public boolean existe(Voto voto) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE anoVoto = ? AND idEleitor = ? AND idUrna = ? AND idCandidato = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, voto.getAnoVoto());
			ps.setInt(2, voto.getEleitor().getIdEleitor());
			ps.setInt(3, voto.getUrna().getIdUrna());
			ps.setInt(4, voto.getCandidato().getIdCandidato());

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

	public List<Voto> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Voto> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Voto> montarLista(ResultSet rs) {
		List<Voto> listObj = new ArrayList<Voto>();
		try {
			while (rs.next()) {
				Voto obj = new Voto();

				obj.setIdVoto(rs.getInt(1));
				obj.setAnoVoto(rs.getInt(2));
				obj.setEleitor(eleitor.procurarPorId(rs.getInt(3)));
				obj.setUrna(urna.procurarPorId(rs.getInt(4)));
				obj.setCandidato(candidato.procurarPorId(rs.getInt(5)));
				
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
