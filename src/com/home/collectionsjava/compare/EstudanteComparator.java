package com.home.collectionsjava.compare;

import java.util.Comparator;

public class EstudanteComparator implements Comparator<Estudante> {


	@Override
	public int compare(Estudante estudante, Estudante other) {
		return other.getIdade() - estudante.getIdade();
	}
}
