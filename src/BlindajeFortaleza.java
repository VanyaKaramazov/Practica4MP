
public class BlindajeFortaleza implements Blindaje {

	private String tipo = "";

	@Override
	public void crearBlindaje() {
		tipo  = "Blindaje fortaleza";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public int costo() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	public int getAtaque() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Vuela sin preocupaciones, los enemigos se aburriran intentando derribarte. (Excepto si compran sus armas con nosotros)";
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return -100;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 500;
	}

}
