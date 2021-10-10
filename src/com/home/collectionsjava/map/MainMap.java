package com.home.collectionsjava.map;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

	public static void main(String[] args) {
		Map<String, Integer> copasDoMundo = new HashMap<>();
		copasDoMundo.put("BRASIL", 5);
		copasDoMundo.put("ALEMANHA", 4);
		copasDoMundo.put("ITÁLIA", 4);
		copasDoMundo.put("URUGUAI", 2);
		copasDoMundo.put("ARGENTINA", 2);
		copasDoMundo.put("FRANÇA", 1);
		copasDoMundo.put("INGLATERRA", 1);
		copasDoMundo.put("ESPANHA", 1);

		System.out.println(copasDoMundo);

		copasDoMundo.put("BRASIL", 6);

		System.out.println(copasDoMundo);

		Integer keyFranca = copasDoMundo.get("FRANÇA");
		System.out.println(keyFranca);

		Boolean keyInglaterraExiste = copasDoMundo.containsKey("INGLATERRA");
		System.out.println(keyInglaterraExiste);

		Boolean keyBelgicaExiste = copasDoMundo.containsKey("BELGICA");
		System.out.println(keyBelgicaExiste);

		copasDoMundo.remove("ESPANHA");
		System.out.println(copasDoMundo);

		int size = copasDoMundo.size();
		System.out.println(size);

		for (Map.Entry<String, Integer> entry: copasDoMundo.entrySet()){
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		for(String key : copasDoMundo.keySet()){
			System.out.println(key + " --- " + copasDoMundo.get(key));
		}
	}
}
