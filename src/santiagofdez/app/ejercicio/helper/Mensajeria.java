package santiagofdez.app.ejercicio.helper;

public class Mensajeria {
	
	public static final String msjVolverMenuPrincipal = "Volviendo al menu principal.\n"; 
	
	public static final String msjOperacionValida = "OPERACION VALIDA.\n"
			+ "El monto es menor a $1000.\n";
	
	public static final String msjOperacionInvalida = "OPERACION INVALIDA.\n"
			+ "El monto supera el limite de $1000.\n";
	
	public static final String msjTarjetaValida = "TARJETA VALIDA.\n"
			+ "Su fecha de vencimiento sigue vigente.\n";
	
	public static final String msjTarjetaInvalida = "TARJETA INVALIDA.\n"
			+ "La tarjeta esta vencida.\n";
	
	public static final String msjTarjetaIguales = "Las tarjetas son iguales.\n";
	
	public static final String msjTarjetaDistintas = "Las tarjetas son distintas.\n";
	
	public static final String msjTasaServicio = "La tasa de servicio de la tarjeta ";
	
	public static final String msjFallaRealizacionOperacion = "OPERACION INVALIDA.\n"
			+ "Puede que el monto maximo se haya superado o que la tarjeta sea invalida.\n";

}
