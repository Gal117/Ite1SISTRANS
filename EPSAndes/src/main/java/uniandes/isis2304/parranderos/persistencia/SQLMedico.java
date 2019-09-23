package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Medico;
import uniandes.isis2304.parranderos.negocio.Roles;

/**
 * @author dagar
 *
 */
public class SQLMedico {
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
	public SQLMedico (PersistenciaEPS pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar un MEDICO a la base de datos de EPSAndes
	 * @param pm - manejador de persistencia.
	 * @param idMedico - id del medico.
	 * @param pTipoDoc - tipo de documento del m閐ico.
	 * @param pNumDoc - n鷐ero de documento del m閐ico.
	 * @param pNombre - nombre del m閐ico.
	 * @param idRol - identficador del rol.
	 * @param pEspec - especialidad del m閐ico.
	 * @param pNumRegi - n鷐ero de registro del m閐ico.
	 * @return numero de tuplas insertadas.
	 */
	public long adicionarMedico (PersistenceManager pm, long idMedico, String pTipoDoc, String pNumDoc, String pNombre, long idRol, String pEspec, int pNumRegi) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaMedico() + "(id, tipoDocumento, numeroDocumento, nombre, rol, especialidad, numeroRegistro) values (?, ?, ?, ?, ?, ?, ?)");
        q.setParameters(idMedico, pTipoDoc, pNumDoc, pNombre, idRol, pEspec, pNumRegi);
        return (long) q.executeUnique();            
	}

	
	/**
	 * Sentencia SQL para eliminar un MEDICO de la base de datos de EPSAndes por nombre
	 * @param pm manejador de persistencia.
	 * @param nombreMed nombre del medico a eliminar.
	 * @return numero de tuplas eliminadas
	 */
	public long eliminarMedicoPorNombre (PersistenceManager pm, String nombreMed)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaMedico() + " WHERE nombre = ?");
        q.setParameters(nombreMed);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar MEDICO de la base de datos de EPSAndes, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idMedico - El identificador del rol
	 * @return EL n煤mero de tuplas eliminadas
	 */
	public long eliminarMedicoPorId (PersistenceManager pm, long idMed)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaMedico()  + " WHERE id = ?");
        q.setParameters(idMed);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la informaci贸n de un ROL de la 
	 * base de datos de EPSANdes, por su identificador
	 * @param pm - El manejador de persistencia
	 * @param idMed - El identificador del medico.
	 * @return El objeto MEDICO que tiene el identificador dado
	 */
	public Medico darMedicoPorId (PersistenceManager pm, long idMed) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " +  pp.darTablaMedico()  + " WHERE id = ?");
		q.setResultClass(Medico.class);
		q.setParameters(idMed);
		return (Medico) q.executeUnique();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la informaci贸n de un MEDICO de la 
	 * base de datos de EPSAndes, por su nombre
	 * @param pm - El manejador de persistencia
	 * @param nombreMEd - El nombre del medico
	 * @return El objeto MEDICO que tiene el nombre dado
	 */
	public List<Medico> darMedicosPorNombre (PersistenceManager pm, String nombreMed) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaMedico() + " WHERE nombre = ?");
		q.setResultClass(Medico.class);
		q.setParameters(nombreMed);
		return (List<Medico>) q.executeList();
	}

	/**
	 * Crea y ejecuta la sentencia SQL para encontrar la informaci贸n de los MEDICO de la 
	 * base de datos de EPSANdes
	 * @param pm - El manejador de persistencia
	 * @return Una lista de objetos MEDICOS
	 */
	public List<Medico> darMedicos (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaMedico());
		q.setResultClass(Medico.class);
		return (List<Medico>) q.executeList();
	}
}
