package uniandes.isis2304.parranderos.persistencia;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.JDODataStoreException;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.apache.log4j.Logger;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class PersistenciaEPS {

	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Logger para escribir la traza de la ejecución
	 */
	private static Logger log = Logger.getLogger(PersistenciaEPS.class.getName());

	/**
	 * Cadena para indicar el tipo de sentencias que se va a utilizar en una consulta
	 */
	public final static String SQL = "javax.jdo.query.SQL";

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * Atributo privado que es el único objeto de la clase - Patrón SINGLETON
	 */
	private static PersistenciaEPS instance;

	/**
	 * Fábrica de Manejadores de persistencia, para el manejo correcto de las transacciones
	 */
	private PersistenceManagerFactory pmf;

	/**
	 * Arreglo de cadenas con los nombres de las tablas de la base de datos, en su orden:
	 * Secuenciador, tipoBebida, bebida, bar, bebedor, gustan, sirven y visitan
	 */
	private List <String> tablas;

	/**
	 * Atributo para el acceso a las sentencias SQL propias a PersistenciaParranderos
	 */
	private SQLUtil sqlUtil;
	
	/**
	 * Atributo para acceder a sentencias SQL de la tabla Roles
	 */
	private SQLRoles sqlRoles;
	
	/**
	 * Atributo para acceder a sentencias SQL de la tabla Servicios
	 */
	private SQLServicio sqlServicio;
	
	/**
	 * Atributo para acceder a sentencias SQL de la tabla Servicios
	 */
	private SQLIPS sqlIps;

	/**
	 * Atributo para acceder a sentencias SQL de la tabla IpsPrestaServicios
	 */
	private SQLIPSPrestaServicios sqlIpsPrestaServicios;

	/**
	 * Atributo para acceder a sentencias SQL de la tabla MedicosIPS
	 */
	private SQLMedicosIPS sqlMedicosIPS;

	/**
	 * Atributo para acceder a sentencias SQL de la tabla MedicosIPS
	 */
	private SQLServicioPrestado sqlServicioPrestado;

	/**
	 * Atributo para acceder a sentencias SQL de la tabla ReservaServicios
	 */
	private SQLReservaServicios sqlReservaServicios;

	/**
	 * Atributo para acceder a sentencias SQL de la tabla ReservaServicios
	 */
	private SQLMedicoOrden sqlMedicoOrden;
	/**
	 * Atributo para acceder a sentencias SQL de la tabla Usuario
	 */
	private SQLUsuario sqlUsuario;

	/**
	 * Atributo para acceder a sentencias SQL de la tabla Medico
	 */
	private SQLMedico sqlMedico;

	/**
	 * Constructor privado con valores por defecto - Patrón SINGLETON
	 */
	private PersistenciaEPS ()
	{
		pmf = JDOHelper.getPersistenceManagerFactory("Parranderos");		
		crearClasesSQL ();

		// Define los nombres por defecto de las tablas de la base de datos
		tablas = new LinkedList<String> ();
		tablas.add ("EPS_sequence");
		tablas.add ("IPS");
		tablas.add ("IPSPRESTASERVICIOS");
		tablas.add ("MEDICO");
		tablas.add ("MEDICOORDEN");
		tablas.add ("MEDICOSIPS");
		tablas.add ("RESERVASERVICIOS");
		tablas.add ("ROLES");
		tablas.add ("SERVICIO");
		tablas.add ("SERVICIOPRESTADO");
		tablas.add ("USUARIO");
	}
	
	/**
	 * Constructor privado, que recibe los nombres de las tablas en un objeto Json - Patrón SINGLETON
	 * @param tableConfig - Objeto Json que contiene los nombres de las tablas y de la unidad de persistencia a manejar
	 */
	private PersistenciaEPS (JsonObject tableConfig)
	{
		crearClasesSQL ();
		tablas = leerNombresTablas (tableConfig);
		
		String unidadPersistencia = tableConfig.get ("unidadPersistencia").getAsString ();
		log.trace ("Accediendo unidad de persistencia: " + unidadPersistencia);
		pmf = JDOHelper.getPersistenceManagerFactory (unidadPersistencia);
	}
	/**
	 * @return Retorna el único objeto PersistenciaParranderos existente - Patrón SINGLETON
	 */
	public static PersistenciaEPS getInstance ()
	{
		if (instance == null)
		{
			instance = new PersistenciaEPS ();
		}
		return instance;
	}
	
	/**
	 * Constructor que toma los nombres de las tablas de la base de datos del objeto tableConfig
	 * @param tableConfig - El objeto JSON con los nombres de las tablas
	 * @return Retorna el único objeto PersistenciaParranderos existente - Patrón SINGLETON
	 */
	public static PersistenciaEPS getInstance (JsonObject tableConfig)
	{
		if (instance == null)
		{
			instance = new PersistenciaEPS (tableConfig);
		}
		return instance;
	}
	
	/**
	 * Cierra la conexión con la base de datos
	 */
	public void cerrarUnidadPersistencia ()
	{
		pmf.close ();
		instance = null;
	}
	
	/**
	 * Genera una lista con los nombres de las tablas de la base de datos
	 * @param tableConfig - El objeto Json con los nombres de las tablas
	 * @return La lista con los nombres del secuenciador y de las tablas
	 */
	private List <String> leerNombresTablas (JsonObject tableConfig)
	{
		JsonArray nombres = tableConfig.getAsJsonArray("tablas") ;

		List <String> resp = new LinkedList <String> ();
		for (JsonElement nom : nombres)
		{
			resp.add (nom.getAsString ());
		}
		
		return resp;
	}
	
	/**
	 * Crea los atributos de clases de apoyo SQL
	 */
	private void crearClasesSQL ()
	{
		sqlRoles = new SQLRoles(this);
		sqlServicio = new SQLServicio(this);
		sqlIps =new SQLIPS(this);
		sqlIpsPrestaServicios = new SQLIPSPrestaServicios(this);
		sqlMedicosIPS = new SQLMedicosIPS(this);
		sqlServicioPrestado = new SQLServicioPrestado(this);
		sqlReservaServicios = new SQLReservaServicios(this);
		sqlMedicoOrden = new SQLMedicoOrden(this);
		sqlUsuario = new SQLUsuario(this);
		sqlMedico = new SQLMedico(this);
		sqlUtil = new SQLUtil(this);
	}
	/**
	 * @return La cadena de caracteres con el nombre del secuenciador de parranderos
	 */
	public String darSeqParranderos ()
	{
		return tablas.get (0);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de IPS de EPSAndes
	 */
	public String darTablaIPS()
	{
		return tablas.get (1);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de IPSPrestaServicios de EPSAndes
	 */
	public String darTablaIPSPrestaServicios()
	{
		return tablas.get (2);
	}
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Medico de EPSAndes
	 */
	public String darTablaMedico()
	{
		return tablas.get (3);
	}
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de MedicosOrden de EPSAndes
	 */
	public String darTablaMedicoOrden()
	{
		return tablas.get (4);
	}
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de MedicosIPS de EPSAndes
	 */
	public String darTablaMedicosIPS()
	{
		return tablas.get (5);
	}
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de MedicosIPS de EPSAndes
	 */
	public String darTablaReservaServicios()
	{
		return tablas.get (6);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Roles de EPSAndes
	 */
	public String darTablaRoles()
	{
		return tablas.get (7);
	}
	
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Servicios de EPSAndes
	 */
	public String darTablaServicio()
	{
		return tablas.get (8);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Servicios de EPSAndes
	 */
	public String darTablaServicioPrestado()
	{
		return tablas.get (9);
	}
	
	/**
	 * @return La cadena de caracteres con el nombre de la tabla de Servicios de EPSAndes
	 */
	public String darTablaUsuario()
	{
		return tablas.get (10);
	}
	
	/**
	 * Transacción para el generador de secuencia de Parranderos
	 * Adiciona entradas al log de la aplicación
	 * @return El siguiente número del secuenciador de Parranderos
	 */
	private long nextval ()
	{
        long resp = sqlUtil.nextval (pmf.getPersistenceManager());
        log.trace ("Generando secuencia: " + resp);
        return resp;
    }
	
	/**
	 * Extrae el mensaje de la exception JDODataStoreException embebido en la Exception e, que da el detalle específico del problema encontrado
	 * @param e - La excepción que ocurrio
	 * @return El mensaje de la excepción JDO
	 */
	private String darDetalleException(Exception e) 
	{
		String resp = "";
		if (e.getClass().getName().equals("javax.jdo.JDODataStoreException"))
		{
			JDODataStoreException je = (javax.jdo.JDODataStoreException) e;
			return je.getNestedExceptions() [0].getMessage();
		}
		return resp;
	}
}
