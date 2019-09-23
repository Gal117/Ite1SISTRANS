package uniandes.isis2304.parranderos.negocio;

public interface VOIps {
	
	/* ****************************************************************
	 * 			M�todos 
	 *****************************************************************/
     /**
	 * @return El id de la IPS
	 */
	public long getId();
	
	/**
	 * @return el nombre de la IPS
	 */
	public String getNombre();
	
	/**
	 * @return la localizaci�n de la IPS
	 */
	public String getLocalizacion();
	
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la IPS
	 */
	public String toString();

}
