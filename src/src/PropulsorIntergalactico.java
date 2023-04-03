package src;

public class PropulsorIntergalactico implements Propulsor {

	String tipo = "";

	@Override
	public void crearPropulsor() {
		tipo = "Propulsores intergalacticos";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public int costo() {
		// TODO Auto-generated method stub
		return 3500;
	}

	@Override
	public int getAtaque() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Moviendose con el espacio no hay limite de velocidad, procura frenar con anticipacion para la galaxia de tu destino";
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return 30000000;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 0;
	}

}
