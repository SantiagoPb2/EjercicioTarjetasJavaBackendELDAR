package santiagofdez.app.ejercicio.main;

import santiagofdez.app.ejercicio.excepciones.OperacionNoValidaException;
import santiagofdez.app.ejercicio.excepciones.TarjetaNoValidaException;
import santiagofdez.app.ejercicio.excepciones.TarjetaRepetidaException;
import santiagofdez.app.ejercicio.helper.FechaVencimiento;
import santiagofdez.app.ejercicio.helper.Teclado;
import santiagofdez.app.ejercicio.model.Amex;
import santiagofdez.app.ejercicio.model.Marca;
import santiagofdez.app.ejercicio.model.Nara;
import santiagofdez.app.ejercicio.model.Operacion;
import santiagofdez.app.ejercicio.model.TarjetaDeCredito;
import santiagofdez.app.ejercicio.model.Visa;
import santiagofdez.app.ejercicio.presentacion.InterfazMenu;

public class Main {
		
	public static void main(String[] args){
		final Integer OPCION_CERO = 0;
		final Integer OPCION_UNO = 1;
		final Integer OPCION_DOS = 2;
		final Integer OPCION_TRES = 3;
		
		Marca visa = new Visa();
		Marca amex = new Amex();
		Marca nara = new Nara();
		
		TarjetaDeCredito primerTarjeta = new TarjetaDeCredito(visa, 2586246655531999l, 
				"Santiago Fernandez", FechaVencimiento.crearFechaVencimiento("15/06/2022"));
		TarjetaDeCredito segundaTarjeta = new TarjetaDeCredito(nara, 5023233344441239l,
				"Martin Aznar", FechaVencimiento.crearFechaVencimiento("28/08/2022"));
		TarjetaDeCredito tercerTarjeta = new TarjetaDeCredito(amex, 5023233344441239l,
				"Carlos Lopes", FechaVencimiento.crearFechaVencimiento("08/04/2022"));
		
		Operacion primeraCompra = new Operacion(primerTarjeta, 900.0);
		Operacion segundaCompra = new Operacion(segundaTarjeta, 1100.0);
		Operacion tercerCompra = new Operacion(tercerTarjeta, 800.0);
		
		InterfazMenu interfaz = new InterfazMenu();
		Teclado teclado = new Teclado();
		
		interfaz.menuPrincipal();

		Integer opcion = teclado.ingresarInt();
		while(opcion != OPCION_CERO) {
			switch(opcion) {
			case 1:
				interfaz.menuOpcionUno();
				Integer numero = teclado.ingresarInt();
				if(numero.equals(OPCION_UNO)) {
					System.out.println(primerTarjeta + "\n");
				}
				if(numero.equals(OPCION_DOS)) {
					System.out.println(segundaTarjeta + "\n");
				}
				if(numero.equals(OPCION_TRES)) {
					System.out.println(tercerTarjeta + "\n");
				}
				if(numero.equals(OPCION_CERO)) {
					System.out.println("Volviendo al menu principal \n");
				}
				break;
			
			case 2:
				interfaz.menuOpcionDos();
				Integer numeroDos = teclado.ingresarInt();
				if(numeroDos.equals(OPCION_UNO)){
						try {
							if(primeraCompra.comprobarValidezOperacion() == Boolean.TRUE) {
								System.out.println("La operacion es valida \n");
							}
						} catch (OperacionNoValidaException e) {
							System.out.println("La operacion es invalida \n");
							
						}
					
				}
				if(numeroDos.equals(OPCION_DOS)){
					try {
						if(segundaCompra.comprobarValidezOperacion() == Boolean.TRUE) {
							System.out.println("La operacion es valida \n");
						}
					} catch (OperacionNoValidaException e) {
						System.out.println("La operacion es invalida \n");
					}
				}
				if(numeroDos.equals(OPCION_TRES)){
					try {
						if(tercerCompra.comprobarValidezOperacion() == Boolean.TRUE) {
							System.out.println("La operacion es valida \n");
						}
					} catch (OperacionNoValidaException e) {
						System.out.println("La operacion es invalida \n");
					}
				}
				if(numeroDos.equals(OPCION_CERO)){
					System.out.println("Volviendo al menu principal \n");
				}		
				break;
			case 3:
				interfaz.menuOpcionTres();
				Integer numeroTres = teclado.ingresarInt();
				if(numeroTres.equals(OPCION_UNO)){
					try {
						if(primeraCompra.comprobarValidezTarjeta() == Boolean.TRUE) {
							System.out.println("La tarjeta es valida \n");
						}
					} catch (TarjetaNoValidaException e) {
						System.out.println("La tarjeta es invalida \n");
					}
				}
				if(numeroTres.equals(OPCION_DOS)){
					try {
						if(segundaCompra.comprobarValidezTarjeta() == Boolean.TRUE) {
							System.out.println("La tarjeta es valida \n");
						}
					} catch (TarjetaNoValidaException e) {
						System.out.println("La tarjeta es invalida \n");
					}
				}
				if(numeroTres.equals(OPCION_TRES)){
					try {
						if(tercerCompra.comprobarValidezTarjeta() == Boolean.TRUE) {
							System.out.println("La tarjeta es valida \n");
						}
					} catch (TarjetaNoValidaException e) {
						System.out.println("La tarjeta es invalida \n");
					}
				}
				if(numeroTres.equals(OPCION_CERO)){
					System.out.println("Volviendo al menu principal \n");
				}					
				break;
			case 4:
				interfaz.menuOpcionCuatro();
				Integer numeroCuatro = teclado.ingresarInt();
				if(numeroCuatro.equals(OPCION_UNO)){
					try {
						if(primeraCompra.compararTarjetas(segundaTarjeta) == Boolean.FALSE) {
							System.out.println("Las tarjetas son distintas \n");
						}
					} catch (TarjetaRepetidaException e) {
						System.out.println("Las tarjetas son iguales \n");
					}
				}
				if(numeroCuatro.equals(OPCION_DOS)){
					try {
						if(tercerCompra.compararTarjetas(primerTarjeta) == Boolean.FALSE) {
							System.out.println("Las tarjetas son distintas \n");
						}
					} catch (TarjetaRepetidaException e) {
						System.out.println("Las tarjetas son iguales \n");
					}
				}
				if(numeroCuatro.equals(OPCION_TRES)){
					try {
						if(segundaCompra.compararTarjetas(tercerTarjeta) == Boolean.FALSE) {
							System.out.println("Las tarjetas son distintas \n");
						}
					} catch (TarjetaRepetidaException e) {
						System.out.println("Las tarjetas son iguales \n");
					}
				}
				if(numeroCuatro.equals(OPCION_CERO)){
					System.out.println("Volviendo al menu principal \n");
				}					
				break;
			case 5:
				interfaz.menuOpcionCinco();
				Integer numeroCinco = teclado.ingresarInt();
				if(numeroCinco.equals(OPCION_UNO)){
					System.out.println(primerTarjeta.getMarca().getTasa());
				}
				if(numeroCinco.equals(OPCION_DOS)){
					System.out.println(segundaTarjeta.getMarca().getTasa());
				}
				if(numeroCinco.equals(OPCION_TRES)){
					System.out.println(tercerTarjeta.getMarca().getTasa());
				}
				if(numeroCinco.equals(OPCION_CERO)){
					System.out.println("Volviendo al menu principal \n");
				}					
				break;
				
			case 6:
				interfaz.menuOpcionSeis();
				Integer numeroSeis = teclado.ingresarInt();
				if(numeroSeis.equals(OPCION_UNO)){
						try {
							primeraCompra.realizarOperacion();
						} catch (OperacionNoValidaException | TarjetaNoValidaException e) {
							System.out.println("Operacion no valida, "
									+ "puede que el monto maximo se haya superado o que la tarjeta sea invalida \n");
						}							
				}
				if(numeroSeis.equals(OPCION_DOS)){
					try {
						segundaCompra.realizarOperacion();
					} catch (OperacionNoValidaException | TarjetaNoValidaException e) {
						System.out.println("Operacion no valida, "
								+ "puede que el monto maximo se haya superado o que la tarjeta sea invalida \n");
					}
				}
				if(numeroSeis.equals(OPCION_TRES)){
					try {
						tercerCompra.realizarOperacion();
					} catch (OperacionNoValidaException | TarjetaNoValidaException e) {
						System.out.println("Operacion no valida, "
								+ "puede que el monto maximo se haya superado o que la tarjeta sea invalida \n");
					}
				}
				if(numeroSeis.equals(OPCION_CERO)){
					System.out.println("Volviendo al menu principal \n");
				}					
				break;			
			default:
				System.out.println("Seleccione una opcion dentro del menu");
				System.out.println();
			}
			interfaz.menuPrincipal();
			opcion = teclado.ingresarInt();	
		}
	}	
}
