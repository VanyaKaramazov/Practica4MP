package src;

public interface Blindaje {

	/**
	 * Metodo abtracto que crea un nuevo blindaje, es sobreescrito de forma distinta 
	 * para cada tipo de blindaje
	 */
	public void crearBlindaje();
	
	/**
	 * Metodo que obtiene el tipo de blindaje que se ha creado
	 * @return tipo de blindaje
	 */
	public String getTipo();
}
