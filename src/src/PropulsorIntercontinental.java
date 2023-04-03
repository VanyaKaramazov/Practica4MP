package src;

public class PropulsorIntercontinental implements Propulsor {
	
	String tipo = "";

	@Override
	public void crearPropulsor() {
		tipo = "Propulsores intercontinentales";
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "La potencia suficiente para viejar entre continentes" ;
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return 990;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 100;
	}

}
