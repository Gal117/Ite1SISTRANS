package uniandes.isis2304.parranderos.negocio;


public class ServicioPrestado implements VOServicioPrestado {
	
	/**
	 * Atributo que da el id del recepcionista que registra si se prestó el servicio
	 */
	private long idRecepcionista;
	
	/**
	 * Atributo que da el id de reserva de servicio
	 */
	private long idReserva;
	
	/**
	 * Atributo que da si un afiliado tomó el servicio reservado
	 */
	private String cumplido;
	
	public ServicioPrestado() {
		this.idRecepcionista = 0;
		this.idReserva = 0;
		this.cumplido = "";
	}
	/**
	 * Constructor de ServicioPrestado 
	 * @param idRecep - id del recepcionista que registra la prestación de servicio
	 * @param idReser - id de la reserva de servicio
	 * @param c - dice si el afiliado fue o no a la cita reservada (Y,N). Y si fue, N si no
	 */
	public ServicioPrestado(long idRecep, long idReser,String c)
	{
		this.idRecepcionista = idRecep;
		this.idReserva = idReser;
		this.cumplido = c;
	}
	public long getIdRecepcionista() {
		return this.idRecepcionista;
	}
	
	public void setIdRecepcionista(long pIdRecep) {
		this.idRecepcionista = pIdRecep;
	}
	public long getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}
	public String getCumplido() {
		return cumplido;
	}
	public void setCumplido(String cumplido) {
		this.cumplido = cumplido;
	}
	/**
	 * @return Una cadena con la informaciÃ³n bÃ¡sica del ServicioPrestado
	 */
	@Override
	public String toString() 
	{
		return "ServicioPrestado ["+ "ID del recepcionista que registra"+ idRecepcionista +
				", ID de reserva =" + idReserva + ", se completo la cita =" + cumplido+"]";
	}
	
}
