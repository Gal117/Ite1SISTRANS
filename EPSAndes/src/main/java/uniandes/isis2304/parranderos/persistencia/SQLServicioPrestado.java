package uniandes.isis2304.parranderos.persistencia;

import java.sql.Timestamp;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.IPSPrestaServicios;
import uniandes.isis2304.parranderos.negocio.ServicioPrestado;

public class SQLServicioPrestado {
	
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
	public SQLServicioPrestado (PersistenciaEPS pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un SERVICIOPRESTADO a la base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @param pIdRecep - El identificador del recepcionista que registra
	 * @param pIdReserva - El identificador de la reserva
	 * @param pCumplido - Indica si el afiliado fue o no a la cita (Y,N)
	 * @return EL número de tuplas insertadas
	 */
	public long adicionarServicioPrestado(PersistenceManager pm, long pIdRecep, long pIdReserva, String pCumplido) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaServicioPrestado() + "(idRecepcionista, idReserva, cumplido) values (?, ?, ?)");
        q.setParameters(pIdRecep, pIdReserva, pCumplido);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN SERVICIOPRESTADO de la base de datos de EPSAndes, por sus identificador
	 * @param pm - El manejador de persistencia
	 * @param pIdRecep - El identificador de la IPS
	 * @param pIdReserva - El identificador de la reserva
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarServicioPrestado (PersistenceManager pm, long pIdRecep, long pIdReserva)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " +pp.darTablaServicioPrestado() + " WHERE idRecepcionista = ? AND idReserva = ?");
        q.setParameters(pIdRecep, pIdReserva);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de los SERVICIOPRESTADO de la 
	 * base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos IPSPrestaServicios
	 */
	public List<ServicioPrestado> darServicioPrestado (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaServicioPrestado() );
		q.setResultClass(ServicioPrestado.class);
		List<ServicioPrestado> resp = (List<ServicioPrestado>) q.execute();
		return resp;
	}
}
