package BO;

import java.util.ArrayList;
import java.util.List;

import DAO.EleitorDAO;
import DTO.Eleitor;

public class EleitorBO {

	
	
	public boolean inserir(Eleitor eleitor){
		if (existe(eleitor) != true) {
			EleitorDAO EleitorsDAO = new EleitorDAO();
			return EleitorsDAO.inserir(eleitor);
		}
		return false;
	}
	public boolean alterar(Eleitor eleitor){
		EleitorDAO EleitorsDAO = new EleitorDAO();
		return EleitorsDAO.alterar(eleitor);
	}
	public boolean excluir(Eleitor eleitor){
		EleitorDAO EleitorsDAO = new EleitorDAO();
		return EleitorsDAO.excluir(eleitor);
	}
	public boolean existe(Eleitor eleitor){
		EleitorDAO EleitorsDAO = new EleitorDAO();
		return EleitorsDAO.existe(eleitor);
	}
	public List<Eleitor> pesquisarTodos(){
		EleitorDAO EleitorsDAO = new EleitorDAO();
		return EleitorsDAO.pesquisarTodos();
	}
	public int procuraIdPorTodosDados(Eleitor eleitor) {
		EleitorDAO EleitorsDAO = new EleitorDAO();
		return EleitorsDAO.procuraIdPorTodosDados(eleitor);
	}

	public Eleitor procurarPorId(int id) {
		EleitorDAO EleitorsDAO = new EleitorDAO();
		return EleitorsDAO.procurarPorId(id);
	}
	
	public ArrayList<String> pesquisarNomesEleitores() {
		EleitorDAO EleitorsDAO = new EleitorDAO();
		return (ArrayList<String>) EleitorsDAO.pesquisarNomesEleitores();
	}
}
