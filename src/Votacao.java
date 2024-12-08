package Model;


public class Votacao {
	
	protected CandidatoPresidencia votoPresidente;
	protected CandidatoGovernador votoGovernador;
	protected CidadaoVotante cidadao;
	
	
	public void votacao(CandidatoPresidencia votoPresidente, CandidatoGovernador votoGovernador, CidadaoVotante cidadao) {
		
		this.votoPresidente = votoPresidente;
		this.votoGovernador = votoGovernador;
		this.cidadao = cidadao; 
	}


	public CandidatoPresidencia getVotoPresidente() {
		return votoPresidente;
	}


	public void setVotoPresidente(CandidatoPresidencia votoPresidente) {
		this.votoPresidente = votoPresidente;
	}


	public CandidatoGovernador getVotoGovernador() {
		return votoGovernador;
	}


	public void setVotoGovernador(CandidatoGovernador votoGovernador) {
		this.votoGovernador = votoGovernador;
	}


	public CidadaoVotante getCidadao() {
		return cidadao;
	}


	public void setCidadao(CidadaoVotante cidadao) {
		this.cidadao = cidadao;
	}
}
