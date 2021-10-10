package com.home.collectionsjava.exercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciceList1 {

	public static void main(String[] args){

		List<String> nomes = new ArrayList<>();

		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");

		printNomes(nomes);

		Integer indexCarlos = nomes.indexOf("Carlos");
		nomes.set(indexCarlos, "Roberto");

		printNomes(nomes);

		String nomePosicao1 = nomes.get(1);
		nomes.remove(4);
		nomes.remove("João");

		Integer qtdItems = nomes.size();

		Boolean julianaExiste = nomes.contains("Juliana");

		List<String> nomes2 = new ArrayList<>();
		nomes2.add("Ismael");
		nomes2.add("Rodrigo");

		nomes.addAll(nomes2);

		printNomes(nomes);

		Collections.sort(nomes);

		Boolean isEmpty = nomes.isEmpty();

	}

	public static void printNomes(List<String> nomes){
		for(String nome: nomes){
			System.out.println("Nome: " + nome);
		}
		System.out.println("------------------------------");
	}
}
