package Exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Piupiu",2700,"manhã");
		funcionario1.imprimirInfo();
		System.out.println("*****Mudança de turno*****");
		funcionario1.setPeriodo("tarde");
		funcionario1.imprimirInfo();
		
		Funcionario funcionario2 = new Funcionario("Frajola",3100,"noite");
		funcionario2.imprimirInfo();
		System.out.println("*****Aumento de salário*****");
		funcionario2.setSalario(4100);
		funcionario2.imprimirInfo();
	}

}
