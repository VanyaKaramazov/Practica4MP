package src;

public class PropulsorIntercontinental implements Propulsor {
	
	String tipo = "";

	@Override
	public void crearPropulsor() {
		tipo = "Propulsores intercontinentales";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
