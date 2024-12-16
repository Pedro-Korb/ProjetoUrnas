package DTO;

public class Partido {
	
	private int idPartido;
	private int numero;
	private String nomePartido;
	private String siglaPartido;
	
	public Partido() {
		
	}
	public Partido(int numero, String nomePartido, String siglaPartido) {
		this.numero = numero; 
		this.nomePartido = nomePartido;
		this.siglaPartido = siglaPartido;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomePartido() {
		return nomePartido;
	}
	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}
	public String getSiglaPartido() {
		return siglaPartido;
	}
	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}
	public int getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Partido [idPartido=");
		builder.append(idPartido);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", nomePartido=");
		builder.append(nomePartido);
		builder.append(", siglaPartido=");
		builder.append(siglaPartido);
		builder.append("]");
		return builder.toString();
	}
}
