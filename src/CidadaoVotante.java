package Model;

public class CidadaoVotante extends Pessoa{

	private String estado;
	private int numeroTitulo;
	private int secao;
	private int zona;
	
	public CidadaoVotante(String nome, String dataNascimento, String cpf, String sexo, String estado, int numeroTitulo, int secao, int zona) {
		super(nome, dataNascimento, cpf, sexo);
		this.estado = estado;
		this.numeroTitulo = numeroTitulo;
		this.secao = secao;
		this.zona = zona;
	}

	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumeroTitulo() {
		return numeroTitulo;
	}

	public void setNumeroTitulo(int numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}

	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}
}
