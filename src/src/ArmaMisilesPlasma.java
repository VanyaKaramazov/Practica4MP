package src;

public class ArmaMisilesPlasma implements Arma {

	String tipo = "";

	@Override
	public void crearArma() {
		tipo  = "Misiles plasma";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
