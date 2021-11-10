package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/*
		Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
		Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um
		sistema que permita ler os dados de 10 pessoas, calcule e mostre: número de pessoas calmas; número de mulheres nervosas;
		número de homens agressivos; número de outros calmos; número de pessoas nervosas com mais de 40 anos;
		número de pessoas calmas com menos de 18 anos.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		int idade, calma=0,mn=0,p,genero,x=1,ha=0,oc=0,pn40=0,pc18=0;
	
		
		while(x<=10) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			while(idade<=0 || idade>=120) {
				System.out.println("Digite sua idade: ");
				idade = ler.nextInt();
			}
			
			System.out.println("\nGenero\n[1]Feminino \n[2]Masculino \n[3]Outros");
			genero = ler.nextInt();
			while(genero<1 || genero>3) {
				System.out.println("\nGenero\n[1]Feminino \n[2]Masculino \n[3]Outros");
				genero = ler.nextInt();
			}
			
			System.out.println("\nPersonalidade \n[1]Calme \n[2]Nervose \n[3]Agressive");
			p = ler.nextInt();
			while(p<1 || p>3) {
				System.out.println("\nPersonalidade \n[1]Calme \n[2]Nervose \n[3]Agressive");
				p = ler.nextInt();
			}
			
			if(p==1) {
				calma++;
			}
			else if(p==2 && genero==1) {
				mn++;
			}
			else if(p==3 && genero==2) {
				ha++;
			}
			
			if(p==1 && genero==3) {
				oc++;
			}
			
			if (p==3 && idade>40) {
				pn40++;
			}else if(p==1 && idade<18) {
				pc18++;
			}
			x++;
		}
		
		System.out.println("Pessoas calmas: "+calma+
							"\nMulheres nervosas: "+mn+
							"\nHomens agressivos: "+ha+
							"\nOutros calmo: "+oc+
							"\nPessoas nervosas com +40 anos: "+pn40+
							"\nPessoas calmas com -18 anos: "+pc18);
	}

}
