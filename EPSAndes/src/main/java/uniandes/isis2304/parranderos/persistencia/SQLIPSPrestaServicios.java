package uniandes.isis2304.parranderos.persistencia;

import java.sql.Timestamp;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.IPSPrestaServicios;

public class SQLIPSPrestaServicios {
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
	public SQLIPSPrestaServicios (PersistenciaEPS pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un IPSPRESTASERICIOS a la base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @param pIdIPS - El identificador de la IPS
	 * @param pIdServicio - El identificador del servicio
	 * @return EL número de tuplas insertadas
	 */
	public long adicionarIPSPrestaServicio(PersistenceManager pm, long pIdIPS, long pIdServicio, int pCapacidad, Timestamp pFechaIni, Timestamp pFechaFin) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaIPSPrestaServicios () + "(idIPS, idServicio, capacidad, fechaInicio, fechaFin) values (?, ?)");
        q.setParameters(pIdIPS, pIdServicio, pCapacidad, pFechaIni, pFechaFin);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN IPSPRESTASERVICIOS de la base de datos de EPSAndes, por sus identificador
	 * @param pm - El manejador de persistencia
	 * @param pIdIPS - El identificador de la IPS
	 * @param pIdServicio - El identificador del servicio
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarIPSPrestaServicio (PersistenceManager pm, long pIdIPS, long pIdServicio)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaIPSPrestaServicios ()+ " WHERE idIPS = ? AND idServicio = ?");
        q.setParameters(pIdIPS, pIdServicio);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de los IPSPrestaServicios de la 
	 * base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos IPSPrestaServicios
	 */
	public List<IPSPrestaServicios> darIPSPrestaServicios (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaIPSPrestaServicios ());
		q.setResultClass(IPSPrestaServicios.class);
		List<IPSPrestaServicios> resp = (List<IPSPrestaServicios>) q.execute();
		return resp;
	}

}
