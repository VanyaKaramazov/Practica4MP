package src;

public class Nave {
	private Propulsor propulsor;
	private Cabina cabina;
	private Blindaje blindaje;
	private Arma arma;
	
	
	public int ataque() {
		return arma.getAtaque();
	}

	
	
	public Nave(Propulsor propulsor, Cabina cabina, Blindaje blindaje, Arma arma){
		this.propulsor = propulsor;
		this.cabina = cabina;
		this.blindaje = blindaje;
		this.arma = arma;
	}


	public void muestraNave(){
		System.out.println("La nave construida es la siguiente: \n" + 
		propulsor.getTipo() + ": " + propulsor.getDescripcion() + "\n"+
		cabina.getTipo() + ": " + cabina.getDescripcion() +"\n" +
		blindaje.getTipo() + ": " + blindaje.getDescripcion() +"\n" +
		arma.getTipo() + ": " + arma.getDescripcion() +  "\n" +
		"Costo de la nave: " + getCosto() + "\n" +
		estadisticas()); 
	}


	public int getCosto() {
		return arma.costo() + propulsor.costo() + cabina.costo() + blindaje.costo();
	}
	
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























