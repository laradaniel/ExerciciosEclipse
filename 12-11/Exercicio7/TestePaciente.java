package Exercicios;

public class TestePaciente {
	
	public static void main (String[] args) {
		
		Paciente[] pacientes = new Paciente[3];
		
		pacientes[0] = new Paciente(1234,"Flecha Pêra","Gripe");
		pacientes[1] = new Paciente(4567,"Roberto Pêra","Loucura");
		pacientes[2] = new Paciente(7899,"Toninho Rodrigues","Paixão");
		
		for(Paciente roda : pacientes) {
			roda.imprimirInfo();
		}
		
	}	

}
