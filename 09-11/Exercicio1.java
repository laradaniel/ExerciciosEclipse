package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner ler = new Scanner(System.in);
		
		float n1,n2,n3;
		
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextFloat();
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextFloat();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O maior número é: "+n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("O maior número é: "+n2);
		}
		else {
			System.out.println("O maior número é: "+n3);
		}
	}

}
