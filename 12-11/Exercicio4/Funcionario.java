package Exercicios;

import java.text.NumberFormat;

public class Funcionario {
		private String nome;
		private float salario;
		private String periodo;
		
		public Funcionario(String nome, float salario, String periodo) {
			this.nome = nome;
			this.salario = salario;
			this.periodo = periodo;
		}
		
		
		public String formatarSalario() {
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String fSalario = nf.format(salario);
			return fSalario;
		}
		
		public void imprimirInfo() {
			System.out.println(nome+"\tsalário: "+formatarSalario()+"\tperíodo: "+periodo);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public float getSalario() {
			return salario;
		}

		public void setSalario(float salario) {
			this.salario = salario;
		}

		public String getPeriodo() {
			return periodo;
		}

		public void setPeriodo(String periodo) {
			this.periodo = periodo;
		}
		
		
		
}
