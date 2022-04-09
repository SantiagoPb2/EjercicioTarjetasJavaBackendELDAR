package santiagofdez.app.ejercicio.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Marca {
	
	private String nombreMarca;
	private Date fActual = new Date();
	private final double PORCENTAJE_MINIMO = 0.3;
	private final double PORCENTAJE_MAXIMO = 5;

	public Marca(String nombre) {
		this.nombreMarca = nombre;
	}
	
	public abstract Double getTasa();
	
	public Date getFechaActual() {
		return fActual;
	}
	
	public Integer getYear() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		String fechaStr = dateFormat.format(fActual);
		String[] split = fechaStr.split("-",3);
		Integer year = Integer.parseInt(split[2]);
		
		return year;
	}
	
	public Integer getMonth() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		String fechaStr = dateFormat.format(fActual);
		String[] split = fechaStr.split("-",3);
		Integer month = Integer.parseInt(split[1]);
		
		return month;
	}
	
	public Integer getDay() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		String fechaStr = dateFormat.format(fActual);
		String[] split = fechaStr.split("-",3);
		Integer day = Integer.parseInt(split[0]);
		
		return day;
	}

	public double getPorcentajeMinimo() {
		return PORCENTAJE_MINIMO;
	}

	public double getPorcentajeMaximo() {
		return PORCENTAJE_MAXIMO;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreMarca == null) ? 0 : nombreMarca.hashCode());
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
		Marca other = (Marca) obj;
		if (nombreMarca == null) {
			if (other.nombreMarca != null)
				return false;
		} else if (!nombreMarca.equals(other.nombreMarca))
			return false;
		return true;
	}

}
