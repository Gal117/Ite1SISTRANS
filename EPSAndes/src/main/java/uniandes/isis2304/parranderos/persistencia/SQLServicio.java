package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Roles;

public class SQLServicio {
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
	public SQLServicio (PersistenciaEPS pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un SERVICIO a la base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @param idRol - El identificador del servicio.
	 * @param nombre - El nombre del servicio.
	 * @return EL número de tuplas insertadas
	 */
	public long adicionarServicio (PersistenceManager pm, long idServicio, String nombre) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaServicio() + "(id, nombre) values (?, ?)");
        q.setParameters(idServicio, nombre);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar SERVICIO de la base de datos de EPSAndes, por su nombre
	 * @param pm - El manejador de persistencia
	 * @param nombreRol- El nombre del servicio.
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarServicioPorNombre (PersistenceManager pm, String nombreServicio)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaServicio() + " WHERE nombre = ?");
        q.setParameters(nombreServicio);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar SERVICIO de la base de datos de EPSAndes, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idRol - El identificador del servicio
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarServicioPorId (PersistenceManager pm, long idServicio)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " +  pp.darTablaServicio() + " WHERE id = ?");
        q.setParameters(idServicio);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de un SERVICIO de la 
	 * base de datos de EPSANdes, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idRol - El identificador del servicio
	 * @return El objeto SERVICIO que tiene el identificador dado
	 */
	public Roles darServicioPorId (PersistenceManager pm, long idServicio) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " +  pp.darTablaServicio() + " WHERE id = ?");
		q.setResultClass(Roles.class);
		q.setParameters(idServicio);
		return (Roles) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de un SERVICIO de la 
	 * base de datos de EPSAndes, por su nombre.
	 * @param pm - El manejador de persistencia.
	 * @param nombreRol - El nombre del servicio.
	 * @return El objeto SERVICIO que tiene el nombre dado.
	 */
	public List<Roles> darServicioPorNombre (PersistenceManager pm, String nombreServicio) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaServicio() + " WHERE nombre = ?");
		q.setResultClass(Roles.class);
		q.setParameters(nombreServicio);
		return (List<Roles>) q.executeList();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de los ROLES de la 
	 * base de datos de EPSANdes
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos ROLES
	 */
	public List<Roles> darServicios (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " +  pp.darTablaServicio());
		q.setResultClass(Roles.class);
		return (List<Roles>) q.executeList();
	}

}
