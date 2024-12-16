package BO;

import java.util.List;

import DAO.PessoaDAO;
import DTO.Pessoa;

public class PessoaBO {
	
	public boolean inserir(Pessoa Pessoa){
		if (existe(Pessoa) != true) {
			PessoaDAO PessoasDAO = new PessoaDAO();
			return PessoasDAO.inserir(Pessoa);
		}
		return false;
	}
	public boolean alterar(Pessoa Pessoa){
		PessoaDAO PessoasDAO = new PessoaDAO();
		return PessoasDAO.alterar(Pessoa);
	}
	public boolean excluir(Pessoa Pessoa){
		PessoaDAO PessoasDAO = new PessoaDAO();
		return PessoasDAO.excluir(Pessoa);
	}

	public boolean existe(Pessoa Pessoa){
		PessoaDAO PessoasDAO = new PessoaDAO();
		return PessoasDAO.existe(Pessoa);
	}
	public List<Pessoa> pesquisarTodos(){
		PessoaDAO PessoasDAO = new PessoaDAO();
		return PessoasDAO.pesquisarTodos();
	}
	public int procuraIdPorTodosDados(Pessoa Pessoa) {
		PessoaDAO PessoasDAO = new PessoaDAO();
		return PessoasDAO.procuraIdPorTodosDados(Pessoa);
	}
	
	public Pessoa procurarPorId(int id) {
		PessoaDAO PessoasDAO = new PessoaDAO();
		return PessoasDAO.procurarPorId(id);
	}


}
