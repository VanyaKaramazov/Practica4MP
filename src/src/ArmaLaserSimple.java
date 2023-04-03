package src;

public class ArmaLaserSimple implements Arma {

	Nave nave;

	String tipo = "";

	
	@Override
	public void crearArma() {
		tipo  = "Laser simple";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public String getDescripcion() {
		return "Laser basico que te ayudara a distraer enemigos, y danar ligeramente sus naves";
	}

	@Override
	public int costo() {
		return 400;
	}

	

	@Override
	public int getAtaque() {
		return 100;
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return -20;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 50;
	}

}
