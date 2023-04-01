package src;

public class Controlador {
	public  AbstractFactory getFactory(String opcion) {
		if(opcion.equalsIgnoreCase("blindaje")){
			return new FabricaBlindaje();
		} else if(opcion.equalsIgnoreCase("cabina")){
			return new FabricaCabina();
		} else if(opcion.equalsIgnoreCase("propulsor")){
			return new FabricaPropulsor();
		} else if(opcion.equalsIgnoreCase("arma")) {
			return new FabricaArma();
		}
		return null;
	}

}
