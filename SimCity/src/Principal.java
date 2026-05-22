

public class Principal {

	public static void main(String[] args) {
		
		Entrada entrada = new Entrada();
		Tienda tienda = new Tienda();
		
		System.out.println("Ingrese el nombre del alcalde: ");
		String nombre = entrada.ingresarTexto();
		Jugador jugador = new Jugador(nombre);
			
		
		System.out.println("Ingrese el nombre de su ciudad: ");
		String nombreCiudad = entrada.ingresarTexto();
		Ciudad ciudad1 = new Ciudad(nombreCiudad);
		
		
		tienda.mostrarCatalogo();
//		Edificio edificio1 = new Edificio("Maravilla", "Agustror", 5, 4 , 5, 100000 );
//		
//		jugador.mostrarDatos();
//		
//		ciudad1.agregarEdificio(edificio1);
//		
//		ciudad1.mostrarDatosCiudad();
//		 
//		ciudad1.mostrarEdificiosComprados();
//		
//		
		
	}

}
