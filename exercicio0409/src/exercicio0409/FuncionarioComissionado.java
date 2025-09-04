package exercicio0409;

public class FuncionarioComissionado extends Funcionario {
	
	public double comissao;
	
	public double calcularSalario() {
		
		return salarioBase + comissao;
	}
}
