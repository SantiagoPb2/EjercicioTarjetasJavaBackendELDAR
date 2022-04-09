package santiagofdez.app.ejercicio.interfaz;

import santiagofdez.app.ejercicio.model.TarjetaDeCredito;

public interface IOperacionTarjetas {
	
	//Informar si una operaci�n es valida
	public Boolean comprobarValidezOperacion();
	
	//Informar si una tarjeta es v�lida para operar
	public Boolean comprobarValidezTarjeta();
	
	//Identificar si una tarjeta es distinta a otra
	public Boolean compararTarjetas(TarjetaDeCredito tarjeta);
	
	//Obtener por medio de un m�todo la tasa de una operaci�n informando marca e importe
	public Double obtenerTasa(TarjetaDeCredito tarjeta, Double importe);
	

}
