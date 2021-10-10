package com.home.collectionsjava.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainQueue {

	public static void main(String[] args) {

		/*
		java.util.Queue

		Conceito de Fila de estrutura de dados:
		FIFO - First In First Out
		O primeiro a entrar vai ser o primeiro a sair.
		Ex: fila de banco;


		 */

		Queue<String> filaBanco = new LinkedList<>();

		filaBanco.add("Patrícia");
		filaBanco.add("Roberto");
		filaBanco.add("Flávio");
		filaBanco.add("Pâmela");
		filaBanco.add("Anderson");
		//[Patrícia, Roberto, Flávio, Pâmela, Anderson]

		System.out.println(filaBanco);

		String clienteASerAtendido = filaBanco.poll();

		System.out.println("Cliente a ser atendido: " + clienteASerAtendido);

		System.out.println(filaBanco);

		String primeiroCliente = filaBanco.peek();

		System.out.println("Primeiro Cliente: " + clienteASerAtendido);


//		filaBanco.clear();
		//Lança um NoSuchElementException.class não havendo elemento na fila.
		String primeiroClienteOuErro = filaBanco.element();

		System.out.println("Primeiro Cliente ou erro: " + primeiroClienteOuErro);

		for (String cliente : filaBanco){
			System.out.println("Cliente: " + cliente);
		}

		Iterator<String> iterator = filaBanco.iterator();

		while (iterator.hasNext()) {
			System.out.println("Cliente 2: " + iterator.next());
		}

		filaBanco.size();
		filaBanco.isEmpty();

	}
}
