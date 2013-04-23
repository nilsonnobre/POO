import java.util.Scanner;

class Funcionario{
	//ATRIBUTOS
	 String nome;
	 double salario;
	 int cpf;
	//CONSTRUTORES
	public Funcionario(){
		System.out.println("CRIANDO UM FUNCIONÁRIO!");
		this.salario = 678;
	}
	public Funcionario(double valor, String nomeFunc, int cpfFunc){
		System.out.println("CRIANDO UM FUNCIONÁRIO!");
		this.salario = valor;
		this.nome = nomeFunc;
		this.cpf = cpfFunc;
		System.out.println("NOme: "+nome+" salario: "+salario+" cpf: "+cpf);
	}
	//MÉTODOS
	public void mudaSalario(double valor){
		if(valor<678)
			System.out.println("Salário Inválido!");
		else
			this.salario=valor;
	}

	public double getSalario(){
		return salario;
	}

	public static void main(String[] args){
		Funcionario f1 = new Funcionario(1200.0, "João", 58385328);
		Funcionario f2 = new Funcionario();
//		System.out.println(f1.salario);
//		f1.mudaSalario(1500.00);
//		System.out.println(f1.salario);

		Empresa coringa = new Empresa();
		coringa.adiciona(f1);

		System.out.println(coringa.empregados[0].nome);

	}
}


class Empresa {
	// outros atributos
	Funcionario[] empregados;
	String cnpj;
	int qtdeFuncionario;

	Empresa(){
		empregados = new Funcionario[10];
		qtdeFuncionario=0;
	}

	void adiciona(Funcionario f) {
		System.out.println(qtdeFuncionario);
		empregados[qtdeFuncionario] = f;
		qtdeFuncionario++;
	}

	void mostraEmpregados() {
		for (int i = 0; i < this.qtdeFuncionario; i++) {
			System.out.println("Funcionário na posição: " + i);
			System.out.println("Funcionário na posição: " + empregados[i].nome);
			// preencher para mostrar outras informacoes do funcionario
		}
	}	
	
}



