package src;

public interface Arma {

	/**
	 * Metodo abtracto que crea un nuevo arma, es sobreescrito de forma distinta 
	 * para cada tipo de arma
	 */
	public void crearArma();
	
	/**
	 * Metod que obtiene el tipo de arma que se ha creado
	 * @return 
	 */
	public String getTipo();
	
}
