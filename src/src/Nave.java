package src;

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

	
	public void muestraNave(){
		System.out.println("La nave construida es la siguiente: \n" + 
		propulsor.getTipo() + "\n"+
		cabina.getTipo() + "\n" +
		blindaje.getTipo() + "\n" +
		arma.getTipo()); 
	}

}
