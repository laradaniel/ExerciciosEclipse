package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros.
		O programa deve executar os seguintes passos: 
		(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das
			posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
		(d) Mostre na tela cada valor do vetor A, um em cada linha.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int [] a = new int[] {1,0,5,-2,-5,7};
		int soma, i;
		
		soma = a[0] + a[1] + a[5];
		a[4] = 100;
		
		System.out.println("Soma entre a[0], a[1] e a[5]: "+soma);
		System.out.println("vetor A:");
		
		for(i=0;i<6;i++) {
			System.out.println(a[i]);
		}
	}

}
