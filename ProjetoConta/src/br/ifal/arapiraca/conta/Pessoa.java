package br.ifal.arapiraca.conta;

public class Pessoa {

	private String nome;
	private String cpf;
	private Conta conta;
	
	public Pessoa(String nome, String cpf, Conta conta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String nome = "João";
		String cpf = "928411314";
		
	}
	
	
}
