

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

	@Override
	public int costo() {
		return 2600;
	}

	@Override
	public int getAtaque() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Transporta hasta a cinco personas en la nave";
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return -50;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 400;
	}

}
