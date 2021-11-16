package Exercicios;

public class Paciente {
	private int codigo;
	private String nome;
	private String diagnostico;
	
	public Paciente(int codigo, String nome, String diagnostico) {
		this.codigo = codigo;
		this.nome = nome;
		this.diagnostico = diagnostico;
	}
	
	public void imprimirInfo() {
		System.out.println(codigo+"\t"+nome+"\tDiagnóstico: "+diagnostico);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	
}
