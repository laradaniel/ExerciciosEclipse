package Exercicios;

public class TesteContaBancaria {

	public static void main(String[] args) {
		contaBancaria pessoa1 = new contaBancaria("Carol Caroline",1000000,"NUBANK");
		pessoa1.imprimirInfo();
		System.out.println("****************Rendimento****************");
		pessoa1.rendimento(1);
		pessoa1.imprimirInfo();
		
		contaBancaria pessoa2 = new contaBancaria("Lara Dan",100,"Original");
		pessoa2.imprimirInfo();
		System.out.println("****************Rendimento****************");
		pessoa2.rendimento(1);
		pessoa2.imprimirInfo();
	}

}
