
import java.util.InputMismatchException;

import java.util.Scanner;



public class Entrada {

	private static Scanner s ;

	

	public Entrada() {

		this.s = new Scanner(System.in);

	}

	

	public int ingresarEntero(int min, int max) {
		boolean error = false;
		int numero = 0;
		String texto = "";
		do {
			
			error = false;
			texto = s.nextLine();
			
			if(texto.equalsIgnoreCase("TORG")){
				
				return -1;
				
			}
			try {
				
				numero = Integer.parseInt(texto);
				if(numero > max || numero < min) {
					System.out.println("El numero ingresado debe estar entre " + min +" y " + max);
					error = true;
				}
			}catch(InputMismatchException e ) {

				
				System.out.println("Ingrese valores numericos");
				error = true;
			}finally {
				s.nextLine();
				if(error) {
					System.out.println("ingrese nuevamente:");
				}		
			}	
		}while(error);
		
		return numero ;
	}



	public String ingresarTexto() {

		boolean error = false;

		String texto = "";

		

		do {
			error = false;
			texto = s.nextLine();
			if(texto.trim().isEmpty()) {
				error = true;
				System.out.println("ERROR. El texto no puede estar vacio");
				System.out.println("Ingrese nuevamente:");
			}
		}while(error);
		return texto;

	}

}