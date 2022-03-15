package java.collection.gen;

import java.util.*;
import java.util.Scanner;

public class generation {

	public static void main(String[] args) {
		 

			Scanner leia = new Scanner(System.in);

			ArrayList<String> produtos = new ArrayList<>();

			produtos.add("lapis");
			produtos.add("borracha");
			produtos.add("caneta");
			produtos.add("estojo");
			produtos.add("lapiseira");
			System.out.println("Lista de itens no estoque");
			for(String l: produtos) {
			System.out.println("-- "+ l);
			}
			System.out.println();
			
			System.out.println("o item lapis e borracha nao estão em estoque!!");
			produtos.remove(0);
			produtos.remove(0);
			System.out.println();
			System.out.println("Nova lista com os produtos que ainda temos");
			for(String l: produtos) {
				System.out.println("-- "+l);
			}
			System.out.println();
			produtos.set(0, "Lapis de cor");
			produtos.set(2, "Caderno");
			
			System.out.println("houve uma alta demanda de canetas e lapiseiras, mas chegaram novos produtos -- Cadernos e Lapis de cor");
			System.out.println();
			
			System.out.println("Lista com alterações");
			for(String l: produtos) {
				System.out.println("--"+l);
			}
			
		}
		



	}

