package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no
		 * final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
		 */

		Scanner ler = new Scanner(System.in);

		int num = 0, cont = 0, soma = 0;
		double media;

		do {
			System.out.println("Digite um número inteiro: \n(Para sair digite 0)");
			num = ler.nextInt();

			if (num % 3 == 0 && num!=0) {
				cont++;
				soma = soma + num;
			}
		}
		while (num != 0);
		
		media = soma / cont;
		System.out.println("Média dos múltiplos de 3 digitados: "+media);
	}
}