package exercicio0409;

public class Principal {
	
	public static void main(String[] args) {
		
		FuncionarioCLT f1 = new FuncionarioCLT();
		f1.cpf = "019.289.789.01";
		f1.nome = "João da Silva";
		f1.salarioBase = 1200;
		
		System.out.println(f1.calcularSalario());
		
		FuncionarioComissionado f2 = new FuncionarioComissionado();
		f2.cpf = "123.456.789.01";
		f2.nome = "Felipe";
		f2.salarioBase = 2000;
		f2.comissao = 100;
		
		System.out.println(f2.calcularSalario());
		
		FuncionarioPJ f3 = new FuncionarioPJ();
		f3.cpf = "987.654.321.00";
	}
}
