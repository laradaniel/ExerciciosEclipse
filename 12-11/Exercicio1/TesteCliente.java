package Exercicios;

public class TesteCliente {

	public static void main(String[] args) {
			
		Cliente cliente1 = new Cliente("Maria Joana da Silva",57,"ela/dela");
		cliente1.imprimirInfoCliente();
		System.out.println("\n***Alteração no Nome Completo***");
		cliente1.setNomeCompleto("Maria Joana da Silva Pereira");
		cliente1.imprimirInfoCliente();
		
		Cliente cliente2 = new Cliente("Joey Almeida Pascoal",27,"elu/delu");
		cliente2.imprimirInfoCliente();
		System.out.println("\n***Correção idade do cliente***");
		cliente2.setIdade(23);
		cliente2.imprimirInfoCliente();
		
	}

}
