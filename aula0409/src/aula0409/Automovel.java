package aula0409;

public class Automovel {
	
	public String marca; // Criação do atributo do tipo String, s maiusculo por causa que é uma classe
	public String modelo; // Criação do atributo do tipo String 
	public int ano; // Criação do atributo do tipo int
	
	// Sobrecarga
	
	public void ligar() { // Criação do método sem parâmetro
		
		System.out.println("Automovel ligado!");
	}
	
	public void ligar(boolean usouAfogador) { // Criação do método com parâmetro
		
		if(usouAfogador) {
			
			System.out.println("Automovel ligado!");
		} else {
			
			System.out.println("Automovel Afogado!");
		}
	}
}
