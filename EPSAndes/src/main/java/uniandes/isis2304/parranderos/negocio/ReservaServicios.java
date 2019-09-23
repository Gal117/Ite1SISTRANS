package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

public class ReservaServicios implements VOReservaServicios {

	private long idReserva;

	private String tipoDocumentoUsuario;

	private String numeroDocumentoUsuario;

	private long idIPS;

	private long idServicio;

	private String tipoDocumentoMedico;

	private String numeroDocumentoMedico;

	private Timestamp fechayHora;
	
	public ReservaServicios()
	{
		this.idReserva=0;
		this.tipoDocumentoUsuario=null;
		this.numeroDocumentoUsuario = "";
		this.idIPS = 0;
		this.idServicio = 0;
		this.tipoDocumentoMedico = null;
		this.numeroDocumentoMedico = "";
		this.fechayHora = new Timestamp(0);
	}
	public ReservaServicios(long idR, String tipoU, String numU,long idI,long idS, String tipoM,String numM, Timestamp f ) 
	{
		this.idReserva=idR;
		this.tipoDocumentoUsuario=tipoU;
		this.numeroDocumentoUsuario = numU;
		this.idIPS = idI;
		this.idServicio = idS;
		this.tipoDocumentoMedico = tipoM;
		this.numeroDocumentoMedico = numM;
		this.fechayHora = f;
	}
	public long getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}
	public String getTipoDocumentoUsuario() {
		return tipoDocumentoUsuario;
	}
	public void setTipoDocumentoUsuario(String tipoDocumentoUsuario) {
		this.tipoDocumentoUsuario = tipoDocumentoUsuario;
	}
	public String getNumeroDocumentoUsuario() {
		return numeroDocumentoUsuario;
	}
	public void setNumeroDocumentoUsuario(String numeroDocumentoUsuario) {
		this.numeroDocumentoUsuario = numeroDocumentoUsuario;
	}
	public long getIdIPS() {
		return idIPS;
	}
	public void setIdIPS(long idIPS) {
		this.idIPS = idIPS;
	}
	public long getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}
	public String getTipoDocumentoMedico() {
		return tipoDocumentoMedico;
	}
	public void setTipoDocumentoMedico(String tipoDocumentoMedico) {
		this.tipoDocumentoMedico = tipoDocumentoMedico;
	}
	public String getNumeroDocumentoMedico() {
		return numeroDocumentoMedico;
	}
	public void setNumeroDocumentoMedico(String numeroDocumentoMedico) {
		this.numeroDocumentoMedico = numeroDocumentoMedico;
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
		return "Servicio [id de la reserva=" + idReserva+ ", tipo del documento del usuario=" + tipoDocumentoUsuario +", numero del documento del usuario=" + numeroDocumentoUsuario+
				", id de la IPS=" + idIPS + ", id del servicio=" + idServicio+", tipo del documento del medico=" + tipoDocumentoMedico +
				", numero del documento del medico=" + numeroDocumentoMedico+", fecha y hora de la reserva=" + fechayHora+"]";
	}

}
