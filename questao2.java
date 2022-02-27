package desafioCapgemini;

import java.util.Scanner;
import java.util.regex.Pattern;

public class questao2 {
/**
 * Método main chama o método validacaoSenha() e retorna a resposta;
 * 
 * @param String senha recebe a palavra que será validada no validacaoSenha()
 * 
 * @return String valor retorna se a senha for validada como forte ou fraca
 * 
 * @author manoela
 */
public static void main (String[] args) {

	String senha;
	int valor;
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.print("Escreva sua senha: ");
		senha = scanner.next();
	}

	valor = validacaoSenha(senha);

	System.out.println(valor);
}
/**
 * Método validacaoSenha() recebe uma string e analisa, através de expressões
 * regulares, se a senha é forte ou fraca.
 * 
 * @param senhaMinuscula expressão regular que valida se a senha possui
 *                       caracteres minúsculos
 * @param senhaMaiuscula expressão regular que valida se a senha possui
 *                       caracteres maiúsculos
 * @param senhaDigito    expressão regular que valida se a senha possui
 *                       caracteres numéricos
 * @param senhaEspecial  expressão regular que valida se a senha possui
 *                       caracteres especiais
 * 
 * @param Boolean        para cada pattern -> Verdadeiro se cumpre os requisitos
 *                       do pattern -> Falso se não cumpre os requisitos do
 *                       pattern, adiciona 1 a fsenha, que é onde guarda a "força da senha".
 * @return 
 * @return 
 * 
 */

public static int validacaoSenha(String senha) {
	int tamanho = senha.length();
	int fsenha = 0; // variável para guardar valores de força da senha
	int y = 0;
	boolean senhaMinuscula = Pattern.matches("^(?=.*[a-z]).+$", senha),
			senhaMaiuscula = Pattern.matches("^(?=.*[A-Z]).+$", senha),
			senhaDigito = Pattern.matches("^(?=.*\\d).+$", senha),
			senhaEspecial = Pattern.matches("^(?=.*[A-Z])(?=.*[!#@$%&])(?=.*[0-9])(?=.*[a-z]).{6,15}$", senha);

	
	if (senhaMinuscula == true) {
		fsenha += 1;
	}
	if (senhaMaiuscula == true) {
		fsenha += 1;
	}
	if (senhaDigito == true) {
		fsenha += 1;
	}
	if (senhaEspecial == true) {
		fsenha += 1;
	}

	if (tamanho + fsenha >= 6) {
		System.out.print("Senha forte! Força da senha:  ");
		return fsenha;
	} else {
		y = (6 - tamanho);
		System.out.print("Senha muito pequena! Precisamos acrescentar o seguinte número de caracteres: ");
		return y;
	}
  }
}