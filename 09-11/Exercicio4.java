package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/*
		Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		double n;
		
		System.out.println("Digite um número qualquer: ");
		n = ler.nextDouble();
		
		if(n%2==0) {
			System.out.println("Número Par | Raiz Quadrada: "+ Math.sqrt(n));
		}
		else {
			System.out.println("Número Ímpar | Elevado ao quadrado: "+ Math.pow(n, 2));
		}

	}

}
