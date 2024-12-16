package DTO;

public class Endereco {
	
	private int idEndereco;
	private String pais;
	private String estado;
	private String cidade;
	private int zonaEleitoral;
	private int sessaoEleitoral;
	
	
	public Endereco() {
		
	}
	
	public Endereco(String pais, String estado, String cidade, int zonaEleitoral, int sessaoEleitoral) {
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.zonaEleitoral = zonaEleitoral;
		this.sessaoEleitoral = sessaoEleitoral;
	}
	
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getZonaEleitoral() {
		return zonaEleitoral;
	}
	public void setZonaEleitoral(int zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}
	public int getSessaoEleitoral() {
		return sessaoEleitoral;
	}
	public void setSessaoEleitoral(int sessaoEleitoral) {
		this.sessaoEleitoral = sessaoEleitoral;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [idEndereco=");
		builder.append(idEndereco);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append(", zonaEleitoral=");
		builder.append(zonaEleitoral);
		builder.append(", sessaoEleitoral=");
		builder.append(sessaoEleitoral);
		builder.append("]");
		return builder.toString();
	}
}
