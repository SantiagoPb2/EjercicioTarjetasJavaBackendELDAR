package santiagofdez.app.ejercicio.excepciones;

public class TarjetaNoValidaException extends Exception{
	
	public TarjetaNoValidaException() {
		
	}
	
	public TarjetaNoValidaException(String msj) {
		super(msj);
	}

}
