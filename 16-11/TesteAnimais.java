package Exercicios;

public class TesteAnimais {

	public static void main(String[] args) {
		Preguica preguica = new Preguica("Preguicinha", 3, "aaaa","subir");
		Cachorro cachorro = new Cachorro("Zoe",2,"auau","correr");
		Cavalo cavalo = new Cavalo("Totó",6,"ííirá","correr");
		
		Animal[] animais = new Animal[3];
		animais[0] = preguica;
		animais[1] = cachorro;
		animais[2] = cavalo;
		
		for (Animal lista : animais) {
			System.out.println(lista.getSom());
		}
	}
}