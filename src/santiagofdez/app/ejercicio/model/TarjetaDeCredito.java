package santiagofdez.app.ejercicio.model;

import java.util.Date;

public class TarjetaDeCredito {
	
	private Marca marca;
	private Long nroTarjeta;
	private String cardholder;
	private Date fVencimiento;
	
	public TarjetaDeCredito(Marca marca, Long nroTarjeta, String cardholder, Date fVencimiento) {
		this.marca = marca;
		this.nroTarjeta = nroTarjeta;
		this.cardholder = cardholder;
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
	
	public String getCardholder() {
		return cardholder;
	}

	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}

	public Date getfVencimiento() {
		return fVencimiento;
	}

	public void setfVencimiento(Date fVencimiento) {
		this.fVencimiento = fVencimiento;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + "\nNumero de Tarjeta: " + nroTarjeta + "\nCardHolder: " + cardholder
				+ "\nFecha Vencimiento: " + fVencimiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardholder == null) ? 0 : cardholder.hashCode());
		result = prime * result + ((fVencimiento == null) ? 0 : fVencimiento.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
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
		if (cardholder == null) {
			if (other.cardholder != null)
				return false;
		} else if (!cardholder.equals(other.cardholder))
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
		if (nroTarjeta == null) {
			if (other.nroTarjeta != null)
				return false;
		} else if (!nroTarjeta.equals(other.nroTarjeta))
			return false;
		return true;
	}
	
	


	
	


}

	
	


