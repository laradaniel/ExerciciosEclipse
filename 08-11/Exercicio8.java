package Exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		/* 
		O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
		consumidor.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		double custoFabrica,custoConsumidor;
		
		
		System.out.println("Digite o custo de f�brica do carro: ");
		custoFabrica = ler.nextDouble();
		
		custoConsumidor = (custoFabrica*0.28)+(custoFabrica*0.45)+custoFabrica;
		
		System.out.println("O valor do carro para o consumidor ser� de: "+custoConsumidor);

	}

}
