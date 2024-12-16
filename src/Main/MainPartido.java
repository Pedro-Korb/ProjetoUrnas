package Main;

import BO.PartidoBO;
import DTO.Partido;

public class MainPartido {
	public static void main(String[] args) {


		PartidoBO PartidoBO = new PartidoBO();

		Partido partido = new Partido(15, "Movimento Democrático Brasileiro", "MDB");
		if (PartidoBO.inserir(partido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");


		partido = new Partido(11, "Progressistas", "PP");
		if (PartidoBO.inserir(partido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");


		partido = new Partido(45, "Partido da Social Democracia Brasileira", "PSDB");
		if (PartidoBO.inserir(partido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");

		partido = new Partido(20, "Partido Verde", "PV");
		if (PartidoBO.inserir(partido))
			System.out.println("Inserido com Sucesso: " + partido);
		else
			System.out.println("Erro ao Inserir: " + partido);


		partido = new Partido(30, "Partido dos Trabalhadores", "PT");
		if (PartidoBO.inserir(partido))
			System.out.println("Inserido com Sucesso: " + partido);
		else
			System.out.println("Erro ao Inserir: " + partido);


		partido = new Partido(40, "Partido Comunista do Brasil", "PCdoB");
		if (PartidoBO.inserir(partido))
			System.out.println("Inserido com Sucesso: " + partido);
		else
			System.out.println("Erro ao Inserir: " + partido);


		partido = new Partido(50, "Solidariedade", "SD");
		if (PartidoBO.inserir(partido))
			System.out.println("Inserido com Sucesso: " + partido);
		else
			System.out.println("Erro ao Inserir: " + partido);


		partido = new Partido(60, "Rede Sustentabilidade", "REDE");
		if (PartidoBO.inserir(partido))
			System.out.println("Inserido com Sucesso: " + partido);
		else
			System.out.println("Erro ao Inserir: " + partido);


		partido = new Partido(70, "Cidadania", "CIDADANIA");
		if (PartidoBO.inserir(partido))
			System.out.println("Inserido com Sucesso: " + partido);
		else
			System.out.println("Erro ao Inserir: " + partido);

	}
}