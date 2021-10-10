package com.home.collectionsjava.exercices;

import java.util.*;

public class ExerciseQueue2 {

	public static void main(String[] args){

		Queue<String> fila = new LinkedList<>();

		fila.add("Juliana");
		fila.add("Pedro");
		fila.add("Carlos");
		fila.add("Larissa");
		fila.add("João");

		for (String cliente: fila) {
			System.out.println("Cliente: " + cliente);
		}

		String clienteSemRemocao = fila.peek();
		System.out.println(clienteSemRemocao);
		System.out.println(fila);

		String clienteRemovendo = fila.poll();
		System.out.println(clienteRemovendo);
		System.out.println(fila);

		fila.add("Daniel");
		System.out.println(fila);

		int sizeQueue = fila.size();
		System.out.println(sizeQueue);

		boolean isEmpty = fila.isEmpty();
		System.out.println(isEmpty);

		boolean carlosIsPresent = fila.contains("Carlos");
		System.out.println(carlosIsPresent);

	}

}
