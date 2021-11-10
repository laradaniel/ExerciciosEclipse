package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		Crie um programa que leia um número do teclado até que encontre um número
		igual a zero. No final, mostre a soma dos números digitados.
		*/

		Scanner ler = new Scanner(System.in);

		int n, soma = 0;

		do {
			System.out.println("Digite um número do teclado: ");
			n = ler.nextInt();

			soma += n;

		} while (n != 0);

		System.out.println("A soma dos números é de: " + soma);

	}

}
