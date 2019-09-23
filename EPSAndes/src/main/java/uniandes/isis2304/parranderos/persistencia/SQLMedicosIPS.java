package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.IPSPrestaServicios;
import uniandes.isis2304.parranderos.negocio.MedicosIPS;

public class SQLMedicosIPS {
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
	public SQLMedicosIPS (PersistenciaEPS pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un MEDICOSIPS a la base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @param pIdMedico - El identificador del servicio
	 * @param pIdIPS - El identificador de la IPS	 
	 * @return EL número de tuplas insertadas
	 */
	public long adicionarMedicosIPS(PersistenceManager pm, long pIdMedico, long pIdIPS) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaMedicosIPS() + "(idMedico, idIPS) values (?, ?)");
        q.setParameters(pIdMedico, pIdIPS);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN MEDICOSIPS de la base de datos de EPSAndes, por sus identificador
	 * @param pm - El manejador de persistencia
	 * @param pIdMedico - El identificador del servicio
	 * @param pIdIPS - El identificador de la IPS
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarMedicosIPS (PersistenceManager pm, long pIdMedico, long pIdIPS)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaMedicosIPS() + " WHERE idMedico = ? AND idIPS = ?");
        q.setParameters(pIdMedico, pIdIPS);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de los MEDICOSIPS de la 
	 * base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos MEDICOSIPS
	 */
	public List<MedicosIPS> darMedicosIPS (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaMedicosIPS());
		q.setResultClass(MedicosIPS.class);
		List<MedicosIPS> resp = (List<MedicosIPS>) q.execute();
		return resp;
	}
}
