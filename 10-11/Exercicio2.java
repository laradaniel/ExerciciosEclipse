package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		// Ler 10 números e imprimir quantos são pares e quantos são ímpares.

		Scanner ler = new Scanner(System.in);

		int num, x, contPar = 0, contImpar = 0;

		for (x = 1; x <= 10; x++) {

			System.out.println("Digite o " + x + "º número: ");
			num = ler.nextInt();

			if (num % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		System.out.println("Pares: " + contPar + "\nÍmpares: " + contImpar);
	}

}
