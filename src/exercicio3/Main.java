package exercicio3;

/**3. Utilizando os conceitos de stream da videoaula, utilize os métodos abordados para 
fazer este exercício. Crie um programa que: 
● Gere uma lista com 100 números aleatórios e mostre estes números 
● Gere uma lista com 10 números quaisquer o
• Mostre o maior número o
• Mostre o menor número 
• Mostre a quan dade de números*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lista dos números
		List<Integer> lista = new ArrayList<Integer>();
		
		System.out.println( "Lista com 100 números aleatórios:" );
		lista = Stream.generate(()->new Random().nextInt(300)).limit(100).collect(Collectors.toList());
		System.out.print( lista );
		
		System.out.println( "\n\nLista com 10 números aleatórios:" );
		lista = Stream.generate(()->new Random().nextInt(300)).limit(10).collect(Collectors.toList());
		System.out.print( lista );
		
		System.out.println( "\n\nMaior número: " + lista.stream().max(Comparator.naturalOrder()) );
		
		System.out.println( "\nMenor número: " + lista.stream().min(Comparator.naturalOrder()) );
		
		System.out.println( "\nQuantidade de números: " + lista.stream().count() );
	}

}
