package com.home.collectionsjava.compare.Exercices;

import java.time.LocalDate;

public class Cliente implements Comparable<Cliente>{

	private String nome;
	private Integer idade;
	private LocalDate dataAberturaConta;

	public Cliente(String nome, Integer idade, LocalDate dataAberturaConta) {
		this.nome = nome;
		this.idade = idade;
		this.dataAberturaConta = dataAberturaConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataAberturaConta() {
		return dataAberturaConta;
	}

	public void setDataAberturaConta(LocalDate dataAberturaConta) {
		this.dataAberturaConta = dataAberturaConta;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Cliente other) {
		return this.getIdade() - other.getIdade();
	}

	@Override
	public String toString() {
		return "{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", dataAberturaConta=" + dataAberturaConta +
				'}';
	}
}
