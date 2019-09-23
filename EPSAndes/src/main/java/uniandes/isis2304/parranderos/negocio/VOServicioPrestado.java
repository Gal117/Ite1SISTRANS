package uniandes.isis2304.parranderos.negocio;

public interface VOServicioPrestado {
	
	/**
	 * @return ID de la reserva 
	 */
	public long getIdReserva();
	
	/**
	 * @return id del recepcionista que registra la prestaci�n del servicio.
	 */
	public long getIdRecepcionista();
	/**
	 * @return true si el afiliado asisti� a su cita, false de lo contrario.
	 */
	public String getCumplido();

}
