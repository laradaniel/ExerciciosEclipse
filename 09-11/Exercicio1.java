package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner ler = new Scanner(System.in);
		
		float n1,n2,n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = ler.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		n2 = ler.nextFloat();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = ler.nextFloat();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O maior n�mero �: "+n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("O maior n�mero �: "+n2);
		}
		else {
			System.out.println("O maior n�mero �: "+n3);
		}
	}

}
