package BO;

import java.util.List;

import DAO.VotoDAO;
import DTO.Voto;

public class VotoBO {

	public boolean inserir(Voto voto){
		if (existe(voto) != true) {
			VotoDAO VotosDAO = new VotoDAO();
			return VotosDAO.inserir(voto);
		}
		return false;
	}
	public boolean alterar(Voto voto){
		VotoDAO VotosDAO = new VotoDAO();
		return VotosDAO.alterar(voto);
	}
	public boolean excluir(Voto voto){
		VotoDAO VotosDAO = new VotoDAO();
		return VotosDAO.excluir(voto);
	}

	public boolean existe(Voto voto){
		VotoDAO VotosDAO = new VotoDAO();
		return VotosDAO.existe(voto);
	}
	public List<Voto> pesquisarTodos(){
		VotoDAO VotosDAO = new VotoDAO();
		return VotosDAO.pesquisarTodos();
	}
	public int procuraIdPorTodosDados(Voto voto) {
		VotoDAO VotosDAO = new VotoDAO();
		return VotosDAO.procuraIdPorTodosDados(voto);
	}

	public Voto procurarPorId(int id) {
		VotoDAO VotosDAO = new VotoDAO();
		return VotosDAO.procurarPorId(id);
	}
}
