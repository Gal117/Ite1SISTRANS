package uniandes.isis2304.parranderos.negocio;

import com.sun.jmx.snmp.Timestamp;

import uniandes.isis2304.parranderos.negocio.Persona.tipo;

public class ReservaServicios {

	private long idReserva;

	private tipo tipoDocumentoUsuario;

	private String numeroDocumentoUsuario;

	private long idIPS;

	private long idServicio;

	private tipo tipoDocumentoMedico;

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
	public ReservaServicios(long idR, tipo tipoU, String numU,long idI,long idS, tipo tipoM,String numM, Timestamp f ) 
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
	public tipo getTipoDocumentoUsuario() {
		return tipoDocumentoUsuario;
	}
	public void setTipoDocumentoUsuario(tipo tipoDocumentoUsuario) {
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
	public tipo getTipoDocumentoMedico() {
		return tipoDocumentoMedico;
	}
	public void setTipoDocumentoMedico(tipo tipoDocumentoMedico) {
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
