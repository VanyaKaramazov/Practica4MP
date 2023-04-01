package src;

public interface Propulsor {
	
	/**
	 * Metodo abtracto que crea un nuevo propulsor, es sobreescrito de forma distinta 
	 * para cada tipo de propulsor
	 */
	public void crearPropulsor();
	
	/**
	 * Metod que obtiene el tipo de propulsores que se han creado
	 * @return 
	 */
	public String getTipo();
	

}
