package santiagofdez.app.ejercicio.model;

import java.util.Date;

public class TarjetaDeCredito {
	
	private Marca marca;
	private Long nroTarjeta;
	private String nombreTitular;
	private String apellidoTitular;
	private Date fVencimiento;
	
	public TarjetaDeCredito(Marca marca, Long nroTarjeta, String nombreTitular, String apellidoTitular, Date fVencimiento) {
		this.marca = marca;
		this.nroTarjeta = nroTarjeta;
		this.nombreTitular = nombreTitular;
		this.apellidoTitular = apellidoTitular;
		this.fVencimiento = fVencimiento;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Long getNroTarjeta() {
		return nroTarjeta;
	}

	public void setNroTarjeta(Long nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getApellidoTitular() {
		return apellidoTitular;
	}

	public void setApellidoTitular(String apellidoTitular) {
		this.apellidoTitular = apellidoTitular;
	}

	public Date getfVencimiento() {
		return fVencimiento;
	}

	public void setfVencimiento(Date fVencimiento) {
		this.fVencimiento = fVencimiento;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + "\nNumero de Tarjeta: " + nroTarjeta + "\nNombre del titular: " + nombreTitular
				+ "\nApellido del titular: " + apellidoTitular + "\nFecha Vencimiento: " + fVencimiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoTitular == null) ? 0 : apellidoTitular.hashCode());
		result = prime * result + ((fVencimiento == null) ? 0 : fVencimiento.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((nombreTitular == null) ? 0 : nombreTitular.hashCode());
		result = prime * result + ((nroTarjeta == null) ? 0 : nroTarjeta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarjetaDeCredito other = (TarjetaDeCredito) obj;
		if (apellidoTitular == null) {
			if (other.apellidoTitular != null)
				return false;
		} else if (!apellidoTitular.equals(other.apellidoTitular))
			return false;
		if (fVencimiento == null) {
			if (other.fVencimiento != null)
				return false;
		} else if (!fVencimiento.equals(other.fVencimiento))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (nombreTitular == null) {
			if (other.nombreTitular != null)
				return false;
		} else if (!nombreTitular.equals(other.nombreTitular))
			return false;
		if (nroTarjeta == null) {
			if (other.nroTarjeta != null)
				return false;
		} else if (!nroTarjeta.equals(other.nroTarjeta))
			return false;
		return true;
	}

	
	

}
