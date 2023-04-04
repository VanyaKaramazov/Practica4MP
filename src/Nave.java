

/**
 * Clase que representa una nave que sera construida con componentes creados en distintas fabricas
 * @author debian
 *
 */
public class Nave {
	private Propulsor propulsor;
	private Cabina cabina;
	private Blindaje blindaje;
	private Arma arma;

	
	
	public Nave(Propulsor propulsor, Cabina cabina, Blindaje blindaje, Arma arma){
		this.propulsor = propulsor;
		this.cabina = cabina;
		this.blindaje = blindaje;
		this.arma = arma;
	}


	/**Metodo que muestra los componentews de la nave, seguido de su precio y estadisticas. 
	 * 
	 */
	public void muestraNave(){
		System.out.println("La nave construida es la siguiente: \n" + 
		propulsor.getTipo() + ": " + propulsor.getDescripcion() + "\n"+
		cabina.getTipo() + ": " + cabina.getDescripcion() +"\n" +
		blindaje.getTipo() + ": " + blindaje.getDescripcion() +"\n" +
		arma.getTipo() + ": " + arma.getDescripcion() +  "\n" +
		"Costo de la nave: " +"$"+ getCosto() + "\n" +
		estadisticas()); 
	}


	/**
	 * Metodo que obtiene el costo total de la nave
	 * @return
	 */
	public int getCosto() {
		return arma.costo() + propulsor.costo() + cabina.costo() + blindaje.costo();
	}
	
	/**
	 * Metodo que muestra las estadisticas de la nave
	 * @return
	 */
	public String estadisticas() {
		int ataque = arma.getAtaque() + propulsor.getAtaque() + cabina.getAtaque() + blindaje.getAtaque();
		int defensa = arma.getDefensa() + propulsor.getDefensa() + cabina.getDefensa() + blindaje.getDefensa();
		int peso = arma.getPeso() + propulsor.getPeso() + cabina.getPeso() + blindaje.getPeso();
		int velocidad = arma.getVelocidad() + propulsor.getVelocidad() + cabina.getVelocidad() + blindaje.getVelocidad();
		
		return "Ataque :" + ataque + "\n" +
			   "Defensa :" + defensa + "\n" +
			   "Velocidad :" + velocidad + "\n" +
			   "Peso :" + peso + "\n";
	}
	

}























