package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/* 
		Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos
		e mostre-o expresso em horas, minutos e segundos.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		int segundos, minutos, horas, duracao;
		
		System.out.println("Digite a dura��o do evento em segundos: ");
		duracao = ler.nextInt();
		
		horas = duracao/3600;
		minutos = (duracao%3600)/60;
		segundos = (duracao%3600)%60;
		
		System.out.println("O evento durou: "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
		
		

	}

}
