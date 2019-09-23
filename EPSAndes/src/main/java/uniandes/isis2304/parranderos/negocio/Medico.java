

package uniandes.isis2304.parranderos.negocio;


/**
 * Clase para modelar el concepto BEBIDA del negocio de los Parranderos
 *
 * @author GermÃ¡n Bravo
 */
public class Medico extends Persona implements VOMedico
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/

	/**
	 * Atributo que da el id del medico.
	 */
	private long id;
	
	/**
	 * Atributo que da el tipo de medico.
	 */
	private String tipoMedico;
	
	/**
	 * Atributo que da el numero de registro del medico
	 */
	private Integer numeroRegistroMedico;
	/* ****************************************************************
	 * 			MÃ©todos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Medico() 
	{
		super();
		id = 0;
		tipoMedico= "";
		numeroRegistroMedico=null;
	}

	/**
	 * Constructor con valores
	 * @param nombre - nombre del médico.
	 * @param tipoDoc - tipo de documento del médico.
	 * @param numDoc - número de documento del médico.
	 * @param pid - El id del medico.
	 * @param rol - El id del rol del médico.
	 * @param tipoM - El tipo de médico.
	 * @param numReg - número de registro del médico.
	 * @param gradoAlcohol - El graddo de alcohol de la bebida (Mayor que 0)
	 */
	public Medico(String nombre, String tipoDoc, String numDoc, long pid, long rol, String tipoM, int numReg) 
	{
		super(nombre, tipoDoc, numDoc, rol);
		this.id = pid;
		this.tipoMedico=tipoM;
		this.numeroRegistroMedico=numReg;
	}
	
	public String  getTipoMedico() {
		return tipoMedico;
	}

	public void setTipoMedico(String tipoMedico) {
		this.tipoMedico = tipoMedico;
	}

	public Integer getNumeroRegistroMedico() {
		return numeroRegistroMedico;
	}

	public void setNumeroRegistroMedico(Integer numeroRegistroMedico) {
		this.numeroRegistroMedico = numeroRegistroMedico;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return Una cadena con la informaciÃ³n bÃ¡sica del medico
	 */
	@Override
	public String toString() 
	{
		return "Medico [tipo de medico=" + tipoMedico+ ", numero de registro medico=" + numeroRegistroMedico + "]";
	}



}
