package lacoCondicionalExercicio;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre
		// na tela uma mensagem indicando se este número é par ou ímpar e se o número é
		// positivo ou negativo.

		Scanner leitor = new Scanner(System.in);

		int num;

		System.out.println("Digite um número inteiro: ");
		num = leitor.nextInt();

		leitor.close();

		if (num % 2 == 0 && num >= 0) {
			System.out.println("Número Par e positivo!");
		} else if (num % 2 == 0 && num < 0) {
			System.out.println("Número Par e negativo!");
		} else if (num % 2 == 1 && num >= 0) {
			System.out.println("Número Ímpar e positivo!");
		} else {
			System.out.println("Número Ímpar e negativo!");
		}

	}

}
