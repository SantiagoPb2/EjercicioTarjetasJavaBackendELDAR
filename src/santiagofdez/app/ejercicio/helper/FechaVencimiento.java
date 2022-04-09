package santiagofdez.app.ejercicio.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaVencimiento {

	public static Date crearFechaVencimiento(String fecha) {
		Date fechaVencimiento = null;
		try{
			fechaVencimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		return fechaVencimiento;
	}
	
}
