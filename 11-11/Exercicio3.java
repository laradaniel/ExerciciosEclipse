package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		Scanner ler = new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		int linha, coluna,cont10=0;
		
		System.out.println("Monte a matriz[3][3]: ");
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("["+(linha+1)+"]["+(coluna+1)+"]: ");
				matriz[linha][coluna] = ler.nextInt();
				
				if(matriz[linha][coluna]>10) {
					cont10++;
				}
			}
		}
		
		System.out.println("Foram digitados "+cont10+" números maiores que 10.");
	}

}
