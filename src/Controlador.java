

public class Controlador {
	
	/**Metodo que regresa la fabrica concreta segun el componente que se vaya a fabricar.
	 * 
	 * @param opcion
	 * @return
	 */
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
