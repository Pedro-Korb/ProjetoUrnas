package BO;

import java.util.HashMap;
import java.util.List;

import DAO.CandidatoDAO;
import DTO.Candidato;

public class CandidatoBO {

	public boolean inserir(Candidato Candidato){
		if (existe(Candidato) != true) {
			CandidatoDAO CandidatosDAO = new CandidatoDAO();
			return CandidatosDAO.inserir(Candidato);
		}
		return false;
	}
	public boolean alterar(Candidato Candidato){
		CandidatoDAO CandidatosDAO = new CandidatoDAO();
		return CandidatosDAO.alterar(Candidato);
	}
	public boolean excluir(Candidato Candidato){
		CandidatoDAO CandidatosDAO = new CandidatoDAO();
		return CandidatosDAO.excluir(Candidato);
	}

	public boolean existe(Candidato Candidato){
		CandidatoDAO CandidatosDAO = new CandidatoDAO();
		return CandidatosDAO.existe(Candidato);
	}
	public List<Candidato> pesquisarTodos(){
		CandidatoDAO CandidatosDAO = new CandidatoDAO();
		return CandidatosDAO.pesquisarTodos();
	}
	public int procuraIdPorTodosDados(Candidato Candidato) {
		CandidatoDAO CandidatosDAO = new CandidatoDAO();
		return CandidatosDAO.procuraIdPorTodosDados(Candidato);
	}

	public Candidato procurarPorId(int id) {
		CandidatoDAO CandidatosDAO = new CandidatoDAO();
		return CandidatosDAO.procurarPorId(id);
	}
	
	public Candidato buscarCandidatoPorId(int idCandidato) {
		CandidatoDAO CandidatosDAO = new CandidatoDAO();
		return CandidatosDAO.buscarCandidatoPorId(idCandidato);
	}
	
	public HashMap<Candidato, Integer> buscarCandidatosComTotalDeVotos(String cargo) {
		CandidatoDAO CandidatosDAO = new CandidatoDAO();
		return CandidatosDAO.buscarCandidatosComTotalDeVotos(cargo);
	}
}
