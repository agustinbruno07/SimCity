
public class Ciudad {
	private String nombre;
	private Edificio[] edificiosComprados;
	private int contadorComprados = 0;
	private int cantidadMax = 10;
	
	
	public Ciudad(String nombre) {
		this.nombre = nombre;
		this.edificiosComprados = new Edificio[cantidadMax];
		this.contadorComprados =0;
		
	}
	
	
	public void agregarEdificio(Edificio edificioNuevo) {
		if(this.contadorComprados < this.cantidadMax){
			this.edificiosComprados[this.contadorComprados] = edificioNuevo;
			
			this.contadorComprados = contadorComprados + 1;
			
			System.out.println("El edificio " + edificioNuevo.getNombre() + "fue construido en la ciudad");
			
		}else {
			System.out.println("Error. No se pueden agregar mas edificios a la ciudad");
		}
	}
	
	public void mostrarDatosCiudad() {
		System.out.println("El nombre de la ciudad es: " + this.nombre);

		System.out.println("La cantidad de edificios comprados son:  " + this.contadorComprados);
		
	}
	public void mostrarEdificiosComprados() {
		
		for(int i = 0; i < this.contadorComprados; i++) {
			System.out.println("- ");
			this.edificiosComprados[i].mostrarDatos();
				
		}
		
	}
	
	
	
	public int getCantidadEdificiosComprados() {
		return this.contadorComprados;
	}
	
	
	
}
