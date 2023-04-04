

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

	@Override
	public int costo() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public int getAtaque() {
		return 0;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "La opcion perfecta para vuelos con riesgo moderado";
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 700;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return -50;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 300;
	}

}
