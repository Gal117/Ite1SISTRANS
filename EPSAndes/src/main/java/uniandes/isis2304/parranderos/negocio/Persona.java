/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogotá	- Colombia)
 * Departamento	de	Ingeniería	de	Sistemas	y	Computación
 * Licenciado	bajo	el	esquema	Academic Free License versión 2.1
 * 		
 * Curso: isis2304 - Sistemas Transaccionales
 * Proyecto: Parranderos Uniandes
 * @version 1.0
 * @author Germán Bravo
 * Julio de 2018
 * 
 * Revisado por: Claudia Jiménez, Christian Ariza
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.isis2304.parranderos.negocio;


/**
 * Clase para modelar el concepto Persona del negocio de los EPSAndes
 *
 * @author Daniel Betancurth Dorado
 */
public abstract class  Persona 
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	
	/**
	 * El tipo de documento de la persona
	 */
	public enum tipo{
		TARJETA_DE_IDENTIDAD,
		CEDULA
	}
	
	
	/**
	 * El numero de documento de la persona
	 */
	private String numeroDocumento;
	
	/**
	 * El nombre de la persona
	 */
	private String nombre;

	private tipo tipoDocumento;
	
	private Integer idRol;
	
	private String nombreRol;
	
	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Persona() 
	{
		this.nombre = "";
		this.tipoDocumento = null;
		this.numeroDocumento = "";
		this.idRol=null;
		this.nombreRol="";
	}

	/**
	 * Constructor con valores
	 * @param id - El id del bebedor
	 * @param nombre - El nombre del bebedor
	 * @param ciudad - La ciudad del bebedor
	 * @param presupuesto - El presupuesto del bebedor (ALTO, MEDIO, BAJO)
	 */
	public Persona(String nombre, tipo tipoDoc, String numDoc, int rol, String nRol) 
	{
		this.nombre = nombre;
		this.tipoDocumento = tipoDoc;
		this.numeroDocumento = numDoc;
		this.idRol=rol;
		this.nombreRol=nRol;

	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	
	public int getIdRol() {
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
	public tipo getTipoDocumento() 
	{
		return tipoDocumento;
	}

	/**
	 * @param ciudad - La nueva ciudad del bebedor
	 */
	public void setTipoDocumento(tipo tipoDocumento) 
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
