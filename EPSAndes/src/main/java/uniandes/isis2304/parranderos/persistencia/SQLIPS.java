package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.IPS;

public class SQLIPS {

	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra ac谩 para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaParranderos.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicaci贸n
	 */
	private PersistenciaEPS pp;

	/* ****************************************************************
	 * 			M茅todos
	 *****************************************************************/

	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicaci贸n
	 */
	public SQLIPS (PersistenciaEPS pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar una IPS a la base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @param idIPS - El identificador de la IPS
	 * @param nombre - El nombre de la IPS
	 * @param tipo - El tipo de de la IPS (HOSPITAL, CENTRO DE DIAGN覵TICO, LABORATORIO, CENTRO M蒁ICO)
	 * @param localizacion - La localizaci髇 de la IPS
	 * @return El n煤mero de tuplas insertadas
	 */
	public long adicionarIPS (PersistenceManager pm, long idIPS, String nombre, String tipo, String localizacion) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaIPS () + "(id, nombre, tipo, localizacion) values (?, ?, ?, ?)");
        q.setParameters(idIPS, nombre, tipo, localizacion);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar IPS de la base de datos de EPSAndes, por su nombre
	 * @param pm - El manejador de persistencia
	 * @param nombreIPS - El nombre de la IPS
	 * @return EL n煤mero de tuplas eliminadas
	 */
	public long eliminarIPSPorNombre (PersistenceManager pm, String nombreIPS)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaIPS() + " WHERE nombre = ?");
        q.setParameters(nombreIPS);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar una IPS de la base de datos de EPSAndes, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idIPS - El identificador de la IPS
	 * @return EL n煤mero de tuplas eliminadas
	 */
	public long eliminarIPSPorId (PersistenceManager pm, long idIPS)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaIPS() + " WHERE id = ?");
        q.setParameters(idIPS);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la informaci贸n de una IPS de la 
	 * base de datos de EPSAndes, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idIPS - El identificador de la IPS
	 * @return El objeto IPS que tiene el identificador dado
	 */
	public IPS darIPSPorId (PersistenceManager pm, long idIPS) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaIPS() + " WHERE id = ?");
		q.setResultClass(IPS.class);
		q.setParameters(idIPS);
		return (IPS) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la informaci贸n de las IPS de la 
	 * base de datos de EPSAndes, por su nombre
	 * @param pm - El manejador de persistencia
	 * @param nombreIPS - El nombre de IPS buscado
	 * @return Una lista de objetos IPS que tienen el nombre dado
	 */
	public List<IPS> darIPSPorNombre (PersistenceManager pm, String nombreIPS) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaIPS() + " WHERE nombre = ?");
		q.setResultClass(IPS.class);
		q.setParameters(nombreIPS);
		return (List<IPS>) q.executeList();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la informaci贸n de las IPS de la 
	 * base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos IPS
	 */
	public List<IPS> darIPS (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaIPS());
		q.setResultClass(IPS.class);
		return (List<IPS>) q.executeList();
	}

}
