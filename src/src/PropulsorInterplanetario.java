package src;

public class PropulsorInterplanetario implements Propulsor {

	String tipo = "";

	@Override
	public void crearPropulsor() {
		tipo = "Propulsores interplanetarios";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
