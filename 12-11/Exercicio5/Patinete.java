package Exercicios;

public class Patinete {
		private String cor;
		private int rodas;
		private double peso;
		
		public Patinete(String cor, int rodas, double peso) {
			this.cor = cor;
			this.rodas = rodas;
			this.peso = peso;
		}
		
		public void imprimirInfo(){
			System.out.println("Cor: "+cor+"\tQuantidade de rodas: "+rodas+"\nPeso: "+peso+"kg");
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public int getRodas() {
			return rodas;
		}

		public void setRodas(int rodas) {
			this.rodas = rodas;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		
}
