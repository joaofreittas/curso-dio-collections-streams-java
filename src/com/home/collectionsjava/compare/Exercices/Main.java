package com.home.collectionsjava.compare.Exercices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();


		clientes.add(new Cliente("João", 22, LocalDate.now()));
		clientes.add(new Cliente("Maria", 10, LocalDate.of(2021, 10, 11)));
		clientes.add(new Cliente("Lucas", 15, LocalDate.of(2021, 10, 8)));

		System.out.println(clientes);

		Collections.sort(clientes, new OrdenarClientesPorDataConta());

		System.out.println(clientes);

		clientes.sort((first, second) -> first.getIdade() - second.getIdade());

		System.out.println(clientes);

		clientes.sort((first, second) -> second.getIdade() - first.getIdade());

		System.out.println(clientes);


		clientes.sort(Comparator.comparingInt(Cliente::getIdade));

		System.out.println(clientes);

		clientes.sort(Comparator.comparingInt(Cliente::getIdade).reversed());

		System.out.println(clientes);
	}
}
