package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.MedicoOrden;
import uniandes.isis2304.parranderos.negocio.ServicioPrestado;

public class SQLMedicoOrden {
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
	public SQLMedicoOrden (PersistenciaEPS pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un MEDICOORDEN a la base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @param pIdOrden - El id de la orden.
	 * @param pIdMedico - El id del m�dico.
	 * @param pIdAfiliado - El id del afiliado.
	 * @param pIdIPS- El identificador de la IPS donde es la orden.
	 * @param pIdServicio - El identificador del servicio.
	 * @param pNumOrden - N�mero de la orden
	 * @return EL número de tuplas insertadas
	 */
	public long adicionarMedicoOrden(PersistenceManager pm, long pIdOrden, long pIdMedico, long pIdAfiliado, long pIdIPS, long pIdServicio, String pNumOrden) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaMedicoOrden() + "(idOrden, idMedico, idAfiliado, idIPS, idServicio, numeroOrden) values (?, ?, ?, ?, ?, ?)");
        q.setParameters(pIdOrden, pIdMedico, pIdAfiliado, pIdIPS, pIdServicio, pNumOrden);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar UN MEDICOORDEN de la base de datos de EPSAndes, por sus identificador
	 * @param pm - El manejador de persistencia
	 * @param pIdOrden- El identificador de la orden
	 * @return EL número de tuplas eliminadas
	 */
	public long eliminarMedicoOrden (PersistenceManager pm, long pIdOrden)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " +  pp.darTablaMedicoOrden() + " WHERE idOrden = ?");
        q.setParameters(pIdOrden);
        return (long) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la información de los SERVICIOPRESTADO de la 
	 * base de datos de EPSAndes
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos IPSPrestaServicios
	 */
	public List<MedicoOrden> darServicioPrestado (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaMedicoOrden()  );
		q.setResultClass(MedicoOrden.class);
		List<MedicoOrden> resp = (List<MedicoOrden>) q.execute();
		return resp;
	}
}
