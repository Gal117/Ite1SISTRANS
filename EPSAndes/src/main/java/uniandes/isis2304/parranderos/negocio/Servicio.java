
package uniandes.isis2304.parranderos.negocio;

/**
 * Clase para modelar el concepto BAR del negocio de los Parranderos
 *
 * @author Germán Bravo
 */
public class Servicio{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador del tipo de bebida
	 */
	private long id;

	/**
	 * El nombre del tipo de bebida
	 */
	private String nombre;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Servicio() 
	{
		this.id = 0;
		this.nombre = "";
	}

	/**
	 * Constructor con valores
	 * @param id - El identificador del tipo de bebida
	 * @param nombre - El nombre del tipo de bebida
	 */
	public Servicio(long id, String nombre) 
	{
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @return El id del tipo de bebida
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * @param id - El nuevo id del tipo de bebida
	 */
	public void setId(long id) 
	{
		this.id = id;
	}

	/**
	 * @return El nombre del tipo de bebida
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * @param nombre - El nuevo nombre del tipo de bebida
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}


	/**
	 * @return Una cadena de caracteres con la información del tipo de bebida
	 */
	@Override
	public String toString() 
	{
		return "Servicio [id=" + id + ", nombre=" + nombre + "]";
	}
}
