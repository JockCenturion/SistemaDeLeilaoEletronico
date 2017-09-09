package arrayList.leilao;

import java.util.Scanner;

public class Interface {
	
	//Variaveis Globais
	static Scanner input = new Scanner(System.in);
	static Leilao leilao = new Leilao();
	
	//Metodos Principal
	public static void main(String[] args) {
		inicializaSistema();
	}
	
	//Metodos do Sistema
	public static void inicializaSistema() {
		int resp;
		
		do {
			menu();
			resp = input.nextInt();
			switch(resp) {
				case 1: op01(); break;
				case 2: op02(); break;
				case 3: op03(); break;
				case 4: op04(); break;
				case 5: op05(); break;
				case 6: op06(); break;
				case 7: op07(); break;
				case 8: op06(); break;
			}
		} while (resp != 8);
	}
	
	public static void menu() {
		System.out.println("\n\t\t\tMenu\n\n" 			 	+
						   "\t1) Adicionar Lote\n" 		 	+
						   "\t2) Remover Lote\n"   		 	+
						   "\t3) Lance ao Lote\n"		    +
						   "\t4) Buscar Lote\n"	 		 	+
						   "\t5) Lotes Nao Vendidos\n" 	 	+ 
						   "\t6) Mostrar Todos os Lotes\n" 	+
						   "\t7) Quantidade de Lotes\n"     +
						   "\t8) Close Leilao\n");
	}
	
	public static void op01() {
		System.out.println("_________________________________\n");
		System.out.print("Nome Do Lote: ");
		input.nextLine();
		leilao.addLote(input.nextLine());
		System.out.println("_________________________________");		
	}
	
	public static void op02() {
		op06();
		if (leilao.quantidadeDeLotes() > 0) {
			System.out.print("Numero Lote a Ser Removido: ");

			if (leilao.removeLote(input.nextInt()) != null ) System.out.println("\nLote Removido!");
			else 									 		 System.out.println("\nLote Inexistente!");

			System.out.println("_________________________________");
		}
	}		
	
	public static void op03() {
		System.out.println("_________________________________\n");

		if (leilao.quantidadeDeLotes() == 0) {
			System.out.println("Sem Lotes Cadastrados!");
		} else {
			leilao.listaLotes();
			System.out.println("_________________________________\n");
			System.out.print("Nome do Licitante: ");
			input.nextLine();
			Pessoa licitante = new Pessoa(input.nextLine());
			System.out.print("ID do Lote: ");
			Lote lote = leilao.getLote(input.nextInt());
			System.out.print("Valor do Lance: ");
			if (lote != null) lote.lancePara(licitante, input.nextDouble());
		}

		System.out.println("\n_________________________________\n");		
	}
	
	public static void op04() {
		System.out.println("_________________________________\n");
		System.out.print("Numero do Lote: ");
		Lote lote = leilao.getLote(input.nextInt());
		System.out.println("\n" + (lote != null ? lote : "Lote Inexistente!"));
		System.out.println("_________________________________");		
	}
	
	public static void op05() {
		System.out.println("_________________________________\n");

		try {
			for (Lote lote : leilao.getNaoVendidos())
				System.out.println(lote);
		} catch (NullPointerException e) {
			System.out.println("\tNenhum Lote Cadastrado!");
		}

		System.out.println("_________________________________\n");
	}
	
	public static void op06() {
		System.out.println("_________________________________\n");
		if (leilao.quantidadeDeLotes() > 0 ) leilao.listaLotes();
		else 								 System.out.println("\tNenhum Lote Cadastrado!");
		System.out.println("_________________________________\n");		
	}
	
	public static void op07() {
		System.out.println("_________________________________\n");
		System.out.println("Quantidade De Lotes Cadastrados: " + leilao.quantidadeDeLotes());
		System.out.println("_________________________________\n");		
	}
}
