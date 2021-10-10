package com.home.collectionsjava.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {

	public static void main(String[] args) {


		// Não permite elementos repetidos
		Set<Double> notasAlunos = new HashSet<>();

		notasAlunos.add(5.8);
		notasAlunos.add(10.0);
		notasAlunos.add(7.0);
		notasAlunos.add(5.0);
		notasAlunos.add(8.0);

		System.out.println("HashSet: " + notasAlunos);

		notasAlunos.remove(5.8);

		System.out.println("HashSet: " + notasAlunos);


		//Mantém a ordenação de inserção, é um pouco mais lento por conta disso
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		numbers.add(3);
		numbers.add(6);

		System.out.println("\nLinkedHashSet: " + numbers);

		//
		TreeSet<String> treeCapitais = new TreeSet<>();
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Curitiba");
		treeCapitais.add("Belo Horizonte");

		System.out.println("\nTreeSet: " + treeCapitais);

		System.out.println("Topo da árvore: " + treeCapitais.first());
		System.out.println("Folha da árvore: " + treeCapitais.last());
	}
}
