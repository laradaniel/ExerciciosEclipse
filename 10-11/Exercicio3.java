package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99.
		 */

		Scanner ler = new Scanner(System.in);

		int x, cont21 = 0, cont50 = 0;

		System.out.println("Digite a idade: ");
		x = ler.nextInt();

		while (x != -99) {
			if (x < 21) {
				cont21++;
			} else if (x > 50) {
				cont50++;
			}

			System.out.println("Digite a idade: ");
			x = ler.nextInt();
		}

		System.out.println("Total menores de 21: " + cont21 + "\nTotal maiores de 50: " + cont50);
	}

}
