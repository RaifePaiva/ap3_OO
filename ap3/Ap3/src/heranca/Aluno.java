package heranca;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	
	public String matricula;
	
	public Aluno(String matricula, String _nome, String _cpf, LocalDate _data) {
		super(_nome, _cpf, _data);
		this.matricula = matricula;
	}
	
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", "
				+ "cpf=" + cpf + ", data_nascimento="
				+ data_nascimento + "]";
	}
	
	
	

}

