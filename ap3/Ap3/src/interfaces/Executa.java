package interfaces;

public class Executa{
	
	
	public static void main(String[] args) {
		
		Pessoa pessoa  = new Pessoa();
		
		System.out.println("Meu nome é: " + pessoa.getNome()
			+ "\n tenho " + pessoa.getIdade() + " anos e"
			+ "\n estou nesse momento " + pessoa.andar() + " para casa."
		);
		
		
	}


}

