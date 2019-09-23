package uniandes.isis2304.parranderos.negocio;

public interface VOServicioPrestado {
	
	/**
	 * @return ID de la reserva 
	 */
	public long getIdReserva();
	
	/**
	 * @return id del recepcionista que registra la prestación del servicio.
	 */
	public long getIdRecepcionista();
	/**
	 * @return true si el afiliado asistió a su cita, false de lo contrario.
	 */
	public String getCumplido();

}
