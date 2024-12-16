package BO;


import java.util.List;
import DAO.PartidoDAO;
import DTO.Partido;

public class PartidoBO {

	public boolean inserir(Partido partido){
		if (existe(partido) != true) {
			PartidoDAO partidosDAO = new PartidoDAO();
			return partidosDAO.inserir(partido);
		}
		return false;
	}
	public boolean alterar(Partido partido){
		PartidoDAO partidosDAO = new PartidoDAO();
		return partidosDAO.alterar(partido);
	}
	public boolean excluir(Partido partido){
		PartidoDAO partidosDAO = new PartidoDAO();
		return partidosDAO.excluir(partido);
	}
	public Partido procurarPorCodigo(Partido partido){
		PartidoDAO partidosDAO = new PartidoDAO();
		return partidosDAO.procurarPorCodigo(partido);
	}
	public Partido procurarPorDescricao(Partido partido){
		PartidoDAO partidosDAO = new PartidoDAO();
		return partidosDAO.procurarPorDescricao(partido);
	}
	public boolean existe(Partido partido){
		PartidoDAO partidosDAO = new PartidoDAO();
		return partidosDAO.existe(partido);
	}
	public List<Partido> pesquisarTodos(){
		PartidoDAO partidosDAO = new PartidoDAO();
		return partidosDAO.pesquisarTodos();
	}
	public int procuraIdPorNumero(Partido partido) {
		PartidoDAO partidosDAO = new PartidoDAO();
		return partidosDAO.procuraIdPorNumero(partido);
	}
}

