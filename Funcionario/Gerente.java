class Gerente extends Funcionario{

	Gerente(){
		System.out.println("Criando um Gerente!");	
	}
	
	Gerente(String nomeFunc, double valor, int cpfFunc){
		this.salario = valor;
		this.nome = nomeFunc;
		this.cpf = cpfFunc;
	}

	void darAumento(Funcionario f){
		if(f.salario>1000)
			f.mudaSalario(f.salario+100);
		else
			f.mudaSalario(f.salario+200);
	}

	public static void main(String[] args){
		Gerente g = new Gerente("José", 3200, 385321);
		
		Funcionario f = new Funcionario();
		f.salario = 900;
		g.darAumento(f);
		g.mudaSalario(5000);

		System.out.println(g.salario);
	}

}
