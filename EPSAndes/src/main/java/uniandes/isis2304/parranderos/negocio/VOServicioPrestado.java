package uniandes.isis2304.parranderos.negocio;

public interface VOServicioPrestado {
	
	/**
	 * @return ID de la reserva 
	 */
	public long getIdReserva();
	
	/**
	 * @return tipo de documento del recepcionista que registra llegada del usuario
	 */
	public String getTipoDocumentoUsuario();

	/**
	 * @return número de documento del recepcionista que registra llegada del usuario
	 */
	public String getNumeroDocumentoUsuario();

	/**
	 * @return true si el afiliado asistió a su cita, false de lo contrario.
	 */
	public boolean isCumplido();

}
