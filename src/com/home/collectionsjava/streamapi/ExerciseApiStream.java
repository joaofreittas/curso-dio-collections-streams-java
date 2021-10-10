package com.home.collectionsjava.streamapi;

import com.home.collectionsjava.compare.Estudante;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseApiStream {

	public static void main(String[] args) {

		List<Estudante> estudantes = new ArrayList<>();
		estudantes.add(new Estudante("João", 22));
		estudantes.add(new Estudante("Lucas", 17));
		estudantes.add(new Estudante("Maria", 45));
		estudantes.add(new Estudante("Zé", 14));
		estudantes.add(new Estudante("Nair", 66));
		estudantes.add(new Estudante("Gabriele", 22));

		System.out.println("Transformar cada estudante" + estudantes
				.stream()
				.map(element -> element.getNome() + " tem " + element.getIdade() + " anos")
				.collect(Collectors.toList()));

		System.out.println("Quantidade de estudantes: " + estudantes.stream().count());

		System.out.println("Somente maiores de idade: " + estudantes
				.stream()
				.filter(est -> est.getIdade() >= 18)
				.collect(Collectors.toList()));

		estudantes
				.stream()
				.forEach(System.out::println);

		System.out.println("Estudantes que possuam a letra B" + estudantes
				.stream()
				.filter(element -> element.getNome().toLowerCase().contains("b"))
				.collect(Collectors.toList()));

		System.out.println("Algum estudante possui a letra D no nome? " + estudantes
				.stream()
				.anyMatch(element -> element.getNome().toLowerCase().contains("d")));

		System.out.println("O mais velho: " + estudantes
				.stream()
				.max(Comparator.comparingInt(Estudante::getIdade)));

		System.out.println("O mais novo: " + estudantes
				.stream()
				.min(Comparator.comparingInt(Estudante::getIdade)));

	}
}
