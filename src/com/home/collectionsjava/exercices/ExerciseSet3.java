package com.home.collectionsjava.exercices;

import java.util.HashSet;
import java.util.Set;

public class ExerciseSet3 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		set.add(3);
		set.add(88);
		set.add(20);
		set.add(44);
		set.add(3);

		for (Integer numero : set) {
			System.out.println(numero);
		}

		set.remove(3);
		set.add(23);

		System.out.println(set);

		set.size();
		set.isEmpty();

	}
}
