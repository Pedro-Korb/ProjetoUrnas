package Model;

public class Candidato{
	
	protected Pessoa dadosPessoa;
	protected Partido partido;
	private int numero;
	private String apelido;
	
	
	public Pessoa getDadosPessoa() {
		return dadosPessoa;
	}
	public void setDadosPessoa(Pessoa dadosPessoa) {
		this.dadosPessoa = dadosPessoa;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
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

}
