package exercicio4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**Crie uma lista (streams) contendo as informações da tabela abaixo: 
	Paulo 
	Camila 
	Ana Maria 
	Patrick 
	Ana Clara 
	Pedro 
	Alfredo 
● Mostre somente os nomes que começam com P 
● Mostre todos os nomes dos clientes separados por tamanho (número de 
caracteres) 
● Pesquise a letra inicial “A” e agrupe os nomes mostrando true e false, ou 
seja, liste os valores que atendem ou não a regra de particionamento. 
● Mostre os nomes agrupados por tamanho, convertidos para maiúsculo e 
separados por vírgula*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lista de nomes
		List<String> nomes = Arrays.asList("Paulo","Camila","Ana Maria","Patrick", "Ana Clara", "Pedro", "Alfredo");
		
		System.out.print("Nomes que começam com P: ");
		nomes.stream().filter(e -> e.startsWith("P")).forEach(e -> System.out.print(e +" "));
		
		System.out.print("\n\nNomes separados por tamanho: ");
		Map<Integer, List<String>> nomesTamanhos = nomes.stream().collect(Collectors.groupingBy(e -> e.length()));
		System.out.print(nomesTamanhos);
		
		System.out.print("\n\nNomes que começam com 'A': ");
		Map<Boolean, List<String>> nomesPesquisa = nomes.stream().collect(Collectors.groupingBy(e -> e.startsWith("A")));
		System.out.print(nomesPesquisa);
		
		System.out.print("\n\nNomes agrupados por tamanho em maiúsculo e separados por vírgula: ");
		String resultado = nomesTamanhos.values()
				.stream()
				.map(e -> e.toString().toUpperCase())
				.map(e -> e.replace("[", ""))
				.map(e -> e.replace("]", ""))
				.collect(Collectors.joining(", "));
		System.out.println(resultado);
		
	}

}
