package uniandes.isis2304.parranderos.negocio;

import uniandes.isis2304.parranderos.negocio.Persona.tipo;

public class MedicoOrden {
	
	private long numeroOrden;
	
	private tipo tipoDocumentoUsuario;

	private String numeroDocumentoUsuario;

	private long idIPS;

	private long idServicio;

	private tipo tipoDocumentoMedico;

	private String numeroDocumentoMedico;
	
	
	public MedicoOrden() {
		this.numeroOrden=0;
		this.tipoDocumentoUsuario=null;
		this.numeroDocumentoUsuario="";
		this.idIPS=0;
		this.idServicio=0;
		this.tipoDocumentoMedico=null;
		this.numeroDocumentoMedico="";
	}
	
	public MedicoOrden(long num, tipo tipoU, String numU, long idI,long idS, tipo tipoM, String numM) {
		this.numeroOrden=num;
		this.tipoDocumentoUsuario=tipoU;
		this.numeroDocumentoUsuario=numU;
		this.idIPS=idI;
		this.idServicio=idS;
		this.tipoDocumentoMedico=tipoM;
		this.numeroDocumentoMedico=numM;
	}

	public long getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(long numeroOrden) {
		this.numeroOrden = numeroOrden;
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
	/**
	 * @return Una cadena con la información básica del medico
	 */
	@Override
	public String toString() 
	{
		return "MedicoOrden [numero de orden=" + numeroOrden+ ", tipo documento usuario=" + tipoDocumentoUsuario +
				", numero documento usuario=" + numeroDocumentoUsuario+", id IPS=" + idIPS +", id del servicio=" + idServicio+
				", tipo documento medico=" + tipoDocumentoMedico +	", numero documento usuario=" + numeroDocumentoMedico+"]";
	}
	 
}
