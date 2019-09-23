package uniandes.isis2304.parranderos.negocio;


public class MedicoOrden implements VOMedicoOrden {
	
	private long idOrden;
	
	private long idMedico;
	
	private long idUsuario;
	
	private long idIPS;
	
	private long idServicio;
	
	private String numOrden;
	
	public MedicoOrden() {
		this.idOrden = 0;
		this.idMedico = 0;
		this.idUsuario = 0;
		this.idIPS = 0;
		this.idServicio = 0;
		this.numOrden = "";
	}
	
	public MedicoOrden(long pIdOrden, long pIdMedico, long pIdUsuario, long pIdIPS, long pIdServicio, String pNumOrden) {
		this.idOrden = pIdOrden;
		this.idMedico = pIdMedico;
		this.idUsuario = pIdUsuario;
		this.idIPS = pIdIPS;
		this.idServicio = pIdServicio;
		this.numOrden = pNumOrden;
	}

	public long getIdOrden() {
		return this.idOrden;
	}

	public void setIdOrden(long pIdOrden) {
		this.idOrden = pIdOrden;
	}
	
	public long getIdMedico() {
		return this.idMedico;
	}
	public void setIdMedico(long pIdMedico) {
		this.idMedico = pIdMedico;
	}
	
	public long getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(long pIdUsr) {
		this.idOrden = pIdUsr;
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

	public String getNumeroOrden() {
		return numOrden;
	}
	
	public void setNumeroOrden(String pNumeroOrd) {
		this.numOrden = pNumeroOrd;
	}
	/**
	 * @return Una cadena con la informaciÃ³n bÃ¡sica del medico
	 */
	@Override
	public String toString() 
	{
		return "MedicoOrden [ID de orden: "+ idOrden + " ID de médico " + idMedico + " ID de afiliado " + idUsuario
				+ " ID de servicio " + idServicio + " número de orden: " + numOrden +"]";
	}
	 
}
