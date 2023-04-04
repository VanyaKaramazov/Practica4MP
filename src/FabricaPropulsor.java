

/**
 * Clase que representa la fabrica concreta en la que se fabrican los propulsores
 * @author debian
 *
 */
public class FabricaPropulsor extends AbstractFactory{
	/**
	 * Metodo que obtiene el componente por fabricar
	 */
	public Object getComponente(String tipoComponente) {
		return getPropulsor(tipoComponente);
	}
	
	/**
	 * Metodo que fabrica el propulsor
	 * @param tipoPropulsor
	 * @return nuevo Propulsor
	 */
	public Propulsor getPropulsor(String tipoPropulsor) {
		if(tipoPropulsor.equalsIgnoreCase("intercontinental")) {
			return new PropulsorIntercontinental();
		} else if (tipoPropulsor.equalsIgnoreCase("interplanetario")) {
			return new PropulsorInterplanetario();
		} else if(tipoPropulsor.equalsIgnoreCase("intergalactico")) {
			return new PropulsorIntergalactico();
		}
		return null;
	}

}
