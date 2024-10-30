package lacoCondicionalExercicio;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		// Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na
		// tela se a soma de A + B é maior, menor ou igual a C.

		Scanner leitor = new Scanner(System.in);

		int a, b, c;

		System.out.println("Digite o valor de A: ");
		a = leitor.nextInt();

		System.out.println("Digite o valor de B: ");
		b = leitor.nextInt();

		System.out.println("Digite o valor de C: ");
		c = leitor.nextInt();

		leitor.close();

		if (a + b > c) {
			System.out.println("A soma de A + B é Maior que C");
		} else if (a + b < c) {
			System.out.println("A soma de A + B é Menor que C");
		} else {
			System.out.println("A soma de A + B é igual a C");
		}

	}
}
