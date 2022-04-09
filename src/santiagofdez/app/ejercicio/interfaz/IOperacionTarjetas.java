package santiagofdez.app.ejercicio.interfaz;

import santiagofdez.app.ejercicio.model.TarjetaDeCredito;

public interface IOperacionTarjetas {
	
	//Informar si una operación es valida
	public Boolean comprobarValidezOperacion();
	
	//Informar si una tarjeta es válida para operar
	public Boolean comprobarValidezTarjeta();
	
	//Identificar si una tarjeta es distinta a otra
	public String compararTarjetas(TarjetaDeCredito tarjeta1, TarjetaDeCredito tarjeta2);
	
	//Obtener por medio de un método la tasa de una operación informando marca e importe
	public Double obtenerTasa(TarjetaDeCredito tarjeta, Double importe);
	

}
