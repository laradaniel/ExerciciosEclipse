package Exercicios;

public class Aviao {
		private String passageiro;
		private int numAssento;
		private String destino;
		
		public Aviao(String passageiro,int numAssento, String destino)
		{
			this.passageiro = passageiro;
			this.numAssento = numAssento;
			this.destino = destino;
		}
		
		public void imprimirInfo()
		{
			System.out.println(passageiro+" | Assento: "+numAssento+" | Destino: "+destino);
		}

		public String getPassageiro() {
			return passageiro;
		}

		public void setPassageiro(String passageiro) {
			this.passageiro = passageiro;
		}

		public int getNumAssento() {
			return numAssento;
		}

		public void setNumAssento(int numAssento) {
			this.numAssento = numAssento;
		}

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}
		
}
