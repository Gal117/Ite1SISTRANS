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
	 * @return el n�mero de orden.
	 */
	public long getNumeroOrden();
	
	
	/**
	 * @return el n�mero de documento del m�dico que crea la orden.
	 */
	public String getNumeroDocumentoMedico();
	
	/**
	 * @return el n�mero de documento del usuario al que se le da la orden.
	 */
	public String getNumeroDocumentoUsuario();

	/**
	 * @return el tipo de documento del m�dico que crea la orden.
	 */
	public String getTipoDocumentoMedico();
	
	/**
	 * @return el tipo de documento del usuario al que se le da la orden.
	 */
	public String getTipoDocumentoUsuario();
}
