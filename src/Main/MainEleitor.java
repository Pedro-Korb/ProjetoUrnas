package Main;

import java.util.ArrayList;
import java.util.List;

import BO.EleitorBO;
import BO.PessoaBO;
import DTO.Eleitor;
import DTO.Pessoa;

public class MainEleitor {
	public static void main(String[] args) {

		EleitorBO EleitorBO = new EleitorBO();
		PessoaBO pesBO = new PessoaBO();

		ArrayList<Eleitor> eleitores = new ArrayList<Eleitor>();

		Pessoa pes = pesBO.pesquisarTodos().get(0);
		Eleitor eleitor = new Eleitor("052343420454", pes);
		eleitores.add(eleitor);

		pes = pesBO.pesquisarTodos().get(1);
		eleitores.add(new Eleitor("056123896502", pes));

		pes = pesBO.pesquisarTodos().get(2);
		eleitores.add(new Eleitor("056123420502", pes));

		pes = pesBO.pesquisarTodos().get(3);
		eleitores.add(new Eleitor("056123420503", pes));

		pes = pesBO.pesquisarTodos().get(4);
		eleitores.add(new Eleitor("056123420504", pes));

		pes = pesBO.pesquisarTodos().get(5);
		eleitores.add(new Eleitor("056123420505", pes));

		pes = pesBO.pesquisarTodos().get(6);
		eleitores.add(new Eleitor("056123420506", pes));

		pes = pesBO.pesquisarTodos().get(7);
		eleitores.add(new Eleitor("056123420507", pes));

		pes = pesBO.pesquisarTodos().get(8);
		eleitores.add(new Eleitor("056123420508", pes));

		pes = pesBO.pesquisarTodos().get(9);
		eleitores.add(new Eleitor("056123420509", pes));

		pes = pesBO.pesquisarTodos().get(10);
		eleitores.add(new Eleitor("056123420510", pes));

		pes = pesBO.pesquisarTodos().get(11);
		eleitores.add(new Eleitor("056123420511", pes));

		pes = pesBO.pesquisarTodos().get(12);
		eleitores.add(new Eleitor("056123420512", pes));

		pes = pesBO.pesquisarTodos().get(13);
		eleitores.add(new Eleitor("056123420513", pes));

		pes = pesBO.pesquisarTodos().get(14);
		eleitores.add(new Eleitor("056123420514", pes));

		pes = pesBO.pesquisarTodos().get(15);
		eleitores.add(new Eleitor("056123420515", pes));

		pes = pesBO.pesquisarTodos().get(16);
		eleitores.add(new Eleitor("056123420516", pes));

		pes = pesBO.pesquisarTodos().get(17);
		eleitores.add(new Eleitor("056123420517", pes));

		pes = pesBO.pesquisarTodos().get(18);
		eleitores.add(new Eleitor("056123420518", pes));

		pes = pesBO.pesquisarTodos().get(19);
		eleitores.add(new Eleitor("056123420519", pes));

		pes = pesBO.pesquisarTodos().get(20);
		eleitores.add(new Eleitor("056123420520", pes));

		pes = pesBO.pesquisarTodos().get(21);
		eleitores.add(new Eleitor("056123420521", pes));

		pes = pesBO.pesquisarTodos().get(22);
		eleitores.add(new Eleitor("056123420522", pes));

		pes = pesBO.pesquisarTodos().get(23);
		eleitores.add(new Eleitor("056123420523", pes));

		pes = pesBO.pesquisarTodos().get(24);
		eleitores.add(new Eleitor("056123420524", pes));

		pes = pesBO.pesquisarTodos().get(25);
		eleitores.add(new Eleitor("056123420525", pes));

		pes = pesBO.pesquisarTodos().get(26);
		eleitores.add(new Eleitor("056123420526", pes));

		pes = pesBO.pesquisarTodos().get(27);
		eleitores.add(new Eleitor("056123420527", pes));

		pes = pesBO.pesquisarTodos().get(28);
		eleitores.add(new Eleitor("056123420528", pes));

		pes = pesBO.pesquisarTodos().get(29);
		eleitores.add(new Eleitor("056123420529", pes));

		pes = pesBO.pesquisarTodos().get(30);
		eleitores.add(new Eleitor("056123420530", pes));

		pes = pesBO.pesquisarTodos().get(31);
		eleitores.add(new Eleitor("056123420531", pes));

		pes = pesBO.pesquisarTodos().get(32);
		eleitores.add(new Eleitor("056123420532", pes));

		pes = pesBO.pesquisarTodos().get(33);
		eleitores.add(new Eleitor("056123420533", pes));

		pes = pesBO.pesquisarTodos().get(34);
		eleitores.add(new Eleitor("056123420534", pes));

		pes = pesBO.pesquisarTodos().get(35);
		eleitores.add(new Eleitor("056123420535", pes));

		pes = pesBO.pesquisarTodos().get(36);
		eleitores.add(new Eleitor("056123420536", pes));

		pes = pesBO.pesquisarTodos().get(37);
		eleitores.add(new Eleitor("056123420537", pes));

		pes = pesBO.pesquisarTodos().get(38);
		eleitores.add(new Eleitor("056123420538", pes));

		pes = pesBO.pesquisarTodos().get(39);
		eleitores.add(new Eleitor("056123420539", pes));

		pes = pesBO.pesquisarTodos().get(40);
		eleitores.add(new Eleitor("056123420540", pes));

		pes = pesBO.pesquisarTodos().get(41);
		eleitores.add(new Eleitor("056123420541", pes));

		pes = pesBO.pesquisarTodos().get(42);
		eleitores.add(new Eleitor("056123420542", pes));

		pes = pesBO.pesquisarTodos().get(43);
		eleitores.add(new Eleitor("056123420543", pes));

		pes = pesBO.pesquisarTodos().get(44);
		eleitores.add(new Eleitor("056123420544", pes));

		pes = pesBO.pesquisarTodos().get(45);
		eleitores.add(new Eleitor("056123420545", pes));

		pes = pesBO.pesquisarTodos().get(46);
		eleitores.add(new Eleitor("056123420546", pes));

		pes = pesBO.pesquisarTodos().get(47);
		eleitores.add(new Eleitor("056123420547", pes));

		pes = pesBO.pesquisarTodos().get(48);
		eleitores.add(new Eleitor("056123420548", pes));

		pes = pesBO.pesquisarTodos().get(49);
		eleitores.add(new Eleitor("056123420549", pes));

		pes = pesBO.pesquisarTodos().get(50);
		eleitores.add(new Eleitor("056123420550", pes));

		pes = pesBO.pesquisarTodos().get(51);
		eleitores.add(new Eleitor("056123420551", pes));

		pes = pesBO.pesquisarTodos().get(52);
		eleitores.add(new Eleitor("056123420552", pes));

		pes = pesBO.pesquisarTodos().get(53);
		eleitores.add(new Eleitor("056123420553", pes));

		pes = pesBO.pesquisarTodos().get(54);
		eleitores.add(new Eleitor("056123420554", pes));

		pes = pesBO.pesquisarTodos().get(55);
		eleitores.add(new Eleitor("056123420555", pes));

		pes = pesBO.pesquisarTodos().get(56);
		eleitores.add(new Eleitor("056123420556", pes));

		pes = pesBO.pesquisarTodos().get(57);
		eleitores.add(new Eleitor("056123420557", pes));

		pes = pesBO.pesquisarTodos().get(58);
		eleitores.add(new Eleitor("056123420558", pes));

		pes = pesBO.pesquisarTodos().get(59);
		eleitores.add(new Eleitor("056123420559", pes));

		pes = pesBO.pesquisarTodos().get(60);
		eleitores.add(new Eleitor("056123420560", pes));

		pes = pesBO.pesquisarTodos().get(61);
		eleitores.add(new Eleitor("056123420561", pes));

		pes = pesBO.pesquisarTodos().get(62);
		eleitores.add(new Eleitor("056123420562", pes));

		pes = pesBO.pesquisarTodos().get(63);
		eleitores.add(new Eleitor("056123420563", pes));

		pes = pesBO.pesquisarTodos().get(64);
		eleitores.add(new Eleitor("056123420564", pes));

		pes = pesBO.pesquisarTodos().get(65);
		eleitores.add(new Eleitor("056123420565", pes));

		pes = pesBO.pesquisarTodos().get(66);
		eleitores.add(new Eleitor("056123420566", pes));

		pes = pesBO.pesquisarTodos().get(67);
		eleitores.add(new Eleitor("056123420567", pes));

		pes = pesBO.pesquisarTodos().get(68);
		eleitores.add(new Eleitor("056123420568", pes));

		pes = pesBO.pesquisarTodos().get(69);
		eleitores.add(new Eleitor("056123420569", pes));

		pes = pesBO.pesquisarTodos().get(70);
		eleitores.add(new Eleitor("056123420570", pes));

		pes = pesBO.pesquisarTodos().get(71);
		eleitores.add(new Eleitor("056123420571", pes));

		pes = pesBO.pesquisarTodos().get(72);
		eleitores.add(new Eleitor("056123420572", pes));

		pes = pesBO.pesquisarTodos().get(73);
		eleitores.add(new Eleitor("056123420573", pes));

		pes = pesBO.pesquisarTodos().get(74);
		eleitores.add(new Eleitor("056123420574", pes));

		pes = pesBO.pesquisarTodos().get(75);
		eleitores.add(new Eleitor("056123420575", pes));

		pes = pesBO.pesquisarTodos().get(76);
		eleitores.add(new Eleitor("056123420576", pes));

		pes = pesBO.pesquisarTodos().get(77);
		eleitores.add(new Eleitor("056123420577", pes));

		pes = pesBO.pesquisarTodos().get(78);
		eleitores.add(new Eleitor("056123420578", pes));

		pes = pesBO.pesquisarTodos().get(79);
		eleitores.add(new Eleitor("056123420579", pes));

		pes = pesBO.pesquisarTodos().get(80);
		eleitores.add(new Eleitor("056123420580", pes));

		pes = pesBO.pesquisarTodos().get(81);
		eleitores.add(new Eleitor("056123420581", pes));

		pes = pesBO.pesquisarTodos().get(82);
		eleitores.add(new Eleitor("056123420582", pes));

		pes = pesBO.pesquisarTodos().get(83);
		eleitores.add(new Eleitor("056123420583", pes));

		pes = pesBO.pesquisarTodos().get(84);
		eleitores.add(new Eleitor("056123420584", pes));

		pes = pesBO.pesquisarTodos().get(85);
		eleitores.add(new Eleitor("056123420585", pes));

		pes = pesBO.pesquisarTodos().get(86);
		eleitores.add(new Eleitor("056123420586", pes));

		pes = pesBO.pesquisarTodos().get(87);
		eleitores.add(new Eleitor("056123420587", pes));

		pes = pesBO.pesquisarTodos().get(88);
		eleitores.add(new Eleitor("056123420588", pes));

		pes = pesBO.pesquisarTodos().get(89);
		eleitores.add(new Eleitor("056123420589", pes));

		pes = pesBO.pesquisarTodos().get(90);
		eleitores.add(new Eleitor("056123420590", pes));

		pes = pesBO.pesquisarTodos().get(91);
		eleitores.add(new Eleitor("056123420591", pes));

		pes = pesBO.pesquisarTodos().get(92);
		eleitores.add(new Eleitor("056123420592", pes));

		pes = pesBO.pesquisarTodos().get(93);
		eleitores.add(new Eleitor("056123420593", pes));

		pes = pesBO.pesquisarTodos().get(94);
		eleitores.add(new Eleitor("056123420594", pes));

		pes = pesBO.pesquisarTodos().get(95);
		eleitores.add(new Eleitor("056123420595", pes));

		pes = pesBO.pesquisarTodos().get(96);
		eleitores.add(new Eleitor("056123420596", pes));

		pes = pesBO.pesquisarTodos().get(97);
		eleitores.add(new Eleitor("056123420597", pes));

		pes = pesBO.pesquisarTodos().get(98);
		eleitores.add(new Eleitor("056123420598", pes));

		pes = pesBO.pesquisarTodos().get(99);
		eleitores.add(new Eleitor("056123420599", pes));

		pes = pesBO.pesquisarTodos().get(100);
		eleitores.add(new Eleitor("056123420600", pes));

		pes = pesBO.pesquisarTodos().get(101);
		eleitores.add(new Eleitor("056123420601", pes));

		pes = pesBO.pesquisarTodos().get(102);
		eleitores.add(new Eleitor("056123420602", pes));

		pes = pesBO.pesquisarTodos().get(103);
		eleitores.add(new Eleitor("056123420603", pes));

		pes = pesBO.pesquisarTodos().get(104);
		eleitores.add(new Eleitor("056123420604", pes));

		pes = pesBO.pesquisarTodos().get(105);
		eleitores.add(new Eleitor("056123420605", pes));

		pes = pesBO.pesquisarTodos().get(106);
		eleitores.add(new Eleitor("056123420606", pes));

		pes = pesBO.pesquisarTodos().get(107);
		eleitores.add(new Eleitor("056123420607", pes));


		for (Eleitor el : eleitores) {
			if (EleitorBO.inserir(el))
				System.out.println("Inserido com Sucesso");
			else
				System.out.println("Erro ao Inserir");
		}

		
		System.out.println();
		System.out.println();
		List<Eleitor> values = EleitorBO.pesquisarTodos();
		for (Eleitor ele : values) {
			System.out.println(ele);
			
		}


	}

}
