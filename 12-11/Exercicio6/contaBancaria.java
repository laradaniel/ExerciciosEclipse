package Exercicios;

import java.text.NumberFormat;

public class contaBancaria {
	private String nome;
	private double saldo;
	private String banco;
	
	public contaBancaria(String nome, double saldo, String banco) {
		this.nome = nome;
		this.saldo = saldo;
		this.banco = banco;
	}
	
	public String formatarSaldo() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String fSaldo = nf.format(saldo);
		return fSaldo;
	}
	
	public void imprimirInfo() {
		System.out.println(nome+"\nSaldo: "+formatarSaldo()+"\tBanco: "+banco);
	}
	
	public void rendimento(double percentual) {
		saldo = saldo+(saldo*(percentual/100));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
}
