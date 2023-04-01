package src;

public class CabinaEjercito implements Cabina {

	String tipo = "";

	@Override
	public void crearCabina() {
		tipo = "Cabina para ejercito";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
