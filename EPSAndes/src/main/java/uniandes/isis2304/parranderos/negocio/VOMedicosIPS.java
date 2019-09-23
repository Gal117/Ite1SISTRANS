package uniandes.isis2304.parranderos.negocio;

public interface VOMedicosIPS {


	/**
	 * @return el id del médico.
	 */
	public long getIdIPS();
	
	/**
	 * @return el número de documento del médico que crea la orden.
	 */
	public String getNumeroDocumentoMedico();
	
	/**
	 * @return el número de documento del usuario al que se le da la orden.
	 */
	public String getTipoDocumentoMedico();
}
