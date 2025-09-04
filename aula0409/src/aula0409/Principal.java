package aula0409;

public class Principal {
	
	public static void main(String[] args) { // Main
		
		Carro c1 = new Carro(); // Criação de um novo objeto
		c1.marca = "Fiat"; // Marca usando o extend do automovel em carro
		c1.modelo = "Pulse"; // Modelo usando o extend do automovel em carro
		c1.ano = 2026; // Ano usando o extend do automovel em carro
		c1.ligar(); // Método com parâmetro, que é diferente do método sem necessidade do parâmetro
	}
}
