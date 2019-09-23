

package uniandes.isis2304.parranderos.negocio;


/**
 * Clase para modelar la relación SIRVEN del negocio de los Parranderos:
 * Cada objeto de esta clase representa el hecho que un bar sirve una bebida y viceversa.
 * Se modela mediante los identificadores del bar y de la bebida respectivamente
 * Debe existir un bar con el identificador dado
 * Debe existir una bebida con el identificador dado 
 * Adicionalmente contiene el horario (DIURNO, NOCTURNO, TODOS) en el cual el bar sirve la bebida
 * 
 * @author Germán Bravo
 */
public class MedicosIPS implements VOMedicosIPS
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador del medico
	 */
	private long idMedico;
	
	/**
	 * El identificador de la IPS donde el medico presta servicio.
	 */
	private long idIPS;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public MedicosIPS () 
	{
		this.idMedico = 0;
		this.idIPS = 0;
	
	}

	/**
	 * Constructor con valores
	 * @param pIdMedico - El identificador del medico. Debe exixtir un medico con dicho identificador
	 * @param idBebida - El identificador de la IPS. Debe existir una IPS con dicho identificador
	 */
	public MedicosIPS (long pIdMedico, long pIdIPS) 
	{
		this.idIPS = pIdIPS;
		this.idMedico = pIdMedico;
	}


	public long getIdMedico() {
		return idMedico;
	}
	
	public void setIdMedico(long pIdMedico) {
		this.idMedico = pIdMedico;
	}
	public long getIdIPS() {
		return idIPS;
	}

	public void setIdIPS(long idIPS) {
		this.idIPS = idIPS;
	}

	/** 
	 * @return Una cadena con la información básica
	 */
	@Override
	public String toString() 
	{
		return "MedicosIPS: " + "ID del m�dico " + idMedico + " ID de IPS donde sirve el m�dico=" + idIPS;
	}
}
