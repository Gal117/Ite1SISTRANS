
package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

/**
 * Clase para modelar la relación VISITAN del negocio de los Parranderos:
 * Cada objeto de esta clase representa el hecho que un bebedor visitó un bar y viceversa.
 * Se modela mediante los identificadores del bebedor y del bar respectivamente
 * Debe existir un bebedor con el identificador dado
 * Debe existir un bar con el identificador dado 
 * Adicionalmente contiene la fecha y el horario (DIURNO, NOCTURNO, TODOS) en el cual el bebedor visitó el bar
 * 
 * @author Germán Bravo
 */
public class IPSPrestaServicios
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador del bebedor que realiza la visita
	 */
	private long idIPS;
	
	/**
	 * El identificador del bar visitado
	 */
	private long idServicio;
	
	/**
	 * La fecha de la visita
	 */
	private Timestamp fechaInicio;
	
	private Timestamp fechaFin;

	/**
	 * El horario en que se realizó la visita (DIURNO, NOCTURNO, TODOS)
	 */
	private Integer capacidadMaxima;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public IPSPrestaServicios() 
	{
		this.idIPS = 0;
		this.idServicio = 0;
		this.capacidadMaxima = 0;
		this.fechaInicio = new Timestamp (0);
		this.fechaFin = new Timestamp (0);

	}

	/**
	 * Constructor con valores
	 * @param idBebedor - El identificador del b ebedor. Debe existir un bebedor con dicho identificador
	 * @param idBar - El identificador del bar. Debe exixtir un bar con dicho identificador
	 * @param fechaVisita - La fecha en la cual se realiza la visita
	 * @param horario - El horario en el que el bebedor vista el bar (DIURNO, NOCTURNO, TODOS)
	 */
	public IPSPrestaServicios(long idIPS, long idServicio, Timestamp inicio,Timestamp fin, int capacidad) 
	{
		this.idIPS = idIPS;
		this.idServicio = idServicio;
		this.capacidadMaxima = capacidad;
		this.fechaInicio = inicio;
		this.fechaFin = fin;
	}


	public long getIdIPS() {
		return idIPS;
	}

	public void setIdIPS(long idIPS) {
		this.idIPS = idIPS;
	}

	public long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}

	public Timestamp getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Timestamp fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Timestamp getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Timestamp fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Integer getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(Integer capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	/** 
	 * @return Una cadena con la información básica
	 */
	@Override
	public String toString() 
	{
		return "IPSPrestaServicios [id de la IPS=" + idIPS + ", id del servicio=" + idServicio + ", fecha de Inicio=" + fechaInicio + ", fecha de fin=" + fechaFin + "capacidad maxima"+capacidadMaxima+"]";
	}
}
