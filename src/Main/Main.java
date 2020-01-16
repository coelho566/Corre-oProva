package Main;

import Models.Funcionarios;
import Models.Gerente;
import Models.Supervisor;
import Models.Vendedor;

public class Main {
	
	public static void main(String[] args) {
		
		Funcionarios gerente = new Gerente("João kriger", 44, 20000.00);
		Funcionarios supervisor = new Supervisor("Pedro rocha", 42, 15000.00);
		Funcionarios Vendedor = new Vendedor("Irineu", 28, 5000.00);
		
		System.out.println(gerente);
		System.out.println(supervisor);
		System.out.println(Vendedor);
	}
}
