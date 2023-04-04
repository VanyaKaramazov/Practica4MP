

public class PropulsorInterplanetario implements Propulsor {

	String tipo = "";

	@Override
	public void crearPropulsor() {
		tipo = "Propulsores interplanetarios";
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
		return "Suficiente potencia para transportarte hasta planetas vecinos";
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return 2500;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 160;
	}

}
