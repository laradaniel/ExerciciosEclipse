package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		Faça um programa que leia duas matrizes 2 x 2 com valores reais.
		Ofereça ao usuário um menu de opções: (1) somar as duas matrizes; 
		(2) subtrair a primeira matriz da segunda; (3) adicionar uma constante as duas matrizes;
		(4) imprimir as matrizes. Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada.
		Na terceira opção o valor da constante deve ser lido e o resultado da adição
		da constante deve ser armazenado na própria matriz.
		*/
		 
		Scanner ler = new Scanner(System.in);
		
		int linha, coluna, var,op;
		int[][] array1 = new int [2][2];
		int [][] array2 = new int [2][2];
		int [][] array3 = new int [2][2];
		
		System.out.printf("\n\tMatriz 1");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.printf("\nEntre com valor de [%d][%d]: ",linha,coluna);
				array1[linha][coluna] = ler.nextInt();
			}
		}
		
		System.out.printf("\n\tMatriz 2");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.printf("\nEntre com valor de [%d][%d]: ",linha,coluna);
				array2[linha][coluna] = ler.nextInt();
			}
		}
		
		do {
			System.out.println("\n(1) Somar as duas matrizes;"
							+ "\n(2) Subtrair a primeira matriz da segunda;"
							+ "\n(3) Adicionar uma constante as duas matrizes;"
							+ "\n(4) Imprimir as matrizes;"
							+ "\n(5) Sair do programa."
							+ "\nEscolha uma opção: ");
			op = ler.nextInt();
			
			switch(op){
				case 1:
					System.out.println("Soma: \n");
					for(linha=0;linha<2;linha++) {
						for(coluna=0;coluna<2;coluna++) {
							array3[linha][coluna] = array1[linha][coluna] + array2[linha][coluna];
							System.out.println(array3[linha][coluna]);
						}
					}
					break;
				case 2:
					System.out.println("Diferença: \n");
					for(linha=0;linha<2;linha++) {
						for(coluna=0;coluna<2;coluna++) {
							array3[linha][coluna] = array1[linha][coluna] - array2[linha][coluna];
							System.out.println(array3[linha][coluna]);
						}
					}
					break;
				case 3:
					System.out.println("Digite o valor: \n");
					var = ler.nextInt();
					for(linha=0;linha<2;linha++) {
						for(coluna=0;coluna<2;coluna++) {
							array1[linha][coluna] = array1[linha][coluna]+var;
							System.out.println(array1[linha][coluna]);
						}
					}
					for(linha=0;linha<2;linha++) {
						for(coluna=0;coluna<2;coluna++) {
							array2[linha][coluna] = array2[linha][coluna]+var;
							System.out.println(array2[linha][coluna]);
						}
					}
					break;
				case 4:
					System.out.printf("\n\tMatriz 1\n");
					for(linha=0;linha<2;linha++) {
						for(coluna=0;coluna<2;coluna++) {
							System.out.println(array1[linha][coluna]);
						}
					}
					System.out.printf("\n\tMatriz 2\n");
					for(linha=0;linha<2;linha++) {
						for(coluna=0;coluna<2;coluna++) {
							System.out.println(array2[linha][coluna]);
						}
					}
					break;
				case 5:
					System.out.println("\nSistema encerrado!!");
					break;
				default:
					System.out.println("\nOpção inválida!! Escolha novamente...\n");	
			}
		}while(op!=5);
}
}
