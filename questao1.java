/**
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n 
 * utilizando o caractere * e espaços. A base e altura da escada 
 * devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
 */

package desafioCapgemini;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Método Main recebe a entrada, informando qual deverá ser a altura/degraus da escada, 
 * Por meio de um laço for, são adicionados os asteriscos que irão compor o degrau, 
 * de acordo com o número de degraus informado.
 * @author manoela
 *
 */


public class questao1 {

	public static void main(String[] args) { 
	
		try (var entrada = new Scanner(System.in)) {
			List<String> degraus = new ArrayList<>();

			System.out.println ("Informe quantos degraus você gostaria de ver na sua escada: ");

				int qtdDegraus = entrada.nextInt();

				for (int i = 0; i < qtdDegraus; i++) {

						degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));

				}

				for (String d : degraus ) {

						System.out.println(d);

				}
		}

	}
}
