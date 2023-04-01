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
}
