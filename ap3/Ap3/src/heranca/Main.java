package heranca;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno("123", "josé", "1234678998", LocalDate.now());
		Professor professor = new Professor("João", "12345678998", LocalDate.now() ,
				4000.00, "BI");
		
		
		System.out.println(aluno);
		System.out.println(professor);
		
		

	}

}
