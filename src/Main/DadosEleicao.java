package Main;


import java.util.ArrayList;
import java.util.HashMap;

import BO.CandidatoBO;
import BO.EleitorBO;
import DTO.Candidato;


public class DadosEleicao {
	public static void main(String[] args) {

		CandidatoBO candidatoBO = new CandidatoBO();
		EleitorBO eleitorBO = new EleitorBO();

		System.err.println("\r\r    DADOS DA ELEICAO - SANTA CATARINA");
		System.out.println("\r\r\r");
		
		int maior = 0;
		String CandidatoMaisVotos = "";
		System.err.println("----------VOTOS PARA GOVERNADOR----------");
		System.out.println();
		HashMap<Candidato, Integer> votosGovernadores = candidatoBO.buscarCandidatosComTotalDeVotos("GOVERNADOR");

		for (HashMap.Entry<Candidato, Integer> entry : votosGovernadores.entrySet()) {
			Candidato candidato = entry.getKey();
			Integer totalVotos = entry.getValue();
			if (totalVotos > maior) {
				maior = totalVotos;
				CandidatoMaisVotos = candidato.getApelido();
			}


			System.out.println("\t" + candidato.getApelido());
			System.out.print("\tVOTOS " + totalVotos);
			System.out.println("\r");
		}
		System.out.println("GOVERNADOR ELEITO: \r" + CandidatoMaisVotos + "\rVOTOS - " + maior);
		System.out.println();



		int maiorVotoPresidente = 0;
		String CandidatoPresidenteMaisVotos = "";
		System.err.println("----------VOTOS PARA PRESIDENTE----------");
		System.out.println();
		HashMap<Candidato, Integer> votosPresidentes = candidatoBO.buscarCandidatosComTotalDeVotos("PRESIDENTE");
		for (HashMap.Entry<Candidato, Integer> entry : votosPresidentes.entrySet()) {
			Candidato candidato = entry.getKey();
			Integer totalVotos = entry.getValue();

			if (totalVotos > maiorVotoPresidente) {
				maiorVotoPresidente = totalVotos;
				CandidatoPresidenteMaisVotos = candidato.getApelido();
			}

			System.out.println("\t" + candidato.getApelido());
			System.out.print("\tVOTOS\t" + totalVotos);
			System.out.println("\r");
		}
		System.out.println("PRESIDENTE ELEITO: \r" + CandidatoPresidenteMaisVotos + "\rVOTOS - " + maiorVotoPresidente);
		
		System.out.println();
		System.out.println();
		System.err.println("------------LISTA DE ELEITORES-----------");
		System.out.println();

		ArrayList<String> nomes = eleitorBO.pesquisarNomesEleitores();
		for (String nome : nomes) {
			System.out.println("\t" + nome);
		}
	}

	}
