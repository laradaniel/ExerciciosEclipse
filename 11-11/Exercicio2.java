package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		Os n�meros pares digitados; a soma dos n�meros pares digitados; 
		os n�meros �mpares digitados; a quantidade de n�meros �mpares digitados.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		int [] valor = new int [6];
		int i,somaPar=0,contImpar=0;
		
		for(i=0;i<6;i++) {
			System.out.println("\nDigite o "+(i+1)+"� valor: ");
			valor[i] = ler.nextInt();
			
			if(valor[i]%2==0) {
				somaPar+=valor[i];
			}
			else {
				contImpar++;
			}
		}
		
		System.out.println("\nN�meros pares digitados: ");
		for(int a : valor) {
			if(a%2==0) {
			System.out.println(a);
			}
		}
		System.out.print("\nA soma dos n�meros pares: "+somaPar);
		
		System.out.println("\nN�meros �mpares digitados: ");
		for(int a : valor) {
			if(a%2!=0) {
			System.out.println(a);
			}
		}
		System.out.print("\nA quantidade de n�meros �mpares: "+contImpar);
	}

}
