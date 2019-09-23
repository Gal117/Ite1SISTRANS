

package uniandes.isis2304.parranderos.negocio;

import uniandes.isis2304.parranderos.negocio.Persona.tipo;

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
public class MedicosIPS
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador del bar que sirve la bebida
	 */
	private String numeroDocumentoMedico;
	
	private tipo tipoDocumentoMedico;
	
	/**
	 * El identificador de la bebida que es servida en el bar
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
		this.numeroDocumentoMedico = "";
		this.idIPS = 0;
		this.tipoDocumentoMedico = null;
	}

	/**
	 * Constructor con valores
	 * @param idBar - El identificador del bar. Debe exixtir un bar con dicho identificador
	 * @param idBebida - El identificador de la bebida. Debe existir una bebida con dicho identificador
	 * @param horario - El horario en el que el bar sirve la bebida (DIURNO, NOCTURNO, TODOS)
	 */
	public MedicosIPS (String numDocMed, tipo tipoDoc, long idIPS) 
	{
		this.idIPS = idIPS;
		this.numeroDocumentoMedico = numDocMed;
		this.tipoDocumentoMedico = tipoDoc;
	}


	public String getNumeroDocumentoMedico() {
		return numeroDocumentoMedico;
	}

	public void setNumeroDocumentoMedico(String numeroDocumentoMedico) {
		this.numeroDocumentoMedico = numeroDocumentoMedico;
	}

	public tipo getTipoDocumentoMedico() {
		return tipoDocumentoMedico;
	}

	public void setTipoDocumentoMedico(tipo tipoDocumentoMedico) {
		this.tipoDocumentoMedico = tipoDocumentoMedico;
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
		return "MedicosIPS [idIPS=" + idIPS + ", tipo de documneto medico=" + tipoDocumentoMedico + ", numero de documento del medico=" + numeroDocumentoMedico + "]";
	}
}
