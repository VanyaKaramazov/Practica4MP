

public class CabinaEjercito implements Cabina {

	String tipo = "";

	@Override
	public void crearCabina() {
		tipo = "Cabina para ejercito";
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
		return "Suficiente espacio para transportar a todo tu ejercito hasta el area de combate";
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return -100;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 800;
	}

}
