package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

public interface VOUsuario {
	
	/**
	 * @return el email del usuario (ya sea afiliado, gerente, admin de datos o recepcionista.
	 */
	public String getEmail();
	
	/**
	 * 
	 * @return fecha de nacimiento del usuario
	 */
	public Timestamp getFechaNacimiento();
}
