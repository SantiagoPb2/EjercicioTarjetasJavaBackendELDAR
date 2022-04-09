package santiagofdez.app.ejercicio.model;

import java.util.Date;

import santiagofdez.app.ejercicio.excepciones.OperacionNoValidaException;
import santiagofdez.app.ejercicio.excepciones.TarjetaNoValidaException;
import santiagofdez.app.ejercicio.excepciones.TarjetaRepetidaException;
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
	
	@Override
	public Boolean comprobarValidezOperacion() throws OperacionNoValidaException{
		Boolean esValida = false;
		if(this.importe < PRECIO_MAXIMO) {
			esValida = true;
			return esValida;
		}else {
			throw new OperacionNoValidaException();
		}
	}
	
	@Override
	public Boolean comprobarValidezTarjeta() throws TarjetaNoValidaException{	
		Boolean esValido = false;
		
		if(tarjeta.getfVencimiento().compareTo(fActual) >= 0) {
	           esValido = true;
	           return esValido;
	    }else {
	    	throw new TarjetaNoValidaException();
	    }
		
	}

	@Override
	public Double obtenerTasa(TarjetaDeCredito tarjeta, Double importe) {
		Double tasa = 0.0;
		tasa = (importe * tarjeta.getMarca().getTasa()) / PORCENTAJE;
		return tasa;
	}
	
	@Override
	public void realizarOperacion() throws OperacionNoValidaException, TarjetaNoValidaException {
		if(comprobarValidezOperacion().equals(Boolean.TRUE) && comprobarValidezTarjeta().equals(Boolean.TRUE)){
				Double tasa = obtenerTasa(tarjeta, importe);
				System.out.println("Importe operacion: " + importe
						+ "\nTasa de servicio: " + tasa + "\nTotal: " +
						(importe + tasa) + ".\n");				
		}
	}

	public Double getImporte() {
		return importe;
	}

	@Override
	public Boolean compararTarjetas(TarjetaDeCredito tarjeta) throws TarjetaRepetidaException{
		Boolean sonIguales = Boolean.FALSE;
		if(this.tarjeta.equals(tarjeta)) {
			throw new TarjetaRepetidaException();			
		}else {
			return sonIguales;
			
		}
		
	}
	
}
