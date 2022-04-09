package santiagofdez.app.ejercicio.helper;

import java.util.Scanner;

public class Teclado {
	
	public String ingresarTexto() {
		Scanner teclado2 = new Scanner(System.in);
		return teclado2.nextLine();
	}
	
	public int ingresarInt() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
	
	public double ingresarDouble() {
		Scanner teclado1 = new Scanner(System.in);
		return teclado1.nextDouble();
	}

}
