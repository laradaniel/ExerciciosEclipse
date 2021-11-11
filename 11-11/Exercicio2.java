package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		Faça um programa que receba 6 números inteiros e mostre: 
		Os números pares digitados; a soma dos números pares digitados; 
		os números ímpares digitados; a quantidade de números ímpares digitados.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		int [] valor = new int [6];
		int i,somaPar=0,contImpar=0;
		
		for(i=0;i<6;i++) {
			System.out.println("\nDigite o "+(i+1)+"º valor: ");
			valor[i] = ler.nextInt();
			
			if(valor[i]%2==0) {
				somaPar+=valor[i];
			}
			else {
				contImpar++;
			}
		}
		
		System.out.println("\nNúmeros pares digitados: ");
		for(int a : valor) {
			if(a%2==0) {
			System.out.println(a);
			}
		}
		System.out.print("\nA soma dos números pares: "+somaPar);
		
		System.out.println("\nNúmeros ímpares digitados: ");
		for(int a : valor) {
			if(a%2!=0) {
			System.out.println(a);
			}
		}
		System.out.print("\nA quantidade de números ímpares: "+contImpar);
	}

}
