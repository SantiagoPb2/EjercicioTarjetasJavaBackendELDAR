package santiagofdez.app.ejercicio.helper;

import java.util.Scanner;

public class Teclado {
	
	public int ingresarInt() {       
	        int numero=0;
	        Scanner scanner= new Scanner(System.in);
	        
	        do{
	            
	            while(!scanner.hasNextInt()){
	            
	                String input = scanner.next();
	                System.out.println("¡Esto no es un numero VALIDO! Ingrese nuevamente");
	               
	            }
	            
	            numero=scanner.nextInt();   
	            
	        }while(numero < 0);
	        
	        return numero;
	}
	
}
