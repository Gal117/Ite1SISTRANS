package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Roles;

public class SQLRoles {
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaParranderos.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaEPS pp;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicación
	 */
	public SQLRoles (PersistenciaEPS pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un ROL a la base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @param idRol - El identificador del rol
	 * @param nombre - El nombre del rol
	 * @return EL número de tuplas insertadas
	 */
	public long adicionarRol (PersistenceManager pm, long idRol, String nombre) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaRoles() + "(id, nombre) values (?, ?)");
        q.setParameters(idRol, nombre);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar ROL de la base de datos de EPSAndes, por su nombre
	 * @param pm - El manejador de persistencia
	 * @param nombreRol- El nombre del rol.
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarRolPorNombre (PersistenceManager pm, String nombreRol)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaRoles() + " WHERE nombre = ?");
        q.setParameters(nombreRol);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar ROL de la base de datos de EPSAndes, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idRol - El identificador del rol
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarRolPorId (PersistenceManager pm, long idRol)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaRoles() + " WHERE id = ?");
        q.setParameters(idRol);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de un ROL de la 
	 * base de datos de EPSANdes, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idRol - El identificador del rol
	 * @return El objeto ROL que tiene el identificador dado
	 */
	public Roles darRolPorId (PersistenceManager pm, long idRol) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaRoles() + " WHERE id = ?");
		q.setResultClass(Roles.class);
		q.setParameters(idRol);
		return (Roles) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de un ROL de la 
	 * base de datos de EPSAndes, por su nombre
	 * @param pm - El manejador de persistencia
	 * @param nombreRol - El nombre del rol
	 * @return El objeto ROL que tiene el nombre dado
	 */
	public List<Roles> darTiposBebidaPorNombre (PersistenceManager pm, String nombreRol) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaRoles() + " WHERE nombre = ?");
		q.setResultClass(Roles.class);
		q.setParameters(nombreRol);
		return (List<Roles>) q.executeList();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de los ROLES de la 
	 * base de datos de EPSANdes
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos ROLES
	 */
	public List<Roles> darTiposBebida (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaRoles());
		q.setResultClass(Roles.class);
		return (List<Roles>) q.executeList();
	}

}
