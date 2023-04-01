package src;

public class BlindajeFortaleza implements Blindaje {

	private String tipo = "";

	@Override
	public void crearBlindaje() {
		tipo  = "Blindaje fortaleza";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
