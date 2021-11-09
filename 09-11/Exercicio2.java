package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner ler = new Scanner(System.in);
		
		float a,b,c;
		
		System.out.println("Digite o primeiro número: ");
		a = ler.nextFloat();
		System.out.println("Digite o segundo número: ");
		b = ler.nextFloat();
		System.out.println("Digite o terceiro número: ");
		c = ler.nextFloat();
		
		if(a>=b && a>=c) {
			if(c>=b) {
				System.out.println(b+" "+c+" "+a);
			}
			else {
				System.out.println(c+" "+b+" "+a);
			}	
		}
		else if(b>=a && b>=c) {
			if(c>=a) {
				System.out.println(a+" "+c+" "+b);
			}
			else {
				System.out.println(c+" "+a+" "+b);
			}
		}
		else if(c>=b && c>=a) {
			if(a>=b) {
				System.out.println(b+" "+a+" "+c);
			}
			else {
				System.out.println(a+" "+b+" "+c);
			}
		}
	}
}
