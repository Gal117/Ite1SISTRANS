

package uniandes.isis2304.parranderos.negocio;


/**
 * Clase para modelar el concepto BEBIDA del negocio de los Parranderos
 *
 * @author Germán Bravo
 */
public class Medico extends Persona
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/

	private enum tipoMedico{
		GENERAL,ESPECIALISTA	
	}
	private tipoMedico tipoMedico;
	
	private Integer numeroRegistroMedico;
	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Medico() 
	{
		super();
		tipoMedico=null;
		numeroRegistroMedico=null;
	}

	/**
	 * Constructor con valores
	 * @param id - El id de la bebida
	 * @param nombre - El nombre de la bebida
	 * @param tipo - El identificador del tipo de bebida
	 * @param gradoAlcohol - El graddo de alcohol de la bebida (Mayor que 0)
	 */
	public Medico(String nombre, tipo tipoDoc, String numDoc, int rol,String nRol, tipoMedico tipoM, int numReg) 
	{
		super(nombre, tipoDoc, numDoc, rol,nRol);
		this.tipoMedico=tipoM;
		this.numeroRegistroMedico=numReg;
	}
	
	public tipoMedico getTipoMedico() {
		return tipoMedico;
	}

	public void setTipoMedico(tipoMedico tipoMedico) {
		this.tipoMedico = tipoMedico;
	}

	public Integer getNumeroRegistroMedico() {
		return numeroRegistroMedico;
	}

	public void setNumeroRegistroMedico(Integer numeroRegistroMedico) {
		this.numeroRegistroMedico = numeroRegistroMedico;
	}
	
	/**
	 * @return Una cadena con la información básica del medico
	 */
	@Override
	public String toString() 
	{
		return "Medico [tipo de medico=" + tipoMedico+ ", numero de registro medico=" + numeroRegistroMedico + "]";
	}

}
