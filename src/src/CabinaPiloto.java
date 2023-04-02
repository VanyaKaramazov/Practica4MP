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
		return "Ideal para vuelos cortos y ataques sigilosos";
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
		return 300;
	}

}
