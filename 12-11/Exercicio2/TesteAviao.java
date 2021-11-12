package Exercicios;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao passageiro1 = new Aviao("Caroline Nascimento",001,"Fortaleza-CE");
			passageiro1.imprimirInfo();
			System.out.println("***Alteração do assento***");
			passageiro1.setNumAssento(102);
			passageiro1.imprimirInfo();
			
		Aviao passageiro2 = new Aviao("Gloria Groove",020,"Miami-FL");
			passageiro2.imprimirInfo();
			System.out.println("***Alteração do nome***");
			passageiro2.setPassageiro("Daniel Garcia");
			passageiro2.imprimirInfo();

	}

}
