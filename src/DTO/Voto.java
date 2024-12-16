package DTO;

public class Voto {

	private int idVoto;
	private int anoVoto;
	protected Eleitor eleitor;
	protected Candidato candidato;
	protected Urna urna;

	public Voto() {

	}

	public Voto(int anoVoto, Eleitor eleitor, Urna urna, Candidato candidato) {
		this.anoVoto = anoVoto;
		this.eleitor = eleitor;
		this.candidato = candidato;
		this.urna = urna;
	}


	public boolean verificaVoto() {

		if (candidato.getCargoPolitico().equalsIgnoreCase("GOVERNADOR")) {
			if ((!candidato.getEndereco().getEstado().equalsIgnoreCase(eleitor.getEndereco().getEstado()))) {
				return false;
			}
		}

		return true;
	}


	public int getIdVoto() {
		return idVoto;
	}

	public void setIdVoto(int idVoto) {
		this.idVoto = idVoto;
	}

	public int getAnoVoto() {
		return anoVoto;
	}

	public void setAnoVoto(int ano) {
		this.anoVoto = ano;
	}

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Urna getUrna() {
		return urna;
	}

	public void setUrna(Urna urna) {
		this.urna = urna;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Voto [idVoto=");
		builder.append(idVoto);
		builder.append(", anoVoto=");
		builder.append(anoVoto);
		builder.append(", eleitor=");
		builder.append(eleitor);
		builder.append(", candidato=");
		builder.append(candidato);
		builder.append(", urna=");
		builder.append(urna);
		builder.append("]");
		return builder.toString();
	}

}
