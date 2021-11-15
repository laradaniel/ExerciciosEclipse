package Exercicios;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
			
		produtoEletronico[] produtos = new produtoEletronico[3];
		
		produtos[0] = new produtoEletronico(1900,"Iphone 7");
		produtos[1] = new produtoEletronico(3700,"Nintendo Switch");
		produtos[2] = new produtoEletronico(2800,"TV Smart");
		
		for(produtoEletronico roda : produtos) {
			roda.ImprimirInfo();
		}
		
		System.out.println("*************************************************************************");
		
		for(produtoEletronico roda:produtos) {
			roda.desconto(10);
			roda.ImprimirInfo();
		}
	}
}
