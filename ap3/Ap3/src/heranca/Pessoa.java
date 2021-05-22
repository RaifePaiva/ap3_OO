package heranca;

import java.time.LocalDate;

public class Pessoa {
	
	
	public String nome;
	public String cpf;
	public LocalDate data_nascimento;

	public Pessoa(String _nome, String _cpf, LocalDate _data) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_nascimento = _data;
	}
	
	
	

}
