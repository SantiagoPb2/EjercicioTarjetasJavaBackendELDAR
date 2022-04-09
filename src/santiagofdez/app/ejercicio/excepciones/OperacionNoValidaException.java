package santiagofdez.app.ejercicio.excepciones;

public class OperacionNoValidaException extends Exception{
	
	public OperacionNoValidaException() {
		super();
	}
	
	public OperacionNoValidaException(String msj) {
		super(msj);
	}

}
