package exercicio0409;

public class FuncionarioCLT extends Funcionario {
	
	public double calcularSalario() {
		
		return salarioBase + (salarioBase * 10/100);
	}
}
