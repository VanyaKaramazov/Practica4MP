

/**
 * Interfaz que representa un propulsor
 * @author debian
 *
 */
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

	/**
	 * Metodo que obtiene la descripcion del componente
	 * @return descripcion del componente
	 */
	public String getDescripcion();
	
	
	/**Metodo que regresa el costo del componente
	 * @return
	 */
	public int costo();
	

	/**
	 * Metodo que obtiene los puntos de dano que agrega el componente a la nave
	 * 
	 */
	public int getAtaque();

	
	/**
	 * Metodo que obtiene los puntos de defensa que agrega el componente a la nave.
	 * @return puntos de defensa
	 */
	public int getDefensa();
	
	/**
	 * Metodo que obtiene los puntos de velocidad que otorga el componente a la nve.
	 * @return
	 */
	public int getVelocidad();
	
	/**
	 * Metodo que obtiene los puntos de peso que agrega el componente a la nave.
	 * @return
	 */
	public int getPeso();
	

}
