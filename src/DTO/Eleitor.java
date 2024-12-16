package DTO;

public class Eleitor extends Pessoa {
	
	private int idEleitor;
	private String numeroTitulo;
	
	public Eleitor() {
		
	}
	
	public Eleitor(String numeroTitulo, Pessoa p) {
		super(p.getEndereco(), p.getNome(), p.getIdade(), p.getCpf(), p.getSexo());
		this.setIdPessoa(p.getIdPessoa());
		this.numeroTitulo = numeroTitulo;
	}

	public String getNumeroTitulo() {
		return numeroTitulo;
	}
	
	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}

	public int getIdEleitor() {
		return idEleitor;
	}

	public void setIdEleitor(int idEleitor) {
		this.idEleitor = idEleitor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Eleitor [idEleitor=");
		builder.append(idEleitor);
		builder.append(", numeroTitulo=");
		builder.append(numeroTitulo);
		builder.append("]");
		return builder.toString();
	}
}
