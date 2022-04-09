package santiagofdez.app.ejercicio.presentacion;

public class InterfazMenu {
	
	public void menuPrincipal() {
		System.out.println("¿Que desea hacer?");
		System.out.println("1 - Obtener informacion de tarjeta ");
		System.out.println("2 - Ver si la operacion es valida ");
		System.out.println("3 - Ver si la tarjeta es valida ");
		System.out.println("4 - Comparar si dos tarjetas son iguales");
		System.out.println("5 - Obtener la tasa de servicio");
		System.out.println("6 - Realizar una operacion");
		System.out.println("0 - Salir");
	}
	
	public void menuOpcionUno() {
		System.out.println("¿De que tarjeta desea obtener informacion?");
		System.out.println("1 - Visa");
		System.out.println("2 - Naranja");
		System.out.println("3 - American Express");
		System.out.println("0 - Salir");
	}
	
	public void menuOpcionDos() {
		System.out.println("¿De que tarjeta desea ver la operacion?");
		System.out.println("1 - Visa");
		System.out.println("2 - Naranja");
		System.out.println("3 - American Express");
		System.out.println("0 - Salir");
	}
	
	public void menuOpcionTres() {
		System.out.println("¿Que tarjeta desea validar?");
		System.out.println("1 - Visa");
		System.out.println("2 - Naranja");
		System.out.println("3 - American Express");
		System.out.println("0 - Salir");
	}
	
	public void menuOpcionCuatro() {
		System.out.println("¿Que tarjetas desea comparar?");
		System.out.println("1 - Visa -- Naranja");
		System.out.println("2 - AmericanExpress -- Visa");
		System.out.println("3 - Naranja -- AmericanExpress");
		System.out.println("0 - Salir");
	}
	
	public void menuOpcionCinco() {
		System.out.println("¿De que tarjeta desea obtener la tasa por servicio?");
		System.out.println("1 - Visa");
		System.out.println("2 - Naranja");
		System.out.println("3 - American Express");
		System.out.println("0 - Salir");
	}
	
	public void menuOpcionSeis() {
		System.out.println("¿Con que tarjeta desea realizar la compra?");
		System.out.println("1 - Visa");
		System.out.println("2 - Naranja");
		System.out.println("3 - American Express");
		System.out.println("0 - Salir");
	}


}
