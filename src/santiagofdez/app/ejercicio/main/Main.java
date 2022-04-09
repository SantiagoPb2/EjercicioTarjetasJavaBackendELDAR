package santiagofdez.app.ejercicio.main;

import santiagofdez.app.ejercicio.controlador.ControladorPresentacion;
import santiagofdez.app.ejercicio.helper.Teclado;
import santiagofdez.app.ejercicio.presentacion.InterfazMenu;

public class Main {
		
	public static void main(String[] args) {
		
		ControladorPresentacion controladorMenu = new ControladorPresentacion();
		InterfazMenu interfazMenuPrincipal = new InterfazMenu();
		Teclado teclado = new Teclado();
		
		interfazMenuPrincipal.menuPrincipal();

		Integer opcion = teclado.ingresarInt();
		while(opcion != 0) {
			switch(opcion) {
			case 1:
				interfazMenuPrincipal.menuOpcionUno();
				Integer numero = teclado.ingresarInt();
				controladorMenu.controladorInfoTarjeta(numero);	
				break;
			
			case 2:
				interfazMenuPrincipal.menuOpcionDos();
				Integer numeroDos = teclado.ingresarInt();
				controladorMenu.controladorValidezOperacion(numeroDos);	
				break;
			case 3:
				interfazMenuPrincipal.menuOpcionTres();
				Integer numeroTres = teclado.ingresarInt();
				controladorMenu.controladorValidezTarjeta(numeroTres);	
				break;
			case 4:
				interfazMenuPrincipal.menuOpcionCuatro();
				Integer numeroCuatro = teclado.ingresarInt();
				controladorMenu.controladorComparativaTarjeta(numeroCuatro);		
				break;
			case 5:
				interfazMenuPrincipal.menuOpcionCinco();
				Integer numeroCinco = teclado.ingresarInt();
				controladorMenu.controladorTasaServicio(numeroCinco);			
				break;
				
			case 6:
				interfazMenuPrincipal.menuOpcionSeis();
				Integer numeroSeis = teclado.ingresarInt();
				controladorMenu.controladorRealizacionOperacion(numeroSeis);				
				break;			
			default:
				System.out.println("Seleccione una opcion dentro del menu\n");
				System.out.println();
			}
			interfazMenuPrincipal.menuPrincipal();
			opcion = teclado.ingresarInt();	
		}
	}	
}
