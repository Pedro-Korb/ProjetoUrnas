package Main;

import java.util.ArrayList;

import BO.CandidatoBO;
import BO.PartidoBO;
import BO.PessoaBO;
import DTO.Candidato;
import DTO.Partido;
import DTO.Pessoa;

public class MainCandidato {

	public static void main(String[] args) {


		CandidatoBO candidatoBO = new CandidatoBO();

		PessoaBO pesBO = new PessoaBO();
		PartidoBO parBO = new PartidoBO();


		ArrayList<Candidato> candidatos = new ArrayList<Candidato>();


		Pessoa pes1 = pesBO.pesquisarTodos().get(1);
		Partido par1 = parBO.pesquisarTodos().get(0);
		Candidato cand = new Candidato("GOVERNADOR", 10, "Carlos Alberto Mendes", "Binho", par1, pes1);
		candidatos.add(cand);

		Pessoa pes2 = pesBO.pesquisarTodos().get(3);
		Partido par2 = parBO.pesquisarTodos().get(1);
		cand = new Candidato("GOVERNADOR", 20, "José Roberto Lima", "Tuca", par2, pes2);
		candidatos.add(cand);

		Pessoa pes3 = pesBO.pesquisarTodos().get(5);
		Partido par3 = parBO.pesquisarTodos().get(2);
		cand = new Candidato("GOVERNADOR", 30, "Lucas Pereira", "Guga", par3, pes3);
		candidatos.add(cand);

		Pessoa pes4 = pesBO.pesquisarTodos().get(7);
		Partido par4 = parBO.pesquisarTodos().get(3);
		cand = new Candidato("GOVERNADOR", 40, "Gustavo Almeida", "Cris", par4, pes4);
		candidatos.add(cand);

		Pessoa pes5 = pesBO.pesquisarTodos().get(9);
		Partido par5 = parBO.pesquisarTodos().get(4);
		cand = new Candidato("GOVERNADOR", 50, "Tiago Ferreira", "Neto", par5, pes5);
		candidatos.add(cand);


		//PRESIDENTE
		Pessoa pes6 = pesBO.pesquisarTodos().get(11);
		Partido par6 = parBO.pesquisarTodos().get(5);
		cand = new Candidato("PRESIDENTE", 50, "Felipe Costa", "Neto", par6, pes6);
		candidatos.add(cand);

		Pessoa pes7 = pesBO.pesquisarTodos().get(13);
		Partido par7 = parBO.pesquisarTodos().get(6);
		cand = new Candidato("PRESIDENTE", 50, "Ricardo Rocha", "Alemao", par7, pes7);
		candidatos.add(cand);

		
		for (Candidato candidato : candidatos) {
			if (candidatoBO.inserir(candidato))
				System.out.println("Inserido com Sucesso");
			else
				System.out.println("Erro ao Inserir");
		}


		System.out.println(cand);
	}

}
