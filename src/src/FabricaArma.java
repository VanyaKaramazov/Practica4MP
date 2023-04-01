package src;

public class FabricaArma extends AbstractFactory {

	public Object getComponente(String tipoComponente) {
		return getArma(tipoComponente);
	}
	
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
