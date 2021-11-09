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
		
		int n;
		double resultado;
		
		System.out.println("Digite um número qualquer: ");
		n = ler.nextInt();
		
		if(n%2==0) {
			resultado = Math.sqrt(n);
			System.out.println("Número Par | Raiz Quadrada: "+ resultado);
		}
		else {
			resultado = Math.pow(n, 2);
			System.out.println("Número Ímpar | Elevado ao quadrado: "+ resultado);
		}

	}

}
