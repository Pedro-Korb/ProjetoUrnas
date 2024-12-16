package DTO;

public class Urna {
	
	private int idUrna;
	private String cidade;
	private int zonaEleitoral;
	private int sessaoEleitoral;
	
	public Urna() {
		
	}
	public Urna(String cidade, int zonaEleitoral, int sessaoEleitoral) {
		this.cidade = cidade;
		this.zonaEleitoral = zonaEleitoral;
		this.sessaoEleitoral = sessaoEleitoral;
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
	public int getIdUrna() {
		return idUrna;
	}
	public void setIdUrna(int idUrna) {
		this.idUrna = idUrna;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Urna [idUrna=");
		builder.append(idUrna);
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
