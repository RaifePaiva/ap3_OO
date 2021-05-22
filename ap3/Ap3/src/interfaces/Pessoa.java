package interfaces;

public class Pessoa implements Humano {

	@Override
	public String getNome() {
		return "joão";
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
