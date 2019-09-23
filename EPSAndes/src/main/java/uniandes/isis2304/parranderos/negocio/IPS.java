
package uniandes.isis2304.parranderos.negocio;

/**
 * Clase para modelar el concepto BAR del negocio de los Parranderos
 *
 * @author Germán Bravo
 */
public class IPS implements VOIps 
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de los bares
	 */
	private long id;

	/**
	 * El nombre del bar
	 */
	private String nombre;

	/**
	 * La localizacion donde se encuentra la IPS
	 */
	private String localizacion;

	/**
	 * El tipo de la IPS
	 */
	private enum tipo{
		HOSPITAL, 
		CENTRO_DE_DIAGNOSTICO,
		LABORATORIO,
		CENTRO_MEDICO
	}
	private tipo tipoIPS;


	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public IPS() 
	{
		this.id = 0;
		this.nombre = "";
		this.localizacion = "";
		this.tipoIPS=null;
	}

	/**
	 * Constructor con valores
	 * @param id - El id del bart
	 * @param nombre - El nombre del bar
	 * @param ciudad - La ciudad del bar
	 * @param presupuesto - El presupuesto del bar (ALTO, MEDIO, BAJO)
	 * @param cantSedes - Las sedes del bar (Mayor que 0)
	 */
	public IPS(long id, String nombre, String localizacion, tipo tipo) 
	{
		this.id = id;
		this.nombre = nombre;
		this.localizacion = localizacion;
		tipoIPS = tipo;
	}

	/**
	 * @return El id del bar
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * @param id - El nuevo id del bar
	 */
	public void setId(long id) 
	{
		this.id = id;
	}

	/**
	 * @return el nombre del bar
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * @param nombre El nuevo nombre del bar
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	/**
	 * @return la ciudad del bar
	 */
	public String getLocalizacion() 
	{
		return localizacion;
	}

	/**
	 * @param ciudad - La nueva ciudad del bar
	 */
	public void setLocalizacion (String localizacion) 
	{
		this.localizacion = localizacion;
	}
	/**
	 * @return la ciudad del bar
	 */
	public tipo getTipoIPS() 
	{
		return tipoIPS;
	}

	/**
	 * @param ciudad - La nueva ciudad del bar
	 */
	public void setTipoIPS (tipo tipo) 
	{
		this.tipoIPS = tipo;
	}

	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del bar
	 */
	public String toString() 
	{
		return "IPS [id=" + id + ", nombre=" + nombre + ", ciudad=" + localizacion + "]";
	}


}
