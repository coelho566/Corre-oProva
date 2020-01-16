package Models;

public abstract class Funcionarios {
	
	private String nome;
	private int idade;
	private double salario;

	
	public Funcionarios() {
		
	}
	
	public Funcionarios(String nome, int idade, double salario) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSalario(salario);
	}
	
	@Override
	public String toString() {
		return "\nFuncionario\nnome: " + nome + "\nidade:" + idade + "\nsalario: R$ " + salario + "\nTotal com bonus: R$ " + bonificacao();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double bonificacao();
	
	
}
