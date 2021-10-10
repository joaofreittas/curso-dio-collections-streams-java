package com.home.collectionsjava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		/*
		add
		set
		sort
		remove by index
		remove by object
		get by index
		get by object
		contains
		clear
		size
		indexOf
		foreach
		iterator

		IndexOutOfBoundsException
		 */

		names.add("João");
		names.add("Maria");
		names.add("Pedro");
		names.add("Carlos");
		names.add("Anderson");

		names.set(2, "Juca");

		System.out.println(names);

		Collections.sort(names);

		System.out.println(names);

		names.remove(2); //remover por índice
		names.remove("Carlos"); // remover por objeto

		String nomeNaPosicao0 = names.get(10);

		Integer tamanho = names.size();

		Boolean hasAnderson = names.contains("Anderson");


		for(String name : names){
			System.out.println("Nome na lista: " + name);
		}

		names.forEach(name -> {
			System.out.println("Nome na lista2: " + name);
		});

		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()){
			System.out.println("Nome na lista3: " + iterator.next());
		}

		names.clear();
		Boolean listIsEmpty = names.isEmpty();

		Integer indexAnderson = names.indexOf("Anderson");

	}
}
