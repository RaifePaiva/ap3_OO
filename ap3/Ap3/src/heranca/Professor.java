package heranca;

import java.time.LocalDate;

public class Professor extends Pessoa{
	
	public double salario;
	public String disciplina;
	
	public Professor(String _nome, String _cpf, LocalDate _data, double salario,  
			String disciplinha) {
		super(_nome, _cpf, _data);
		this.salario = salario;
		this.disciplina = disciplinha;
	}
	
	
	
	@Override
	public String toString() {
		return "Professor [salario=" + salario + ", disciplina=" + disciplina + ","
				+ " nome=" + nome + ", cpf=" + cpf
				+ ", data_nascimento=" + data_nascimento + "]";
	}
	
	
	
	

}
