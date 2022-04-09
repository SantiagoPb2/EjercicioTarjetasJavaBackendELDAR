package santiagofdez.app.ejercicio.controlador;

import santiagofdez.app.ejercicio.excepciones.OperacionNoValidaException;
import santiagofdez.app.ejercicio.excepciones.TarjetaNoValidaException;
import santiagofdez.app.ejercicio.excepciones.TarjetaRepetidaException;
import santiagofdez.app.ejercicio.helper.FechaVencimiento;
import santiagofdez.app.ejercicio.model.Amex;
import santiagofdez.app.ejercicio.model.Marca;
import santiagofdez.app.ejercicio.model.Nara;
import santiagofdez.app.ejercicio.model.Operacion;
import santiagofdez.app.ejercicio.model.TarjetaDeCredito;
import santiagofdez.app.ejercicio.model.Visa;

public class ControladorPresentacion {
	
	private Marca visa = new Visa();
	private Marca amex = new Amex();
	private Marca nara = new Nara();
	
	private TarjetaDeCredito primerTarjeta = new TarjetaDeCredito(visa, 2586246655531999l, 
			"Santiago Fernandez", FechaVencimiento.crearFechaVencimiento("15/06/2022"));
	private TarjetaDeCredito segundaTarjeta = new TarjetaDeCredito(nara, 5023233344441239l,
			"Martin Aznar", FechaVencimiento.crearFechaVencimiento("28/08/2022"));
	private TarjetaDeCredito tercerTarjeta = new TarjetaDeCredito(amex, 5023233344441239l,
			"Carlos Lopes", FechaVencimiento.crearFechaVencimiento("08/04/2022"));
	
	private Operacion primeraCompra = new Operacion(primerTarjeta, 900.0);
	private Operacion segundaCompra = new Operacion(segundaTarjeta, 1100.0);
	private Operacion tercerCompra = new Operacion(tercerTarjeta, 800.0);
	
	public void controladorInfoTarjeta(Integer numero) {
		if(numero.equals(1)) {
			System.out.println(primerTarjeta + "\n");
		}
		if(numero.equals(2)) {
			System.out.println(segundaTarjeta + "\n");
		}
		if(numero.equals(3)) {
			System.out.println(tercerTarjeta + "\n");
		}
		if(numero.equals(4)) {
			System.out.println("Volviendo al menu principal \n");
		}
	}

	public void controladorValidezOperacion(Integer numero) {
		if(numero.equals(1)){
			try {
				if(primeraCompra.comprobarValidezOperacion() == Boolean.TRUE) {
					System.out.println("OPERACION VALIDA.\n"
							+ "El monto es menor a $1000.\n");
				}
			} catch (OperacionNoValidaException e) {
				System.out.println("OPERACION INVALIDA.\n"
						+ "El monto supera el limite de $1000.\n");
			}
		}
		if(numero.equals(2)){
			try {
				if(segundaCompra.comprobarValidezOperacion() == Boolean.TRUE) {
					System.out.println("OPERACION VALIDA.\n"
							+ "El monto es menor a $1000.\n");
				}
			} catch (OperacionNoValidaException e) {
				System.out.println("OPERACION INVALIDA.\n"
						+ "El monto supera el limite de $1000.\n");
			}
		}
		if(numero.equals(3)){
			try {
				if(tercerCompra.comprobarValidezOperacion() == Boolean.TRUE) {
					System.out.println("OPERACION VALIDA.\n"
							+ "El monto es menor a $1000.\n");
				}
			} catch (OperacionNoValidaException e) {
				System.out.println("OPERACION INVALIDA.\n "
						+ "El monto supera el limite de $1000.\n");
			}
		}
		if(numero.equals(0)){
			System.out.println("Volviendo al menu principal.\n");
		}		
		
	}

