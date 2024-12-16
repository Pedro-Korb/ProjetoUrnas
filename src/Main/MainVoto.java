package Main;

import BO.VotoBO;

import java.util.ArrayList;

import BO.CandidatoBO;
import BO.EleitorBO;
import BO.UrnaBO;
import DTO.Voto;

import java.util.Random;


public class MainVoto {

	public static void main(String[] args) {

		ArrayList<Voto> votosTotais = new ArrayList<Voto>();

		VotoBO VotoBO = new VotoBO();
		Random random = new Random();
		
		EleitorBO eleiBO = new EleitorBO();
		UrnaBO urnaBO = new UrnaBO();
		CandidatoBO candBO = new CandidatoBO();


		for (int i = 95; i < 105; i++) {
		    int urna = random.nextInt(28); 
		    int gov = random.nextInt(5); 
		    int pres = 5 + random.nextInt(2);

		    Voto votoGov = new Voto(2024,
		            eleiBO.pesquisarTodos().get(i),
		            urnaBO.pesquisarTodos().get(urna),
		            candBO.pesquisarTodos().get(gov));
		    votosTotais.add(votoGov);

		    Voto votoPres = new Voto(2024,
		            eleiBO.pesquisarTodos().get(i),
		            urnaBO.pesquisarTodos().get(urna),
		            candBO.pesquisarTodos().get(pres));
		    votosTotais.add(votoPres);
		}



		for (Voto voto : votosTotais) {
			if (voto.verificaVoto() && VotoBO.inserir(voto))
				System.out.println("Inserido com Sucesso");
			else
				System.out.println("Erro ao Inserir");
		}




	}

}
