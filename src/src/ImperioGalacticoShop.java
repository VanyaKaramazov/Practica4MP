package src;

public class ImperioGalacticoShop {

	public static void main(String[] args) {
		Controlador controlador = new Controlador();

		//Fabricas para cada parte de la nave.
		AbstractFactory fabricaPropulsor =  controlador.getFactory("Propulsor");
	
		AbstractFactory fabricaCabina =  controlador.getFactory("Cabina");
		
		AbstractFactory fabricaBlindaje =  controlador.getFactory("Blindaje");
		
		AbstractFactory fabricaArma =  controlador.getFactory("Arma");
		
		
		
		//Se crean los propulsores.
		Propulsor propulsorNuevo1 = (Propulsor)fabricaPropulsor.getComponente("intercontinental");
		propulsorNuevo1.crearPropulsor();
		
		//Se crea la cabina.
		Cabina cabinaNueva1 = (Cabina)fabricaCabina.getComponente("piloto");
		cabinaNueva1.crearCabina();

		//Se crea el blindaje.
		Blindaje blindajeNuevo1 = (Blindaje)fabricaBlindaje.getComponente("fortaleza");
		blindajeNuevo1.crearBlindaje();
		
		//Se crea el blindaje.
		Arma armaNueva1 = (Arma)fabricaArma.getComponente("plasma");
		armaNueva1.crearArma();
		
		//Se crea el auto nuevo con esas partes.
		Nave naveNueva1 = new Nave(propulsorNuevo1, cabinaNueva1, blindajeNuevo1, armaNueva1);
		naveNueva1.muestraNave();
		
		
				

	
	}

}
