
public class BlindajeSimple implements Blindaje {

	private String tipo = "";

	@Override
	public void crearBlindaje() {
		tipo  = "Blindaje simple";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public int costo() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public int getAtaque() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Suficiente blindaje para los buenos pilotos. Permite mantener ligera la nave";
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 400;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return -30;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 100;
	}

}
