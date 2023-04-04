
/**
 * Clase que representa la fabrica concreta en la que se fabrican las armas
 * @author debian
 *
 */
public class FabricaArma extends AbstractFactory {

	/**
	 * Metodo que obtiene el arma por farbicar
	 */
	public Object getComponente(String tipoComponente) {
		return getArma(tipoComponente);
	}
	
	/**
	 * Metodo que fabrica un arma
	 * @param tipoArma
	 * @return
	 */
	public Arma getArma(String tipoArma) {
		if(tipoArma.equalsIgnoreCase("laser simple")) {
			return new ArmaLaserSimple();
		} else if (tipoArma.equalsIgnoreCase("plasma")) {
			return new ArmaMisilesPlasma();
		} else if(tipoArma.equalsIgnoreCase("destructor")) {
			return new ArmaLaserDestructorPlanetas();
		}
		return null;
	}
}
