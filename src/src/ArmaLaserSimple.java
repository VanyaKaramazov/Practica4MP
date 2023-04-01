package src;

public class ArmaLaserSimple implements Arma {

	String tipo = "";

	@Override
	public void crearArma() {
		tipo  = "Laser simple";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