	public void controladorValidezTarjeta(Integer numero) {
		if(numero.equals(1)){
			try {
				if(primeraCompra.comprobarValidezTarjeta() == Boolean.TRUE) {
					System.out.println("TARJETA VALIDA.\n"
							+ "Su fecha de vencimiento sigue vigente.\n");
				}
			} catch (TarjetaNoValidaException e) {
				System.out.println("TARJETA INVALIDA.\n"
						+ "La tarjeta esta vencida.\n");
			}
		}
		if(numero.equals(2)){
			try {
				if(segundaCompra.comprobarValidezTarjeta() == Boolean.TRUE) {
					System.out.println("TARJETA VALIDA.\n"
							+ "Su fecha de vencimiento sigue vigente.\n");
				}
			} catch (TarjetaNoValidaException e) {
				System.out.println("TARJETA INVALIDA.\n"
						+ "La tarjeta esta vencida.\n");
			}
		}
		if(numero.equals(3)){
			try {
				if(tercerCompra.comprobarValidezTarjeta() == Boolean.TRUE) {
					System.out.println("TARJETA VALIDA.\n"
							+ "Su fecha de vencimiento sigue vigente.\n");
				}
			} catch (TarjetaNoValidaException e) {
				System.out.println("TARJETA INVALIDA.\n"
						+ "La tarjeta esta vencida.\n");
			}
		}
		if(numero.equals(0)){
			System.out.println("Volviendo al menu principal.\n");
		}				
		
	}

	public void controladorComparativaTarjeta(Integer numero) {
		if(numero.equals(1)){
			try {
				if(primeraCompra.compararTarjetas(segundaTarjeta) == Boolean.FALSE) {
					System.out.println("Las tarjetas son distintas.\n");
				}
			} catch (TarjetaRepetidaException e) {
				System.out.println("Las tarjetas son iguales.\n");
			}
		}
		if(numero.equals(2)){
			try {
				if(tercerCompra.compararTarjetas(primerTarjeta) == Boolean.FALSE) {
					System.out.println("Las tarjetas son distintas.\n");
				}
			} catch (TarjetaRepetidaException e) {
				System.out.println("Las tarjetas son iguales.\n");
			}
		}
		if(numero.equals(3)){
			try {
				if(segundaCompra.compararTarjetas(tercerTarjeta) == Boolean.FALSE) {
					System.out.println("Las tarjetas son distintas.\n");
				}
			} catch (TarjetaRepetidaException e) {
				System.out.println("Las tarjetas son iguales.\n");
			}
		}
		if(numero.equals(0)){
			System.out.println("Volviendo al menu principal.\n");
		}				
		
	}

	public void controladorTasaServicio(Integer numero) {
		if(numero.equals(1)){
			System.out.println("La tasa de servicio de la tarjeta "+ primerTarjeta.getMarca().getNombreMarca() + 
					" es del " + primerTarjeta.getMarca().getTasa() + "%.\n");
		}
		if(numero.equals(2)){
			System.out.println("La tasa de servicio de la tarjeta "+ segundaTarjeta.getMarca().getNombreMarca() + 
					" es del " + segundaTarjeta.getMarca().getTasa() + "%.\n");
		}
		if(numero.equals(3)){
			System.out.println("La tasa de servicio de la tarjeta "+ tercerTarjeta.getMarca().getNombreMarca() + 
					" es del " + tercerTarjeta.getMarca().getTasa() + "%.\n");
		}
		if(numero.equals(0)){
			System.out.println("Volviendo al menu principal.\n");
		}					
		
	}

	public void controladorRealizacionOperacion(Integer numero) {
		if(numero.equals(1)){
			try {
				primeraCompra.realizarOperacion();
			} catch (OperacionNoValidaException | TarjetaNoValidaException e) {
				System.out.println("OPERACION INVALIDA.\n"
						+ "Puede que el monto maximo se haya superado o que la tarjeta sea invalida.\n");
			}							
		}
		if(numero.equals(2)){
			try {
			segundaCompra.realizarOperacion();
			} catch (OperacionNoValidaException | TarjetaNoValidaException e) {
			System.out.println("OPERACION INVALIDA.\n"
					+ "Puede que el monto maximo se haya superado o que la tarjeta sea invalida.\n");
			}
		}
		if(numero.equals(3)){
			try {
			tercerCompra.realizarOperacion();
			} catch (OperacionNoValidaException | TarjetaNoValidaException e) {
			System.out.println("OPERACION INVALIDA.\n"
					+ "Puede que el monto maximo se haya superado o que la tarjeta sea invalida.\n");
			}
		}
		if(numero.equals(0)){
			System.out.println("Volviendo al menu principal.\n");		
		}
	}

}
 