package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/*
		Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		double n;
		
		System.out.println("Digite um n�mero qualquer: ");
		n = ler.nextDouble();
		
		if(n%2==0) {
			System.out.println("N�mero Par | Raiz Quadrada: "+ Math.sqrt(n));
		}
		else {
			System.out.println("N�mero �mpar | Elevado ao quadrado: "+ Math.pow(n, 2));
		}

	}

}
