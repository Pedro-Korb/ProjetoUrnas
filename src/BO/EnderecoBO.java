package BO;

import java.util.List;

import DAO.EnderecoDAO;
import DTO.Endereco;

public class EnderecoBO {
	
	public boolean inserir(Endereco Endereco){
		if (existe(Endereco) != true) {
			EnderecoDAO EnderecoDAO = new EnderecoDAO();
			return EnderecoDAO.inserir(Endereco);
		}
		return false;
	}
	public boolean alterar(Endereco Endereco){
		EnderecoDAO EnderecoDAO = new EnderecoDAO();
		return EnderecoDAO.alterar(Endereco);
	}
	
	public int procuraIdPorTodosDados(Endereco Endereco){
		EnderecoDAO EnderecoDAO = new EnderecoDAO();
		return EnderecoDAO.procuraIdPorTodosDados(Endereco);
	}
	public boolean excluir(Endereco Endereco){
		EnderecoDAO EnderecoDAO = new EnderecoDAO();
		return EnderecoDAO.excluir(Endereco);
	}
	public boolean existe(Endereco Endereco){
		EnderecoDAO EnderecoDAO = new EnderecoDAO();
		return EnderecoDAO.existe(Endereco);
	}
	
	public List<Endereco> pesquisarTodos(){
		EnderecoDAO EnderecoDAO = new EnderecoDAO();
		return EnderecoDAO.pesquisarTodos();
	}
	
	public Endereco procurarPorId(int id){
		EnderecoDAO EnderecoDAO = new EnderecoDAO();
		return EnderecoDAO.procurarPorId(id);
	}
}
