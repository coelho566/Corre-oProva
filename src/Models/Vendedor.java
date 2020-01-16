package Models;

public class Vendedor extends Funcionarios {

	

	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double bonificacao() {
		double bonus = this.getSalario() + 3000.00;
		return bonus;
	}

}
