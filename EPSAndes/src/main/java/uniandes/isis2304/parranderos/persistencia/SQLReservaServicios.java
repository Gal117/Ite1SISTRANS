package uniandes.isis2304.parranderos.persistencia;

import java.sql.Timestamp;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.ReservaServicios;

public class SQLReservaServicios {
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
	public SQLReservaServicios (PersistenciaEPS pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un RESERVASERVICIOS a la base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @param pIdReserva - El identificador de la reserva.
	 * @param pIdAfiliado - El identificador del afiliado.
	 * @param pIdIPS - El identificador de la IPS.
	 * @param pIdMedico - El identificador del m�dico.
	 * @param pFechaHora - fecha y hora de la reserva.
	 * @return EL número de tuplas insertadas
	 */
	public long adicionarReservaServicios(PersistenceManager pm, long pIdReserva, long pIdAfiliado, long pIdIPS, long pIdServicio, long pIdMedico, Timestamp pFechaHora) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaReservaServicios() + "(idReserva, idAfiliado, idIPS, idServicio, idMedico, fechaHora) values (?, ?, ?, ?, ?, ? )");
        q.setParameters(pIdReserva, pIdAfiliado, pIdIPS, pIdServicio, pIdMedico, pFechaHora );
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN RESERVASERVICIOS de la base de datos de EPSAndes, por sus identificador
	 * @param pm - El manejador de persistencia
	 * @param pIdReserva - El identificador de la reserva
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarReservaServicios (PersistenceManager pm, long pIdReserva)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaReservaServicios()+ " WHERE idReserva = ?");
        q.setParameters(pIdReserva);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de los IPSPrestaServicios de la 
	 * base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos IPSPrestaServicios
	 */
	public List<ReservaServicios> darReservaServicios (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaReservaServicios());
		q.setResultClass(ReservaServicios.class);
		List<ReservaServicios> resp = (List<ReservaServicios>) q.execute();
		return resp;
	}
}
