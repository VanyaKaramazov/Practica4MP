package src;

public class CabinaPiloto implements Cabina {

	String tipo = "";

	@Override
	public void crearCabina() {
		tipo = "Cabina para 1 piloto";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
