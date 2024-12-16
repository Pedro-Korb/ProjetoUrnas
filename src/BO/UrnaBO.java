package BO;

import java.util.List;

import DAO.UrnaDAO;
import DTO.Urna;

public class UrnaBO {
	
	public boolean inserir(Urna Urna){
		if (existe(Urna) != true) {
			UrnaDAO UrnasDAO = new UrnaDAO();
			return UrnasDAO.inserir(Urna);
		}
		return false;
	}
	public boolean alterar(Urna Urna){
		UrnaDAO UrnasDAO = new UrnaDAO();
		return UrnasDAO.alterar(Urna);
	}
	public boolean excluir(Urna Urna){
		UrnaDAO UrnasDAO = new UrnaDAO();
		return UrnasDAO.excluir(Urna);
	}

	public boolean existe(Urna Urna){
		UrnaDAO UrnasDAO = new UrnaDAO();
		return UrnasDAO.existe(Urna);
	}
	public List<Urna> pesquisarTodos(){
		UrnaDAO UrnasDAO = new UrnaDAO();
		return UrnasDAO.pesquisarTodos();
	}
	public int procuraIdPorNumero(Urna Urna) {
		UrnaDAO UrnasDAO = new UrnaDAO();
		return UrnasDAO.procuraIdPorTodosDados(Urna);
	}

}
