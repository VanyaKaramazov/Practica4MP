package src;

public class BlindajeReforzado implements Blindaje {

	private String tipo = "";

	@Override
	public void crearBlindaje() {
		tipo  = "Blindaje reforzado";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
