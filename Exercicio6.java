package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		/*
		Construa um programa que, tendo como dados de entrada dois pontos
		quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
		que efetua tal cálculo é: d= raiz quadrada de (x2-x1)^2 + (y2 - y1)^2
		*/
		
		Scanner ler = new Scanner(System.in);
		
		double x1,y1,x2,y2,d;
		
		System.out.println("Digite um valor para a posição x1: ");
		x1 = ler.nextDouble();
		System.out.println("Digite um valor para a posição y1: ");
		y1 = ler.nextDouble();
		System.out.println("Digite um valor para a posição x2: ");
		x2 = ler.nextDouble();
		System.out.println("Digite um valor para a posição y2: ");
		y2 = ler.nextDouble();
		
		d = Math.sqrt((Math.pow((x2-x1),2.0) + Math.pow((y2-y1),2.0)));
		
		System.out.println("\nA distância entre os pontos P("+x1+","+y1+") e P("+x2+","+y2+") é igual a: "+d);
	}

}
