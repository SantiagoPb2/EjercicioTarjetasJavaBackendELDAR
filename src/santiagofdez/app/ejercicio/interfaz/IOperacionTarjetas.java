package santiagofdez.app.ejercicio.interfaz;

import santiagofdez.app.ejercicio.excepciones.OperacionNoValidaException;
import santiagofdez.app.ejercicio.excepciones.TarjetaNoValidaException;
import santiagofdez.app.ejercicio.excepciones.TarjetaRepetidaException;
import santiagofdez.app.ejercicio.model.TarjetaDeCredito;

public interface IOperacionTarjetas {
	
	//Informar si una operación es valida
	public Boolean comprobarValidezOperacion() throws OperacionNoValidaException;
	
	//Informar si una tarjeta es válida para operar
	public Boolean comprobarValidezTarjeta()  throws TarjetaNoValidaException;
	
	//Identificar si una tarjeta es distinta a otra
	public Boolean compararTarjetas(TarjetaDeCredito tarjeta) throws TarjetaRepetidaException;
	
	//Obtener por medio de un método la tasa de una operación informando marca e importe
	public Double obtenerTasa(TarjetaDeCredito tarjeta, Double importe);
	
	public void realizarOperacion() throws OperacionNoValidaException, TarjetaNoValidaException;
	

}
