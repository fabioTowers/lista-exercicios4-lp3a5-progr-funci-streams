package exercicio1;

/**1. Utilizando os conceitos de stream da videoaula, utilize os métodos abordados para 
fazer este exercício. Crie um programa que: 
● Solicite ao usuário a entrada no último número da lista (stream) (n) 
● Gere uma lista com números de 1 a n duplicados (1,1,2,2,3,3...) 
● Mostre todos os números 
● Mostre todos os números sem repetição 
● Mostre todos os números ímpares sem repetição 
● Mostre todos os números pares sem repetição 
● Mostre todos os números a partir do 5 algarismo sem repetição 
● Mostre todos os números multiplicados por 4*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// número digitado pelo usuário
		Integer numero;

		// lê o número digitado
		Scanner in = new Scanner( System.in );
		
		// lista dos números
		List<Integer> lista = new ArrayList<Integer>();
		
		// Solicite ao usuário a entrada no último número da lista (stream) (n)
		//System.out.print("Digite um número: ");
		//n = Integer.parseInt(in.nextLine());
		
		numero = 10; // para teste
		
		System.out.println( "Gere uma lista com números de 1 a n duplicados:" );
		lista = Stream.iterate(1, n -> n <= numero , n -> n + 1)
				.flatMap(u -> Stream.of(u,u))
				.collect(Collectors.toList());
		System.out.print( lista );
		
		// Mostre todos os números sem repetição 
		System.out.println( "\n\nMostre todos os números sem repetição:" );
		lista.stream()
			.distinct()
			.forEach(e -> System.out.print(e + " "));
		
		System.out.println( "\n\nMostre todos os números ímpares sem repetição:" );
		lista.stream()
			.distinct()
			.filter(e -> e % 2 != 0)
			.forEach(e -> System.out.print(e + " "));
		
		System.out.println( "\n\nMostre todos os números pares sem repetição:" );
		lista.stream()
			.distinct()
			.filter(e -> e % 2 == 0)
			.forEach(e -> System.out.print(e + " "));
		
		System.out.println( "\n\nMostre todos os números a partir do 5 algarismo sem repetição:" );
		lista.stream()
			.distinct()
			.skip(5)
			.forEach(e -> System.out.print(e + " "));
		
		System.out.println( "\n\nMostre todos os números multiplicados por 4:" );
		lista.stream()
			.map(e -> e * 4)
			.forEach(e -> System.out.print(e + " "));
		
		in.close();
	}

}
