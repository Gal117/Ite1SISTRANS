package uniandes.isis2304.parranderos.negocio;

public interface VOPersona {

	/**
	 * @return el ID del rol
	 */
	public long getIdRol();
	
	/**
	 * @return el nombre de la persona
	 */
	public String getNombre() ;
	
	/**
	 * @return el número de documento de la persona.
	 */
	public String getNumeroDocumento();
	
	/**
	 * @return el tipo de documento de la persona.
	 */
	public String getTipoDocumento();
}
