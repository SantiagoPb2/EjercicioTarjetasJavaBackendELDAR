package santiagofdez.app.ejercicio.helper;

import java.util.Scanner;

public class Teclado {

	public int ingresarInt() {
		Scanner scanner = new Scanner(System.in);
		String response = scanner.nextLine();
		if (response.matches("[0-9]^*")) {
			return Integer.parseInt(response);
		} else {
			System.out.println("Se ingres� una opci�n incorrecta. Por favor ingreselo nuevamente");
			return ingresarInt();
		}
	}

}
