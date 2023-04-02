package src;

public class ArmaLaserDestructorPlanetas implements Arma {

	String tipo = "";

	@Override
	public void crearArma() {
		tipo  = "Laser destructor de planetas";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Los rayos de este laser pueden destruir planetas, usalo con precaucion";
	}

	@Override
	public int costo() {
		return 200;
	}

	
	@Override
	public int getAtaque() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return -100;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 200;
	}
}
