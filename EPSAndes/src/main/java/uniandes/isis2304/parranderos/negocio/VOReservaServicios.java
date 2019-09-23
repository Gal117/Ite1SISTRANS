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
	
	/**
	 * @return la fecha y hora prestada de la reserva.
	 */
	public Timestamp getFechayHora();
}
