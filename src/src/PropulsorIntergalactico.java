package src;

public class PropulsorIntergalactico implements Propulsor {

	String tipo = "";

	@Override
	public void crearPropulsor() {
		tipo = "Propulsores intergalacticos";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
