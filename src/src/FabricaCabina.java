package src;

public class FabricaCabina extends AbstractFactory {

	public Object getComponente(String tipoComponente) {
		return getCabina(tipoComponente);
	}
	
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
