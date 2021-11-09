package Exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	
		/*
		Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
		Considerando x=(c*e - b*f) / (a*e - b*d) e y=(a*f - c*d) / (a*g - b*d).
		*/
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c,d,e,f,x,y;
		
		System.out.println("Digite um valor para A: ");
		a = ler.nextInt();
		System.out.println("Digite um valor para B: ");
		b = ler.nextInt();
		System.out.println("Digite um valor para C: ");
		c = ler.nextInt();
		System.out.println("Digite um valor para D: ");
		d = ler.nextInt();
		System.out.println("Digite um valor para E: ");
		e = ler.nextInt();
		System.out.println("Digite um valor para F: ");
		f = ler.nextInt();
		
		x=(c*e - b*f) / (a*e - b*d);
		y=(a*f - c*d) / (a*e - b*d);
		
		System.out.println("Os valores de X e Y são, respectivamente:"+x+" e "+y);

	}

}
