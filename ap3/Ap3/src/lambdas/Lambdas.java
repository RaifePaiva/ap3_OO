package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambdas {
	
	
	
	public static void main(String[] args) {
		
		List nomes = Arrays.asList("Juca", "andre", "esteves", "raífe", "amanda", "jonas");
		
		

		/*for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		} */
		
	 nomes.stream().forEach(nome -> System.out.println(nome));
		
		
		
		
	}
	

}
