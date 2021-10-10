package com.home.collectionsjava.optional;

import java.util.Optional;

public class ExerciseOptional {

	public static void main(String[] args){

		Optional<String> optional = Optional.of("Valor presente");

		optional.ifPresent(System.out::println);

		optional.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não presente"));

		optional.orElseThrow(IllegalStateException::new);

		String outroValorCasoVazio = optional.orElse("Optional Vazio");

		optional.ifPresent(opt -> {
			opt = "Maria";

			System.out.println(opt);
		});

		optional.map(opt -> opt.concat(" com certeza")).ifPresent(System.out::println);




	}

}
