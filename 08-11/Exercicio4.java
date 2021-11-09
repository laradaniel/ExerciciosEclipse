package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/* 
		Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
		D=R+S/2, enquanto R=(A+B)^2 e S=(B+C)^2
		*/
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
		double r,s,d;
		
		System.out.println("Digite um número inteiro para A: ");
		a = ler.nextInt();
		System.out.println("Digite um número inteiro para A: ");
		b = ler.nextInt();
		System.out.println("Digite um número inteiro para A: ");
		c = ler.nextInt();
		
		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		d = (r+s)/2;
		
		System.out.println("O resultado da expressão D=(R+S)/2 é: "+d);


	}

}
