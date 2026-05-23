

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
		
		
		
		
		boolean edificioValido= false;
		int numero;
		do {
			System.out.println("Elegi algun edificio poniendo su numero: ");
			 numero  = entrada.ingresarEntero(1, 30);
		
			if(numero == -1){
				jugador.sumarDinero(1000000);
				jugador.mostrarDatos();
				
			}else {
				edificioValido= true;
			}
			
		}while(!edificioValido);
		
		Edificio elegido = tienda.obtenerEdificio(numero);
		Edificio copia = new Edificio(elegido);
		copia.mostrarDatos();
		
		boolean resultado = jugador.comprobarDinero(copia.getPrecio());
		
		if(copia.getTipo().equals("Maravilla")) {
			if(resultado) {
				jugador.restarDinero(copia.getPrecio());
				ciudad1.agregarEdificio(copia);
				ciudad1.mostrarEdificiosComprados();
			}
		
		}else {
	
			if(ciudad1.tieneEdificioDeTipo(copia.getTipo()) == true){
				System.out.println("Ya tenes ese tipo de edificio no lo podes comprar. ");
			}else {
				if(resultado) {
					jugador.restarDinero(copia.getPrecio());
					ciudad1.agregarEdificio(copia);
					ciudad1.mostrarEdificiosComprados();
				}
			}
			
			
		}
		}
		
		
		
	}



