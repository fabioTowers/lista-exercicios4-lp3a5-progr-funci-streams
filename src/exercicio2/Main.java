package exercicio2;

/**2. Crie um programa que implemente os seguintes passos: 
● Crie um Stream contendo todos os números de 0 a 9 
● Aplique um filtro mantendo apenas os números pares 
● Ignores os dois primeiros números 
● Limite o processamento aos dois primeiros números 
● Aplique uma multiplicação por 2 em cada elemento 
● Mostre o resultado final*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// lista dos números
		List<Integer> lista = new ArrayList<Integer>();
		 
		lista = Stream.iterate(0, n -> n <= 9 , n -> n + 1) // Crie um Stream contendo todos os números de 0 a 9
				.filter(e -> e % 2 ==0)						// Aplique um filtro mantendo apenas os números pares
				.skip(2)									// Ignore os dois primeiros números
				.limit(2)									// Limite o processamento aos dois primeiros números
				.map(e -> e * 2)							// Aplique uma multiplicação por 2 em cada elemento
				.collect(Collectors.toList());
		
		// Mostre o resultado final
		System.out.print( lista );
	}

}
