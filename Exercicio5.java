package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		/* 
		Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
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

		System.out.printf("\nA média ponderada do aluno é: %.2f",media);
	}

}
