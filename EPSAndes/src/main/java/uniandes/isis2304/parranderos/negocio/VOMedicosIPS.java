package uniandes.isis2304.parranderos.negocio;

public interface VOMedicosIPS {


	/**
	 * @return el id del m�dico.
	 */
	public long getIdIPS();
	
	/**
	 * @return el n�mero de documento del m�dico que crea la orden.
	 */
	public String getNumeroDocumentoMedico();
	
	/**
	 * @return el n�mero de documento del usuario al que se le da la orden.
	 */
	public String getTipoDocumentoMedico();
}
