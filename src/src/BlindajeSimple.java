package src;

public class BlindajeSimple implements Blindaje {

	private String tipo = "";

	@Override
	public void crearBlindaje() {
		tipo  = "Blindaje simple";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
