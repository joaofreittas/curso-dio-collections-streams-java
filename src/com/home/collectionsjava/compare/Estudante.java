package com.home.collectionsjava.compare;

public class Estudante implements Comparable<Estudante>{

	private String nome;
	private Integer idade;

	public Estudante(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Estudante other) {
		return this.getIdade() - other.getIdade();
	}

	@Override
	public String toString() {
		return "{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				'}';
	}
}
