package src;

public class CabinaTripulacion implements Cabina {
	
	String tipo = "";

	@Override
	public void crearCabina() {
		tipo = "Cabina para tripulacion pequena";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
