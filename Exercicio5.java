package lacoCondicionalExercicio;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int opcao, quantidade;
		String produto;
		double precoUnitario = 0.0;

		System.out.println("### Menu ###");
		System.out.println("Código do produto\t" + "Produto\t" + "\tPreço Unitário\t");
		System.out.println("\t1\t" + "\tCachorro Quente\t" + "\tR$ 10.00\t");
		System.out.println("\t2\t" + "\tX-Salada\t" + "\tR$ 15.00\t");
		System.out.println("\t3\t" + "\tX-Bacon\t" + "\t        R$ 18.00\t");
		System.out.println("\t4\t" + "\tBauru\t" + "\t        R$ 12.00\t");
		System.out.println("\t5\t" + "\tRefrigerante\t" + "\tR$ 8.00\t");
		System.out.println("\t6\t" + "\tSuco de Laranja\t" + "\tR$ 13.00\t");

		System.out.println("Digite o código do produto (1 a 6)");
		opcao = leitor.nextInt();

		System.out.println("Digite a quantidade: ");
		quantidade = leitor.nextInt();

		leitor.close();

		switch (opcao) {
		case 1:
			produto = "Cachorro Quente";
			precoUnitario = 10.00;
			break;
		case 2:
			produto = "X-Salada";
			precoUnitario = 15.00;
			break;
		case 3:
			produto = "X-Bacon";
			precoUnitario = 18.00;
			break;
		case 4:
			produto = "Bauru";
			precoUnitario = 12.00;
			break;
		case 5:
			produto = "Refrigerante";
			precoUnitario = 8.00;
			break;
		case 6:
			produto = "Suco de Laranja";
			precoUnitario = 13.00;
			break;
		default:
			System.out.println("Opção inválida!");
			return;
		}

		double valorTotal = precoUnitario * quantidade;

		System.out.println("Produto: " + produto);
		System.out.println("Quantidade " + quantidade);
		System.out.println("Valor total - R$: " + valorTotal);
	}
}
