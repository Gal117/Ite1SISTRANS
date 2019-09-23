package uniandes.isis2304.parranderos.negocio;

public interface VOMedicoOrden {
	
	/**
	 * @return el ID de la IPS donde se remite al paciente con la orden.
	 */
	public long getIdIPS();
	
	/**
	 * @return el ID del servicio prestado.
	 */
	public long getIdServicio();
	
	/**
	 * @return el número de orden.
	 */
	public long getNumeroOrden();
	
	
	/**
	 * @return el número de documento del médico que crea la orden.
	 */
	public String getNumeroDocumentoMedico();
	
	/**
	 * @return el número de documento del usuario al que se le da la orden.
	 */
	public String getNumeroDocumentoUsuario();

	/**
	 * @return el tipo de documento del médico que crea la orden.
	 */
	public String getTipoDocumentoMedico();
	
	/**
	 * @return el tipo de documento del usuario al que se le da la orden.
	 */
	public String getTipoDocumentoUsuario();
}
