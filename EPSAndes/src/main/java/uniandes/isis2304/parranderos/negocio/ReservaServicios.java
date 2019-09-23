package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

public class ReservaServicios implements VOReservaServicios {

	private long idReserva;

	private long idAfiliado;

	private long idIPS;

	private long idServicio;

	private long idMedico;
	
	private Timestamp fechayHora;
	
	public ReservaServicios()
	{
		this.idReserva=0;
		this.idAfiliado = 0;
		this.idIPS = 0;
		this.idServicio = 0;
		this.idMedico = 0;
		this.fechayHora = new Timestamp(0);
	}
	public ReservaServicios(long idReserv,long idIPS,long idServ, long idMedico, Timestamp fechaHora ) 
	{
		this.idReserva=idReserv;
		this.idIPS = idIPS;
		this.idServicio = idServ;
		this.idMedico = idMedico;
		this.fechayHora = fechaHora;
	}
	public long getIdAfiliado() {
		return idAfiliado;
	}
	public void setIdAfiliado(long idAfiliado) {
		this.idAfiliado = idAfiliado;
	}
	public long getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}
	
	public long getIdIPS() {
		return idIPS;
	}
	public void setIdIPS(long idIPS) {
		this.idIPS = idIPS;
	}
	public long getIdMedico() {
		return this.idMedico;
	}
	public void setIdMedico(long pIdMedico) {
		this.idMedico = pIdMedico;
	}
	public long getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}

	public Timestamp getFechayHora() {
		return fechayHora;
	}
	public void setFechayHora(Timestamp fechayHora) {
		this.fechayHora = fechayHora;
	}
	/**
	 * @return Una cadena con la información básica del servicio prestado
	 */
	@Override
	public String toString() 
	{
		return "Servicio [id de la reserva:" + idReserva+ ", id del afiliado:" + idAfiliado +", id de la IPS:" + idIPS + ", id del servicio:" + idServicio +
				", id del m�dico:" + idMedico + " fecha y hora de la reserva:" + fechayHora+"]";
	}

}
