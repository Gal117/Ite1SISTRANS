package uniandes.isis2304.parranderos.negocio;


public class MedicoOrden implements VOMedicoOrden {
	
	private long numeroOrden;
	
	private String tipoDocumentoUsuario;

	private String numeroDocumentoUsuario;

	private long idIPS;

	private long idServicio;

	private String tipoDocumentoMedico;

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
	
	public MedicoOrden(long num, String tipoU, String numU, long idI,long idS, String tipoM, String numM) {
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
