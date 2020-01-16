package Models;

public class Supervisor extends Funcionarios {

	

	public Supervisor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double bonificacao() {
		
		double bonus = this.getSalario() + 5000.00;
		return bonus;
	}
	
}
