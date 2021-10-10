package com.home.collectionsjava.streamapi;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args){

		/*
		map
		filter
		foreach
		peek
		count
		group
		 */

		List<String> estudantes = new ArrayList<>();

		estudantes.add("João");
		estudantes.add("Pedro");
		estudantes.add("Gabriele");
		estudantes.add("Lucas");
		estudantes.add("Maria");
		estudantes.add("Tiago");
		estudantes.add("Alfredo");

		//Retorna a contagem de elementos no stream
		System.out.println("Contagem de estudantes: " + estudantes
				.stream()
				.count());

		//Retorna o elemnto com maior numero de letras
		System.out.println("Maior numero de letras: " + estudantes
				.stream()
				.max(Comparator.comparingInt(String::length)));

		//Retorna o elemnto com maior numero de letras
		System.out.println("Menor numero de letras: " + estudantes
				.stream()
				.min(Comparator.comparingInt(String::length)));

		System.out.println("Com a letra R no nome: " +  estudantes
				.stream()
				.filter((est) -> est.toLowerCase().contains("r"))
				.collect(Collectors.toList()));

		System.out.println("Nova Coleção com a quantidade de letras: " + estudantes
				.stream()
				.map(est -> est.concat(" - " + est.length() + " letras"))
				.collect(Collectors.toList()));


		System.out.println("Os 3 primeiros: " + estudantes
				.stream()
				.limit(3)
				.collect(Collectors.toList()));

		System.out.println("Todos Estudantes: " + estudantes
				.stream()
				.peek(System.out::println)
				.collect(Collectors.toList()));

		System.out.println("Todos Estudantes por foreach: ");
		estudantes.stream().forEach(System.out::println);


		System.out.println("Todos elementos possuem 'W' no nome? " + estudantes
				.stream()
				.allMatch((estudante) -> estudante.contains("W")));

		System.out.println("Tem algum elemento com 'W' no nome? " + estudantes
				.stream()
				.anyMatch(estudante -> estudante.contains("W")));

		System.out.println("Nenhum elemento possui 'W' no nome? " + estudantes
				.stream()
				.noneMatch(estudante -> estudante.contains("W")));

		System.out.println("Primeiro elemento");
		estudantes
				.stream()
				.findFirst()
				.ifPresent(System.out::println);

		System.out.println("Operação encadeada: ");

		System.out.println(estudantes
				.stream()
				.peek(System.out::println)
				.map((estudante) -> estudante.concat(" - " + estudante.length()))
				.peek(System.out::println)
//				.filter((estudante) -> estudante.toLowerCase().contains("r"))
//				.collect(Collectors.toList()));
//				.collect(Collectors.joining(", ")));
//				.collect(Collectors.toSet()));
				.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));



	}
}
