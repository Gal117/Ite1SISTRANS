
package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

/**
 * Clase para modelar la relación GUSTAN del negocio de los Parranderos:
 * Cada objeto de esta clase representa el hecho que un bebedor gusta de una bebida y viceversa.
 * Se modela mediante los identificadores del bebedor y de la bebida respectivamente.
 * Debe existir un bebedor con el identificador dado
 * Debe existir una bebida con el identificador dado 
 * 
 * @author Germán Bravo
 */
public class Usuario extends Persona
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador del bebedor que gusta de la bebida
	 */
	private String email;

	/**
	 * El identificador de la bebida que gusta al bebedor
	 */
	private Timestamp fechaNacimiento;

	/**
	 * Atributo que da el id del usuario.
	 */
	private long id;
	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Usuario() 
	{
		super();
		this.email="";
		this.fechaNacimiento=null;
	}

	/**
	 * Constructor con valores
	 * @param idBebedor - El identificador del bebedor. Debe exixtir un bebedor con dicho identificador
	 * @param idBebida - El identificador de la bebida. Debe existir una bebida con dicho identificador
	 */
	public Usuario(String nombre, String tipoDoc, String numDoc, long rol, String email, Timestamp fecha) 
	{
		super(nombre, tipoDoc, numDoc, rol);
		this.email=email;
		this.fechaNacimiento=fecha;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Timestamp fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public long getId() {
		return id;
	}
	public void setId(long pid) {
		this.id = pid;
	}
	/** 
	 * @return Una cadena con la información básica
	 */
	@Override
	public String toString() 
	{
		return "Usuario [email=" + email + ", fecha de nacimiento=" + fechaNacimiento + "]";
	}
	
}
