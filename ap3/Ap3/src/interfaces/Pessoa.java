package interfaces;

public class Pessoa implements Humano {

	@Override
	public String getNome() {
		return "jo�o";
	}

	@Override
	public String andar() {
		return "andando...";
	}

	@Override
	public int getIdade() {
		return 15;
	}

}
