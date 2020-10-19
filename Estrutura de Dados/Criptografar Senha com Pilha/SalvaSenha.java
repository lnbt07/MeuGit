import java.util.Scanner;

import codigo.PilhaChar.RetornoChar;

public class SalvaSenha {

	public static void main(String[] args) {
		// declaração e inicialização da pilha
		PilhaChar pilha = new PilhaChar();
		pilha.init();

		// declaração para utilizar no retorno do pop
		RetornoChar aux = new RetornoChar();

		Scanner teclado = new Scanner(System.in);

		String senha;
		String senhaInvertida = "";

		System.out.println("Digite uma senha com caracteres especiais '_' ou '#': ");
		senha = teclado.nextLine();

		// deixar todas as letras maiusculas da senha
		senha = senha.toUpperCase();

		// vetor q vai participar da troca das letras pelos caracteres
		char[] trocar = new char[senha.length()];

		// metodo para realizar a troca das letras da senha pelos simbolos especiais
		trocarLetras(senha, trocar);

		// metodo que envia os dados pra pilha, retorna os dados invertidos, separados
		// pelo _ ou #
		senhaInvertida = empilharSenha(trocar, pilha, aux, senhaInvertida);

		// imprimir senha invertida
		System.out.println("Senha criptografada: " + senhaInvertida);

		teclado.close();
	}

	private static String empilharSenha(char[] trocar, PilhaChar pilha, RetornoChar aux, String senhaInvertida) {
		for (int i = 0; i < trocar.length; i++) {
			if (trocar[i] != '#' && trocar[i] != '_') {
				pilha.push(trocar[i]);
			} else {
				while (pilha.isEmpty() != true) {
					aux = pilha.pop();
					senhaInvertida += aux.elem;
				}
				senhaInvertida += trocar[i];
			}
		}

		for (int i = 0; i < pilha.topo; i++) {
			while (pilha.isEmpty() != true) {
				aux = pilha.pop();
				senhaInvertida += aux.elem;
			}
		}

		return senhaInvertida;
	}

	private static char[] trocarLetras(String senha, char[] trocar) {

		for (int i = 0; i < senha.length(); i++) {
			switch (senha.charAt(i)) {
			case 'A':
				trocar[i] = '@';
				break;

			case 'S':
				trocar[i] = '$';
				break;

			case 'R':
				trocar[i] = '*';
				break;

			case 'E':
				trocar[i] = '&';
				break;

			case 'I':
				trocar[i] = '!';
				break;

			case 'O':
				trocar[i] = '(';
				break;

			case 'U':
				trocar[i] = '+';
				break;

			default:
				trocar[i] = senha.charAt(i);
			}
		}

		return trocar;
	}
}
