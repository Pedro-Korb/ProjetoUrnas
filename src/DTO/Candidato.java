package DTO;

public class Candidato extends Pessoa{
	
	private int idCandidato;
	protected Partido partido;
	private String cargoPolitico;
	private int numero;
	private String apelido;
	private String vice;

	public Candidato() {
		
	}
	
	public Candidato(String cargoPolitico, int numero, String apelido, String vice, Partido partido, Pessoa p) {
		super(p.getEndereco(), p.getNome(), p.getIdade(), p.getCpf(), p.getSexo());
		this.setIdPessoa(p.getIdPessoa());
		this.partido = partido;
		this.cargoPolitico = cargoPolitico;
		this.numero = numero;
		this.apelido = apelido;
		this.vice = vice;
	}
	
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public String getCargoPolitico() {
		return cargoPolitico;
	}
	public void setCargoPolitico(String cargoPolitico) {
		this.cargoPolitico = cargoPolitico;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getVice() {
		return vice;
	}
	public void setVice(String nomeVice) {
		this.vice = nomeVice;
	}
	public int getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Candidato [idCandidato=");
		builder.append(idCandidato);
		builder.append(", partido=");
		builder.append(partido);
		builder.append(", cargoPolitico=");
		builder.append(cargoPolitico);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", apelido=");
		builder.append(apelido);
		builder.append(", vice=");
		builder.append(vice);
		builder.append("]");
		return builder.toString();
	}
}
