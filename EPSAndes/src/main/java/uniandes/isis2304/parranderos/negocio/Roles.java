package uniandes.isis2304.parranderos.negocio;

public class Roles implements VORoles{
	
	/**
	 * ID del rol que puede tomar una persona.
	 */
	private long id;
	
	/**
	 * Nombre del rol
	 */
	private String nombre;
	
	/**
	 * Constructor por defecto de roles
	 */
	public Roles() {
		
	}
	
	/**
	 * Constructor con valores
	 * @param pID id del rol. No hay id repetido, no hay necesidad de que exista un rol antes.
	 * @param pNombre nombre del rol. No hay nombre repetido, no hay necesidad de que exista un rol antes.
	 */
	public Roles(long pID, String pNombre) {
		this.id = pID;
		this.nombre = pNombre;
	}

	/**
	 * Método que retorna id del rol.
	 * @return id del rol
	 */
	public long getId() {
		return id;
	}

	/**
	 * Método que cambia el id del rol.
	 * @param id del rol
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Método que retorna el nombre del rol.
	 * @return el nombre del rol.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método que cambia el nombre del rol.
	 * @param nombre del rol
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
