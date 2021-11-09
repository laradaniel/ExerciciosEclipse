package Exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		/* 
		O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		consumidor.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		double custoFabrica,custoConsumidor;
		
		
		System.out.println("Digite o custo de fábrica do carro: ");
		custoFabrica = ler.nextDouble();
		
		custoConsumidor = (custoFabrica*0.28)+(custoFabrica*0.45)+custoFabrica;
		
		System.out.println("O valor do carro para o consumidor será de: "+custoConsumidor);

	}

}
