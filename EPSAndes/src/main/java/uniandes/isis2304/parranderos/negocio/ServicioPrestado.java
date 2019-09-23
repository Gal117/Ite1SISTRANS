package uniandes.isis2304.parranderos.negocio;

import uniandes.isis2304.parranderos.negocio.Persona.tipo;

public class ServicioPrestado {
	
	private tipo tipoDocumentoUsuario;
	
	private String numeroDocumentoUsuario;
	
	private long idReserva;
	
	private boolean cumplido;
	
	public ServicioPrestado() {
		this.tipoDocumentoUsuario = null;
		this.numeroDocumentoUsuario = "";
		this.idReserva = 0;
		this.cumplido = false;
	}
	public ServicioPrestado(tipo tipo,String num, long idR,boolean c)
	{
		this.tipoDocumentoUsuario = tipo;
		this.numeroDocumentoUsuario = num;
		this.idReserva = idR;
		this.cumplido = c;
	}
	public String getNumeroDocumentoUsuario() {
		return numeroDocumentoUsuario;
	}
	public void setNumeroDocumentoUsuario(String numeroDocumentoUsuario) {
		this.numeroDocumentoUsuario = numeroDocumentoUsuario;
	}
	public tipo getTipoDocumentoUsuario() {
		return tipoDocumentoUsuario;
	}
	public void setTipoDocumentoUsuario(tipo tipoDocumentoUsuario) {
		this.tipoDocumentoUsuario = tipoDocumentoUsuario;
	}
	public long getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}
	public boolean isCumplido() {
		return cumplido;
	}
	public void setCumplido(boolean cumplido) {
		this.cumplido = cumplido;
	}
	/**
	 * @return Una cadena con la información básica del medico
	 */
	@Override
	public String toString() 
	{
		return "ServicioPrestado [tipo de documento dle usuario=" + tipoDocumentoUsuario+ ", numero de documento del usuario=" + numeroDocumentoUsuario +
				", id de reserva =" + idReserva + ", se completo la cita =" + cumplido+"]";
	}
	
}
