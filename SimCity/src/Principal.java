

public class Principal {

	public static void main(String[] args) {
		
		Entrada entrada = new Entrada();
		Tienda tienda = new Tienda();
		
		System.out.println("Ingrese el nombre del alcalde: ");
		String nombre = entrada.ingresarTexto();
		Jugador jugador = new Jugador(nombre);
		
		jugador.mostrarDatos();

		System.out.println("Ingrese el nombre de su ciudad: ");
		String nombreCiudad = entrada.ingresarTexto();
		Ciudad ciudad1 = new Ciudad(nombreCiudad);
		
		tienda.mostrarCatalogo();
		
		System.out.println("Elegi algun edificio poniendo su numero: ");
		int numero  = entrada.ingresarEntero(0, 30);
		
		Edificio elegido = tienda.obtenerEdificio(numero);
		
		elegido.mostrarDatos();
		int precio = elegido.getPrecio();
		boolean resultado = jugador.restarDinero(precio);
		if(resultado == true) {
			ciudad1.agregarEdificio(elegido);

			ciudad1.mostrarEdificiosComprados();
		}
		
		

		
	}

}
