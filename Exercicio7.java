package lacoCondicionalExercicio;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		float numero1, numero2, soma, subtracao, multiplicacao, divisao;
		int codigo;
		
		System.out.println("Digite o valor do primeiro número: ");
		numero1 = leitor.nextFloat();
		
		System.out.println("Digite o valor do segundo número: ");
		numero2 = leitor.nextFloat();
		
		
		System.out.println("Selecione a operação matemática (1 a 4): ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		codigo = leitor.nextInt();
		
		leitor.close();
		
		switch (codigo) {
		case 1:
			soma = numero1 + numero2;
			System.out.println("A soma dos números é " + soma);
			break;
		case 2:
			subtracao = numero1 - numero2;
			System.out.println("A subtração dos números é " + subtracao);
			break;
		case 3:
			multiplicacao = numero1 * numero2;
			System.out.println("A multiplicação dos números é " + multiplicacao);
			break;
		case 4:
			divisao = numero1 / numero2;
			System.out.println("A divisão dos números é " + divisao);
			break;
		default:
			System.out.println("Opção Inválida!");
			return;
		}
		
	}

}
