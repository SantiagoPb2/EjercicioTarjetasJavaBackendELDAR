package santiagofdez.app.ejercicio.model;

import java.util.Date;

import santiagofdez.app.ejercicio.interfaz.IOperacionTarjetas;

public class Operacion implements IOperacionTarjetas {
	
	private Double importe;
	private TarjetaDeCredito tarjeta;
	private final Double PRECIO_MAXIMO = 1000.0;
	private final Integer PORCENTAJE = 100;
	private Date fActual = new Date();
	
	public Operacion(TarjetaDeCredito tarjeta, Double importe) {
		this.tarjeta = tarjeta;
		this.importe = importe;
	}
	
	public Boolean comprobarValidezOperacion(){
		Boolean esValida = false;
		if(this.importe < PRECIO_MAXIMO) {
			esValida = true;
		}
		return esValida;
	}
	
	public Boolean comprobarValidezTarjeta() {	
		Boolean esValido = false;
		
		if(tarjeta.getfVencimiento().compareTo(fActual) >= 0) {
	           esValido = true;
	    }	
		return esValido;
	}

	@Override
	public Double obtenerTasa(TarjetaDeCredito tarjeta, Double importe) {
		Double tasa = 0.0;
		tasa = (importe * tarjeta.getMarca().getTasa()) / PORCENTAJE;
		return tasa;
	}
	
	public void realizarOperacion(TarjetaDeCredito tarjeta) {
		if(comprobarValidezOperacion().equals(Boolean.TRUE) && comprobarValidezTarjeta().equals(Boolean.TRUE)){
				Double tasa = obtenerTasa(tarjeta, this.importe);
				System.out.println("Importe operacion: " + this.importe
						+ "\nTasa de servicio: " + tasa + "\nTotal: " +
						(this.importe + tasa));				
		}else {
			
		}
	}

	public Double getImporte() {
		return importe;
	}

	@Override
	public String compararTarjetas(TarjetaDeCredito tarjeta1, TarjetaDeCredito tarjeta2) {
		if(tarjeta1.equals(tarjeta2)) {
			return "Las tarjetas son iguales";
		}
		return "Las tarjetas son distintas";
	}
	
}
