package lacoCondicionalExercicio;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		// Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com
		// idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
		// Escreva um Algoritmo em Java que obtenha via teclado o nome do doador
		// (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De
		// acordo com as Regras para a doação, mostre na tela se o doador está Apto ou
		// Não Apto para doar sangue.

		Scanner leitor = new Scanner(System.in);

		String doador;
		int idade;
		boolean primeiraDoacao;

		System.out.println("Digite seu nome completo: ");
		doador = leitor.nextLine();

		System.out.println("Digite sua idade:");
		idade = leitor.nextInt();

		System.out.println("É sua primeira doação? (true para sim) (false para não): ");
		primeiraDoacao = leitor.nextBoolean();

		leitor.close();

		boolean apto = false;

		if (idade >= 18 && idade <= 69) {
			if (idade < 60 || primeiraDoacao == false)
				apto = true;
		}

		if (apto) {
			System.out.println(doador + ", Você está apto para doar sangue!");
		} else {
			System.out.println(doador + ", Você não está apto para doar sangue!");
		}

	}

}
