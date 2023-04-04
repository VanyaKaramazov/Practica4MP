

public class FabricaBlindaje extends AbstractFactory {
	
	/**
	 * Metodo que obtiene el componente por fabricar
	 */
	public Object getComponente(String tipoComponente) {
		return getBlindaje(tipoComponente);
	}
	
	/**
	 * Metod que fabrica un propulsor
	 * @param tipoBlindaje
	 * @return
	 */
	public Blindaje getBlindaje(String tipoBlindaje) {
		if(tipoBlindaje.equalsIgnoreCase("simple")) {
			return new BlindajeSimple();
		} else if (tipoBlindaje.equalsIgnoreCase("reforzado")) {
			return new BlindajeReforzado();
		} else if(tipoBlindaje.equalsIgnoreCase("fortaleza")) {
			return new BlindajeFortaleza();
		}
		return null;
	}
}
