package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		/* 
		Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
		aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		float nota1,nota2,nota3,media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("Digite a primeira nota: ");
		nota2 = ler.nextFloat();
		System.out.println("Digite a primeira nota: ");
		nota3 = ler.nextFloat();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5))/10;

		System.out.printf("\nA m�dia ponderada do aluno �: %.2f",media);
	}

}
