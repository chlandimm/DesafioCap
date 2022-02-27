package desafioCapgemini;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class questao3 {
/**
 * Método main chama o método paresDeAnagrama() e retorna sua resposta;
 * 
 * @param String palavra recebe a palavra que será analisada no método
 *               paresDeAnagrama()()
 * 
 * @return int valor retorna o número de pares de anagrama da palavra digitada
 * 
 * @author manoela
 *
 */

public static void main(String[] args) { 

	String palavra;
	int valor;
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.print("Digite uma palavra para verificarmos o nº de anagramas: ");
		palavra = scanner.next();
	}

	valor = paresDeAnagrama(palavra);

	System.out.println(valor);
}

/**
 * Método paresDeAnagrama() recebe uma string e retorna a quantidade de pares
 * de anagramas que são possíveis formar a partir do input recebido.
 * 
 * A String informada é transformada em uma array no laço for e têm as substring contadas 
 *  
 * A estrutura boleana separa a quantidade de anagramas e as armazena junto a
 * sua chave no map.
 */
public static Integer paresDeAnagrama(String palavra) {

	HashMap<String, Integer> map = new HashMap<>();
	int a, b, tamanho = palavra.length();

	for (a = 0; a < tamanho; a++) {
		for (b = a; b < tamanho; b++) {
			char[] arrayPalavra = palavra.substring(a, b + 1).toCharArray();
			Arrays.sort(arrayPalavra);
			String chaveArrayPalavra = new String(arrayPalavra);
			if (map.containsKey(chaveArrayPalavra))
				map.put(chaveArrayPalavra, map.get(chaveArrayPalavra) + 1);
			else
				map.put(chaveArrayPalavra, 1);
		}
	}
	 
/** 
 * * Outro laço for é feito para definir os pares de anagramas e esse valor é
* armazenado na variável pares
* 
* @return int pares retorna o valor de pares de anagramas encontrado na String palavra
*/
	
	int pares = 0;
	for (String chave : map.keySet()) {
		int x = map.get(chave);
		pares += (x * (x - 1)) / 2; 
	}
	System.out.print("O número total de anagramas desta palavra é:   ");
	return pares;
}
}