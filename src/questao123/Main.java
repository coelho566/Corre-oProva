package questao123;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa("Jo�o", 15);
		Pessoa leandro = new Pessoa("Leandro", 21);
		Pessoa paulo = new Pessoa("Paulo", 17);
		Pessoa jessica = new Pessoa("Jessica", 18);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(joao);
		pessoas.add(leandro);
		pessoas.add(paulo);
		pessoas.add(jessica);
		
		System.out.println("Quest�o 1");
		int maior = 0;
		String nome = "";
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getIdade() > maior) {
				maior = pessoa.getIdade();
				nome = pessoa.getNome();
			}
		}
		System.out.println("Pessoa mais velha � "+ nome);
		
		System.out.println("\nQuest�o 2 ");
		for (int i = 0; i < pessoas.size(); i++) {
			
			if(pessoas.get(i).getIdade() < 18) {
				pessoas.remove(i);
			}
			System.out.println(pessoas.get(i));
		}
		
		System.out.println("\nQuest�o 3 ");
		for (Pessoa pessoa : pessoas) {
			
			if(pessoa.getNome().equalsIgnoreCase("Jessica")) {
				System.out.println("Idade: "+pessoa.getIdade());
			}
		}
	}
}
