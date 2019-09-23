package uniandes.isis2304.parranderos.negocio;

public interface VOMedicoOrden {
	

	/**
	 * @return el ID de la orden.
	 */
	public long getIdOrden();
	
	/**
	 * @return el ID del m�dico que emite la orden.
	 */
	public long getIdMedico();
	/**
	 * @return el ID del afiliado al que se le da la orden.
	 */
	public long getIdUsuario();
	
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
	public String getNumeroOrden();
	
	
}
