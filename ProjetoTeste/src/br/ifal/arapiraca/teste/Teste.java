package br.ifal.arapiraca.teste;

import java.util.Scanner;


public class Teste {
	
	public String nome;
	public int idade;
	
	public Teste(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}



	public static void main(String[] args) {
		System.out.println("Olá 923-A");
		Scanner leitor = new Scanner(System.in);
		String s = leitor.next();
		System.out.println(s);
		leitor.close();
		
	}
	
}
