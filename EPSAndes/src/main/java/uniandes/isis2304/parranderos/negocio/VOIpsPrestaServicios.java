package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

public interface VOIpsPrestaServicios {
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
     /**
	 * @return La capacidad máxima del servicio que presta la IPS
	 */
	public int getCapacidadMaxima();
	
	/**
	 * @return fechaInicio del Servicio prestado
	 */
	public Timestamp getFechaInicio();
	
	/**
	 * @return fechaFin del Servicio prestado
	 */
	public Timestamp getFechaFin();
	
	/**
	 * @return el id del servicio que presta la IPS
	 */
	public long getIdServicio();
	/**
	 * @return el id de la IPS que presta el servicio
	 */
	public long getIdIPS();

	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del bar
	 */
	public String toString();

}
