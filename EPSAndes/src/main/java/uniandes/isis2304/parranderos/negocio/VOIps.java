package uniandes.isis2304.parranderos.negocio;

public interface VOIps {
	
	/* ****************************************************************
	 * 			Métodos 
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
	 * @return la localización de la IPS
	 */
	public String getLocalizacion();
	
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la IPS
	 */
	public String toString();

}
