package Exercicios;

import java.text.NumberFormat;

public class produtoEletronico {
	private double valor;
	private String nomeProduto;
	
	public produtoEletronico(double valor, String nomeProduto) {
		this.valor = valor;
		this.nomeProduto = nomeProduto;
	}
	
	public void desconto(float percentual) {
		valor = valor-(valor*(percentual/100));
	}
	
	public String formatarValor(){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FValor = nf.format(valor);
		return FValor;
		
	}
	
	public void ImprimirInfo(){
		
			System.out.println(nomeProduto+" \t\t Valor: "+this.formatarValor());
	
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
}
