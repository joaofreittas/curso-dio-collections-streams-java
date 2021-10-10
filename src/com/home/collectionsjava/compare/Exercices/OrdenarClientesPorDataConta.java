package com.home.collectionsjava.compare.Exercices;

import java.util.Comparator;

public class OrdenarClientesPorDataConta implements Comparator<Cliente> {

	@Override
	public int compare(Cliente cliente, Cliente t1) {
		return cliente.getDataAberturaConta().compareTo(t1.getDataAberturaConta());
	}

}
