package src;

public interface Cabina {

	/**
	 * Metodo abtracto que crea un nuevo cabina, es sobreescrito de forma distinta 
	 * para cada tipo de cabina
	 */
	public void crearCabina();
	
	/**
	 * Metodo que obtiene el tipo de cabina que se ha creado
	 * @return 
	 */
	public String getTipo();
}
