package com.home.collectionsjava.exercices;

import java.util.HashMap;
import java.util.Map;

public class ExerciseMap4 {

	public static void main(String[] args) {

		Map<String, String> estados = new HashMap<>();
		estados.put("MG", "Minas Gerais");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("SP", "São Paulo");
		estados.put("MA", "Maranhão");
		estados.put("AC", "Acre");
		estados.put("PA", "Pará");

		System.out.println(estados);

		estados.remove("MG");

		System.out.println(estados);

		estados.put("DF", "Distrito Federal");

		System.out.println(estados);

		int size = estados.size();

		System.out.println(size);

		estados.remove("AC");
		System.out.println(estados);

		for (String key : estados.keySet()){
			System.out.println(estados.get(key) + " ["+ key +"]");
		}

	}
}
