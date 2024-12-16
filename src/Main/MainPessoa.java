package Main;

import java.util.ArrayList;

import BO.EnderecoBO;
import BO.PessoaBO;
import DTO.Pessoa;


public class MainPessoa {
	public static void main(String[] args) {

		PessoaBO pesBO = new PessoaBO();
		EnderecoBO endBO = new EnderecoBO();

		ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();

		
		Pessoa pes = new Pessoa(endBO.procurarPorId(65), "Ana Clara Silva", 29, "123.456.789-01", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(65), "Carlos Alberto Mendes", 35, "234.567.890-12", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(65), "Maria Fernanda Costa", 22, "345.678.901-23", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(65), "José Roberto Lima", 30, "456.789.012-34", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(66), "Juliana Rodrigues", 27, "567.890.123-45", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(66), "Lucas Pereira", 31, "678.901.234-56", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(66), "Tatiane Santos", 24, "789.012.345-67", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(66), "Gustavo Almeida", 26, "890.123.456-78", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(67), "Fernanda Oliveira", 33, "901.234.567-89", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(67), "Tiago Ferreira", 28, "012.345.678-90", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(67), "Sofia Lima", 25, "123.098.765-43", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(67), "Felipe Costa", 34, "234.109.876-54", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(68), "Clara Mendes", 29, "345.210.987-65", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(68), "Ricardo Rocha", 38, "456.321.098-76", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(68), "Bruna Santos", 32, "567.432.109-87", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(68), "André Dias", 36, "678.543.210-98", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(69), "Larissa Almeida", 21, "789.654.321-09", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(69), "Samuel Nascimento", 27, "890.765.432-10", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(69), "Natália Martins", 30, "901.876.543-21", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(69), "Vinícius Teixeira", 26, "012.987.654-32", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(70), "Roberta Silva", 29, "987.654.321-00", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(70), "Eduardo Santos", 33, "876.543.210-11", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(70), "Daniele Almeida", 25, "765.432.109-22", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(70), "Guilherme Ferreira", 31, "654.321.098-33", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(71), "Luciana Oliveira", 27, "543.210.987-44", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(71), "Fernando Nascimento", 34, "432.109.876-55", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(71), "Mariana Costa", 22, "321.098.765-66", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(71), "Thiago Lopes", 29, "210.987.654-77", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(72), "Tatiane Rocha", 32, "109.876.543-88", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(72), "Jorge Alves", 36, "098.765.432-99", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(72), "Claudia Santos", 31, "876.543.219-11", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(72), "Mateus Lima", 28, "765.432.109-22", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(73), "Vanessa Martins", 24, "654.321.098-33", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(73), "Rafael Costa", 33, "543.210.987-44", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(73), "Fernanda Alves", 29, "432.109.876-55", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(73), "Bruno Dias", 35, "321.098.765-66", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(74), "Aline Ferreira", 26, "210.987.654-77", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(74), "Leonardo Rocha", 30, "109.876.543-88", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(74), "Sabrina Nascimento", 23, "098.765.432-99", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(74), "Gustavo Lima", 34, "987.654.321-00", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(75), "Camila Sousa", 28, "876.543.210-11", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(75), "Carlos Eduardo", 29, "765.432.109-22", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(75), "Ana Paula", 32, "654.321.098-33", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(75), "Roberto Alves", 26, "543.210.987-44", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(76), "Patrícia Lima", 27, "432.109.876-55", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(76), "Felipe Martins", 31, "321.098.765-66", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(76), "Juliana Pereira", 25, "210.987.654-77", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(76), "Thiago Rocha", 30, "109.876.543-88", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(77), "Fernanda Costa", 29, "098.765.432-99", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(77), "André Nascimento", 33, "987.654.321-00", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(77), "Luciana Santos", 24, "876.543.210-11", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(77), "Victor Ferreira", 36, "765.432.109-22", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(78), "Monique Almeida", 31, "654.321.098-33", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(78), "Marcelo Lima", 28, "543.210.987-44", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(78), "Cláudia Rocha", 22, "432.109.876-55", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(78), "Guilherme Costa", 35, "321.098.765-66", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(79), "Danielle Martins", 26, "210.987.654-77", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(79), "Rafael Almeida", 34, "109.876.543-88", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(79), "Isabella Ferreira", 30, "098.765.432-99", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(79), "Leonardo Mendes", 29, "987.654.321-00", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(80), "Larissa Santos", 27, "876.543.210-11", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(80), "Bruno Teixeira", 32, "765.432.109-22", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(80), "Marta Oliveira", 35, "654.321.098-33", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(80), "Fábio Alves", 26, "543.210.987-44", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(81), "Cíntia Almeida", 24, "432.109.876-55", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(81), "Gabriel Costa", 29, "321.098.765-66", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(81), "Priscila Rocha", 31, "210.987.654-77", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(81), "Marcos Lima", 30, "109.876.543-88", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(82), "Tatiane Ferreira", 26, "098.765.432-99", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(82), "Renato Almeida", 34, "987.654.321-00", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(82), "Simone Nascimento", 29, "876.543.210-11", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(82), "Paulo Henrique", 33, "765.432.109-22", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(83), "Débora Martins", 22, "654.321.098-33", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(83), "Tiago Souza", 28, "543.210.987-44", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(83), "Rafaela Costa", 32, "432.109.876-55", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(83), "Marcelo Teixeira", 35, "321.098.765-66", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(84), "Samantha Lima", 30, "210.987.654-77", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(84), "Jorge Santos", 29, "109.876.543-88", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(84), "Gabriela Almeida", 26, "098.765.432-99", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(84), "Anderson Ferreira", 32, "987.654.321-00", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(85), "Lívia Martins", 28, "876.543.210-11", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(85), "Fernando Nascimento", 34, "765.432.109-22", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(85), "Carla Santos", 30, "654.321.098-33", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(85), "Eduardo Lima", 29, "543.210.987-44", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(86), "Vanessa Rocha", 22, "432.109.876-55", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(86), "Bruno Alves", 31, "321.098.765-66", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(86), "Elaine Ferreira", 25, "210.987.654-77", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(86), "Carlos Eduardo", 27, "109.876.543-88", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(87), "Patrícia Almeida", 35, "098.765.432-99", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(87), "Roberto Costa", 28, "987.654.321-00", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(87), "Juliana Santos", 29, "876.543.210-11", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(87), "Fábio Rocha", 32, "765.432.109-22", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(88), "Miriam Nascimento", 33, "654.321.098-33", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(88), "Gustavo Lima", 26, "543.210.987-44", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(88), "Natália Ferreira", 31, "432.109.876-55", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(88), "Rafael Almeida", 30, "321.098.765-66", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(89), "Sabrina Martins", 24, "210.987.654-77", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(89), "Leonardo Santos", 36, "109.876.543-88", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(89), "Isabela Lima", 25, "098.765.432-99", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(89), "Thiago Teixeira", 29, "987.654.321-00", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(90), "Luciana Ferreira", 31, "876.543.210-11", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(90), "Diego Almeida", 28, "765.432.109-22", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(90), "Camila Santos", 27, "654.321.098-33", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(90), "Rogério Costa", 34, "543.210.987-44", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(91), "Fernanda Lima", 29, "432.109.876-55", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(91), "André Nascimento", 32, "321.098.765-66", "M");
		pessoa.add(pes);

		pes = new Pessoa(endBO.procurarPorId(92), "Isabela Lima", 25, "098.765.432-99", "F");
		pessoa.add(pes);
		pes = new Pessoa(endBO.procurarPorId(92), "Thiago Teixeira", 29, "987.654.321-00", "M");
		pessoa.add(pes);



		for (Pessoa pess: pessoa) {
			if (pesBO.inserir(pess))
				System.out.println("Inserido com Sucesso");
			else
				System.out.println("Erro ao Inserir");
		}



		System.out.println();
		System.out.println();

		for (Pessoa p : pesBO.pesquisarTodos()) {
			System.out.println(p);

		}



	}

}
