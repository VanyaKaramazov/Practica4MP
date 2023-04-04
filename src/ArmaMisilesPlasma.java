
public class ArmaMisilesPlasma implements Arma {

	String tipo = "";

	@Override
	public void crearArma() {
		tipo  = "Misiles plasma";
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Misiles de plasma que te podran destruir algunas naves y estructuras enemigas";
	}

	@Override
	public int costo() {
		// TODO Auto-generated method stub
		return 300;
	}

	

	@Override
	public int getAtaque() {
		// TODO Auto-generated method stub
		return 700;
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return -50;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 100;
	}

}
