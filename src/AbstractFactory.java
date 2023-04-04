

/**
 * Clase abstracta que representa una fabrica abstracta que se definira segun el componente que se vaya a construir
 * @author debian
 *
 */
public abstract class AbstractFactory {
	/**
	 * Metodo que obtiene el componente de la nave que se va a fabricar
	 * @param tipoComponente
	 * @return
	 */
	public Object getComponente(String tipoComponente ) {
		return tipoComponente;
		
	}

}
