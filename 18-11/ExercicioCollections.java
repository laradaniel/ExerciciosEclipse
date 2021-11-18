package Exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollections {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
		 int op;
		 
		 ArrayList<String> estoque = new ArrayList();
		 
		 do {
			 System.out.println("\n[1] Armazenar produtos ao estoque;");
			 System.out.println("\n[2] Remover produtos do estoque;");
			 System.out.println("\n[3] Atualizar produtos do estoque;");
			 System.out.println("\n[4] Exibir produtos do estoque;");
			 System.out.println("\n[5] Sair do programa.");
			 System.out.println("\n\nEscolha uma opção: ");
			 op = ler.nextInt();
			 
			 switch(op) {
			 case 1:
				 ler.nextLine();
				 System.out.println("\nInsira o nome do produto: ");
				 String produto1 = ler.nextLine();
				 estoque.add(produto1);
				 break;
			
			 case 2:
				 ler.nextLine();
				 System.out.println("\nInsira o nome do produto: ");
				 String produto2 = ler.nextLine();
				 	if(estoque.contains(produto2)){
				 		estoque.remove(produto2);
				 	}
				 	else
				 	{
				 		System.out.println("\nProduto não encontrado...");
				 	}
				 	break;
			
			 case 3:
				 ler.nextLine();
				 System.out.println("\nInsira o nome produto que deseja atualizar:");
				 String verifica = ler.nextLine();
				 System.out.println("\nInsite o nome atualizado do produto: ");
				 String novo = ler.nextLine();
				 	if(estoque.contains(verifica)) {
				 		estoque.remove(verifica);
				 		estoque.add(novo);
				 	}
				 	else
				 	{
				 		System.out.println("\nProduto não encontrado...");
				 	}
				 	System.out.println("\n"+estoque);
				 	break;
			 case 4:
				 System.out.println("Produtos do estoque: ");
				 System.out.println(estoque);
				 break;
				 default:
					 System.out.println("Programa encerrado...");
					 break;
			 }
			  
		 }while(op!=5);

	}

}
