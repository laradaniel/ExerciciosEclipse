package Exercicios;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete p1 = new Patinete("verde",4,3.0);
		p1.imprimirInfo();
		System.out.println("****Mudança de cor****");
		p1.setCor("vermelho");
		p1.imprimirInfo();
		
		Patinete p2 = new Patinete("laranja",2,2.8);
		p2.imprimirInfo();
		System.out.println("****Mudança na quantidade de rodas****");
		p2.setRodas(3);
		p2.imprimirInfo();

	}

}
