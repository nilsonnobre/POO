class TesteObjeto{
	
	int valor;
	

	int valorX3(){
		return valor*3;
	}

	void imprimeValor(TesteObjeto referencia){
		System.out.print(referencia.valor);
		System.out.println(this.valorX3());
	}


	public static void main (String[] args){
		
		valor = 10;
		TesteObjeto objeto1 = new TesteObjeto();
		objeto1.valor=10;
		TesteObjeto objeto2 = new TesteObjeto();
		objeto2.valor=7;

		objeto1.imprimeValor(objeto2);

	}

}

