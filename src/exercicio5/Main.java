package exercicio5;

/**5. Utilizando a API Stream escreve um programa Java para apresentar até o 10º 
elemento da sequência de fibonnaci*/

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream.iterate(new long[] { 0, 1 }, p -> new long[] { p[1], p[0] + p[1] })
	      .limit(10)
	      .forEach(p -> System.out.println(p[0]));
	}

}
