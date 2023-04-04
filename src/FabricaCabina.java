

public class FabricaCabina extends AbstractFactory {

	/**
	 * Metodo que obtiene la cabina por fabricar
	 */
	public Object getComponente(String tipoComponente) {
		return getCabina(tipoComponente);
	}
	
	/**
	 * Metod que fabrica una cabina
	 * @param tipoCabina
	 * @return
	 */
	public Cabina getCabina(String tipoCabina) {
		if(tipoCabina.equalsIgnoreCase("piloto")) {
			return new CabinaPiloto();
		} else if (tipoCabina.equalsIgnoreCase("tripulacion")) {
			return new CabinaTripulacion();
		} else if(tipoCabina.equalsIgnoreCase("ejercito")) {
			return new CabinaEjercito();
		}
		return null;
	}
}
