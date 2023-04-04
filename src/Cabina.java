
/**Interfaz que representa una cabina
 * 
 * @author debian
 *
 */
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
	
	/**Metodo que regresa el costo del componente
	 * @return
	 */
	
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
