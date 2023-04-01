package src;

public class FabricaPropulsor extends AbstractFactory{
	public Object getComponente(String tipoComponente) {
		return getPropulsor(tipoComponente);
	}
	
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
