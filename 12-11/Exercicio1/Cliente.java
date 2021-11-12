package Exercicios;

public class Cliente {
		private String nomeCompleto;
		private int idade;
		private String pronomes;
		
		//Construtor
		public Cliente(String nomeCompleto, int idade, String pronomes)
		{
			this.nomeCompleto = nomeCompleto;
			this.idade = idade;
			this.pronomes = pronomes;
		}
		
		//Outros métodos
		public void imprimirInfoCliente()
		{
			System.out.println("Cliente "+nomeCompleto+", "+idade+" anos, pronomes "+pronomes);		
		}
		
		//Métodos set e get
		public String getNomeCompleto() {
			return nomeCompleto;
		}

		public void setNomeCompleto(String nomeCompleto) {
			this.nomeCompleto = nomeCompleto;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getGenero() {
			return pronomes;
		}

		public void setGenero(String pronomes) {
			this.pronomes = pronomes;
		}
		
		
}
