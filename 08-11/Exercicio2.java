package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias
		e mostre-a expressa em anos, meses e dias.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		int dias, meses, anos, idadeEmDias;
		
		System.out.println("Digite sua idade expressa em dias: ");
		idadeEmDias = ler.nextInt();
		
		anos = idadeEmDias/365;
		meses = (idadeEmDias%365)/30;
		dias = (idadeEmDias%365)%30;
		
		System.out.print("\nVocê tem: "+anos+" ano(s), "+meses+" mes(es) e "+dias+" dias de vida.");
		

	}

}
