package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

		Scanner ler = new Scanner(System.in);

		int num, x, contPar = 0, contImpar = 0;

		for (x = 1; x <= 10; x++) {

			System.out.println("Digite o " + x + "� n�mero: ");
			num = ler.nextInt();

			if (num % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		System.out.println("Pares: " + contPar + "\n�mpares: " + contImpar);
	}

}
