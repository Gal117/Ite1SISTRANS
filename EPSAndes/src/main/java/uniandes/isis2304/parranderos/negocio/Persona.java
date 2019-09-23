
package uniandes.isis2304.parranderos.negocio;


/**
 * Clase para modelar el concepto Persona del negocio de los EPSAndes
 *
 * @author Daniel Betancurth Dorado
 */
public abstract class  Persona implements VOPersona
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	
	/**
	 * El numero de documento de la persona
	 */
	private String numeroDocumento;
	
	/**
	 * El nombre de la persona
	 */
	private String nombre;

	private String tipoDocumento;
	
	private long idRol;
	

	
	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Persona() 
	{
		this.nombre = "";
		this.tipoDocumento = "";
		this.numeroDocumento = "";
		this.idRol=0;
		
	}

	/**
	 * Constructor con valores
	 * @param id - El id del bebedor
	 * @param nombre - El nombre del bebedor
	 * @param ciudad - La ciudad del bebedor
	 * @param presupuesto - El presupuesto del bebedor (ALTO, MEDIO, BAJO)
	 */
	public Persona(String nombre, String tipoDoc, String numDoc, int rol) 
	{
		this.nombre = nombre;
		this.tipoDocumento = tipoDoc;
		this.numeroDocumento = numDoc;
		this.idRol=rol;
	

	}

	
	public long getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	/**
	 * @return El nombre del bebedor
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * @param nombre - El nuevo nombre del bebedor
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	/**
	 * @return La ciudad del bebedor
	 */
	public String getTipoDocumento() 
	{
		return tipoDocumento;
	}

	/**
	 * @param ciudad - La nueva ciudad del bebedor
	 */
	public void setTipoDocumento(String tipoDocumento) 
	{
		this.tipoDocumento = tipoDocumento;
	}
	/**
	 * @return La ciudad del bebedor
	 */
	public String getNumeroDocumento() 
	{
		return numeroDocumento;
	}

	/**
	 * @param ciudad - La nueva ciudad del bebedor
	 */
	public void setNumeroDocumento(String numeroDocumento) 
	{
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return Una cadena de caracteres con la información básica del bebedor
	 */
	@Override
	public String toString() 
	{
		return "Persona [ nombre = " + nombre + ", tipo de documento = " + tipoDocumento + ", numero de documento = " + numeroDocumento + "]";
	}

}
