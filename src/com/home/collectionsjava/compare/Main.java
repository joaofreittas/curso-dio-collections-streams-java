package com.home.collectionsjava.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Estudante> estudantes = new ArrayList<>();

		estudantes.add(new Estudante("João", 22));
		estudantes.add(new Estudante("Gabriele", 22));
		estudantes.add(new Estudante("Samara", 25));
		estudantes.add(new Estudante("Jeremias", 21));
		estudantes.add(new Estudante("Letícia", 24));
		estudantes.add(new Estudante("Débora", 27));
		estudantes.add(new Estudante("Sabrina", 15));
		estudantes.add(new Estudante("João Arthur", 2));
		estudantes.add(new Estudante("Sthepen Kaung", 107));


		System.out.println("Ordem de incersão");
		System.out.println(estudantes);

		estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

		System.out.println("Ordem natural dos numeros");
		System.out.println(estudantes);

		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

		System.out.println("Ordem reversa dos numeros");
		System.out.println(estudantes);


		estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

		System.out.println("Ordem natural dos numeros (method reference)");
		System.out.println(estudantes);

		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

		System.out.println("Ordem reversa dos numeros (method reference)");
		System.out.println(estudantes);

		Collections.sort(estudantes);
		System.out.println("Ordem natural dos numeros (interface comparable)");
		System.out.println(estudantes);

		Collections.sort(estudantes, new EstudanteComparator());

		System.out.println("Ordem reversa dos numeros (interface comparator)");
		System.out.println(estudantes);

	}

}
