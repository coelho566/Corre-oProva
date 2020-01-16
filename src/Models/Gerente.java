package Models;

public class Gerente extends Funcionarios {

	

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double bonificacao() {
		double bonus = this.getSalario() + 10000.00;
		return bonus;
	}

}
