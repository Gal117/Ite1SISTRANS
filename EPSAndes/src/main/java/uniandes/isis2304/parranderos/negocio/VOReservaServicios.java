package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

public interface VOReservaServicios {

	/**
	 * @return el ID de la IPS que presta el servicio.
	 */
	public long getIdIPS();
	
	/**
	 * @return el ID de la reserva.
	 */
	public long getIdReserva();
	
	/**
	 * @return el ID del servicio prestado.
	 */
	public long getIdServicio();
	
	/**
	 * @return el ID del médico que presta el servicio.
	 */
	public long getIdMedico();
	
	/**
	 * @return el ID del afiliado que necesita el servicio.
	 */
	public long getIdAfiliado();
	
	/**
	 * @return la fecha y hora prestada de la reserva.
	 */
	public Timestamp getFechayHora();
}
