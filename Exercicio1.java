package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/*
		Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias
		e mostre-a expressa apenas em dias.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		int dias, meses, anos, total;
		
		System.out.println("Digite sua idade em anos: ");
		anos = ler.nextInt();
		
		System.out.println("Digite quantos meses: ");
		meses = ler.nextInt();
		
		System.out.println("Digite quantos dias: ");
		dias = ler.nextInt();
		
		total = (365*anos + 30*meses + dias);
		
		System.out.println("Você tem " + total + " dias de vida.");
		
	}

}
