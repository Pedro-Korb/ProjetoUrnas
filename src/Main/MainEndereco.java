package Main;

import java.util.ArrayList;
import java.util.List;

import BO.EnderecoBO;
import DTO.Endereco;

public class MainEndereco {
	public static void main(String[] args) {

		EnderecoBO EnderecoBO = new EnderecoBO();
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

		/*
		//SUDESTE
		Endereco end = new Endereco("BRA", "SP", "SÃO PAULO", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "SP", "CAMPINAS", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "RJ", "RIO DE JANEIRO", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "RJ", "NITERÓI", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "MG", "BELO HORIZONTE", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "MG", "UBERLÂNDIA", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "ES", "VITÓRIA", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "ES", "VILA VELHA", 1, 1);
		enderecos.add(end);




		// NORDESTE
		end = new Endereco("BRA", "MA", "SÃO LUÍS", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "MA", "IMPERATRIZ", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "PI", "TERESINA", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "PI", "PARNAÍBA", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "CE", "FORTALEZA", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "CE", "JUAZEIRO DO NORTE", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "RN", "NATAL", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "RN", "MOSSORÓ", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "PB", "JOÃO PESSOA", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "PB", "CAMPINA GRANDE", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "PE", "RECIFE", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "PE", "CARUARU", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "AL", "MACEIÓ", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "AL", "ARAPIRACA", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "SE", "ARACAJU", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "SE", "NOSSA SENHORA DO SOCORRO", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "BA", "SALVADOR", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "BA", "FEIRA DE SANTANA", 1, 1);
		enderecos.add(end);




		//SUL
		end = new Endereco("BRA", "PR", "CURITIBA", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "PR", "LONDRINA", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "SC", "FLORIANÓPOLIS", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "SC", "JOINVILLE", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "RS", "PORTO ALEGRE", 1, 1);
		 enderecos.add(end);
		end = new Endereco("BRA", "RS", "CAXIAS DO SUL", 1, 1);
		enderecos.add(end);




		//CENTRO OESTE
		end = new Endereco("BRA", "MT", "CUIABÁ", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "MT", "VÁRZEA GRANDE", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "MS", "CAMPO GRANDE", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "MS", "DOURADOS", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "GO", "GOIÂNIA", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "GO", "ANÁPOLIS", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "DF", "BRASÍLIA", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "DF", "TAGUATINGA", 1, 1);
		enderecos.add(end);




		//NORTE
		end = new Endereco("BRA", "AC", "RIO BRANCO", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "AC", "CRUZEIRO DO SUL", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "AP", "MACAPÁ", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "AP", "SANTANA", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "AM", "MANAUS", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "AM", "ITACOATIARA", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "PA", "BELÉM", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "PA", "SANTARÉM", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "RO", "PORTO VELHO", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "RO", "JI-PARANÁ", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "RR", "BOA VISTA", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "RR", "RORAIMA", 1, 1);
		enderecos.add(end);

		end = new Endereco("BRA", "TO", "PALMAS", 1, 1);
		enderecos.add(end);
		end = new Endereco("BRA", "TO", "ARAGUAÍNA", 1, 1);
		enderecos.add(end);
		*/
		
		Endereco end1 = new Endereco("BRA", "SC", "FLORIANÓPOLIS", 1, 1);
		enderecos.add(end1);

		Endereco end2 = new Endereco("BRA", "SC", "JOINVILLE", 1, 1);
		enderecos.add(end2);

		Endereco end3 = new Endereco("BRA", "SC", "BLUMENAU", 1, 1);
		enderecos.add(end3);

		Endereco end4 = new Endereco("BRA", "SC", "CHAPECÓ", 1, 1);
		enderecos.add(end4);

		Endereco end5 = new Endereco("BRA", "SC", "CRICIÚMA", 1, 1);
		enderecos.add(end5);

		Endereco end6 = new Endereco("BRA", "SC", "BRUSQUE", 1, 1);
		enderecos.add(end6);

		Endereco end7 = new Endereco("BRA", "SC", "LAGES", 1, 1);
		enderecos.add(end7);

		Endereco end8 = new Endereco("BRA", "SC", "TUBARÃO", 1, 1);
		enderecos.add(end8);

		Endereco end9 = new Endereco("BRA", "SC", "SÃO JOSÉ", 1, 1);
		enderecos.add(end9);

		Endereco end10 = new Endereco("BRA", "SC", "PALHOÇA", 1, 1);
		enderecos.add(end10);

		Endereco end11 = new Endereco("BRA", "SC", "NOVA TRÊS GARÇAS", 1, 1);
		enderecos.add(end11);

		Endereco end12 = new Endereco("BRA", "SC", "XANXERÊ", 1, 1);
		enderecos.add(end12);

		Endereco end13 = new Endereco("BRA", "SC", "BOM JARDIM DA SERRA", 1, 1);
		enderecos.add(end13);

		Endereco end14 = new Endereco("BRA", "SC", "POMERODE", 1, 1);
		enderecos.add(end14);

		Endereco end15 = new Endereco("BRA", "SC", "SÃO FRANCISCO DO SUL", 1, 1);
		enderecos.add(end15);

		Endereco end16 = new Endereco("BRA", "SC", "MAFRA", 1, 1);
		enderecos.add(end16);

		Endereco end17 = new Endereco("BRA", "SC", "GAROPABA", 1, 1);
		enderecos.add(end17);

		Endereco end18 = new Endereco("BRA", "SC", "CRICIÚMA", 1, 1);
		enderecos.add(end18);

		Endereco end19 = new Endereco("BRA", "SC", "DIONÍSIO CERQUEIRA", 1, 1);
		enderecos.add(end19);

		Endereco end20 = new Endereco("BRA", "SC", "SÃO BENTO DO SUL", 1, 1);
		enderecos.add(end20);

		Endereco end21 = new Endereco("BRA", "SC", "LAGUNA", 1, 1);
		enderecos.add(end21);

		Endereco end22 = new Endereco("BRA", "SC", "BRUSQUE", 1, 1);
		enderecos.add(end22);

		Endereco end23 = new Endereco("BRA", "SC", "ALFREDO WAGNER", 1, 1);
		enderecos.add(end23);

		Endereco end24 = new Endereco("BRA", "SC", "RIO DO SUL", 1, 1);
		enderecos.add(end24);

		Endereco end25 = new Endereco("BRA", "SC", "SÃO MIGUEL DO OESTE", 1, 1);
		enderecos.add(end25);

		Endereco end26 = new Endereco("BRA", "SC", "CAMPO ALEGRE", 1, 1);
		enderecos.add(end26);

		Endereco end27 = new Endereco("BRA", "SC", "BOCAINA DO SUL", 1, 1);
		enderecos.add(end27);

		Endereco end28 = new Endereco("BRA", "SC", "PORTO BELO", 1, 1);
		enderecos.add(end28);

		Endereco end29 = new Endereco("BRA", "SC", "URUSSANGA", 1, 1);
		enderecos.add(end29);

		Endereco end30 = new Endereco("BRA", "SC", "ANTÔNIO CARLOS", 1, 1);
		enderecos.add(end30);


		System.out.println();
		
		for (Endereco endereco : enderecos) {
			System.out.println(endereco);
			if (EnderecoBO.inserir(endereco))
				System.out.println("Inserido com Sucesso");
			else
				System.out.println("Erro ao Inserir");
		}

		List<Endereco> values = EnderecoBO.pesquisarTodos();
		for (Endereco endereco : values) {
			System.out.println(endereco);
		}
	}

}
