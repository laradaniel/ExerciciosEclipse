package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
		igual a zero. No final, mostre a soma dos n�meros digitados.
		*/

		Scanner ler = new Scanner(System.in);

		int n, soma = 0;

		do {
			System.out.println("Digite um n�mero do teclado: ");
			n = ler.nextInt();

			soma += n;

		} while (n != 0);

		System.out.println("A soma dos n�meros � de: " + soma);

	}

}
