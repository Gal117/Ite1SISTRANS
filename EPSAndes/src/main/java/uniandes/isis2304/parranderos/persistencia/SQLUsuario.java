package uniandes.isis2304.parranderos.persistencia;

import java.sql.Timestamp;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Usuario;

public class SQLUsuario {
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
	public SQLUsuario (PersistenciaEPS pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un USUARIO a la base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @param pIdUsuario - El identificador del usuario.
	 * @param pTipoDoc - El tipo de documento.
	 * @param pNumDoc - El n�mero de documento.
	 * @param pNombre - El nombre de usuario.
	 * @param pCorreo - El correo del usuario.
	 * @param pFechaNacimiento - Fecha de nacimiento de usuario.
	 * @param pIdRol - El id del rol.
	 * @return EL número de tuplas insertadas
	 */
	public long adicionarUsuario (PersistenceManager pm, long idUsuario, String pTipoDoc, String pNumDoc, String pNombre, String pCorreo, Timestamp pFechaNacimiento, long pIdRol ) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaUsuario() + "(idUsuario, tipoDocumento, numeroDocumento, nombre, correo, fechaNacimiento, idRol) values (?, ?, ?, ?, ?, ?,?)");
        q.setParameters(idUsuario, pTipoDoc, pNumDoc, pNombre, pCorreo, pFechaNacimiento, pIdRol);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar USUARIO de la base de datos de EPSAndes, por su numero de documento.
	 * @param pm - El manejador de persistencia
	 * @param pNumDoc- El numero de documento del usuario.
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarUsuarioPorNumeroDocumento (PersistenceManager pm, String pNumDoc)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaUsuario() + " WHERE numeroDocumento = ?");
        q.setParameters(pNumDoc);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar USUARIO de la base de datos de EPSAndes, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idUsr - El identificador del usuario
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarUsuarioPorId (PersistenceManager pm, long idUsr)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaUsuario()+ " WHERE idUsuario = ?");
        q.setParameters(idUsr);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de un USUARIO de la 
	 * base de datos de EPSANdes, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idUsr - El identificador del usuario
	 * @return El objeto ROL que tiene el identificador dado
	 */
	public Usuario darUsuarioPorId (PersistenceManager pm, long idUsr) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaUsuario() + " WHERE idUsuario = ?");
		q.setResultClass(Usuario.class);
		q.setParameters(idUsr);
		return (Usuario) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de un USUARIO de la 
	 * base de datos de EPSAndes, por su nombre
	 * @param pm - El manejador de persistencia
	 * @param nombreRol - El nombre del usuario
	 * @return El objeto Usuario que tiene el nombre dado
	 */
	public List<Usuario> darUsuarioPorNombre (PersistenceManager pm, String nombreUsr) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaUsuario() + " WHERE nombre = ?");
		q.setResultClass(Usuario.class);
		q.setParameters(nombreUsr);
		return (List<Usuario>) q.executeList();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de los USUARIOS de la 
	 * base de datos de EPSANdes
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos USUARIOS
	 */
	public List<Usuario> darUsuarios (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaUsuario());
		q.setResultClass(Usuario.class);
		return (List<Usuario>) q.executeList();
	}
}
