
public class Jugador {
	
	private String nombre;
	private int dinero ;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.dinero = 1000000;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	public int getDinero() {
		return this.dinero;
	}
	public void sumarDinero(int monto) {
		if(monto > 0) {
			this.dinero += monto;
			System.out.println("Se sumaron $" + monto + ". Nuevo saldo: $" +this.dinero);
		}else {
			System.out.println("Error. El monto a sumar debe ser mayor a cero");
		}
	}
	public boolean restarDinero(int monto ) {
		if(monto < 0){
			System.out.println("El monto no puede ser negativo");
			return false;
		}
		if(this.dinero >= monto){
			this.dinero -= monto;
			System.out.println("Se restaron $:" + monto + ". El dinero disponible es: " + this.dinero);
			return true;
			
		}else {
			System.out.println("Error el dinero es menor al monto ingresado");
			return false;
		}
		
	}
	public boolean comprobarDinero(int monto) {
		if(this.dinero >= monto){
			return true;
		}else {
			return false;
		}
	}
	public void mostrarDatos() {
		System.out.println("LOS DATOS DEL ALCALDE SON:");
		System.out.println("El nombre del Alcalde es: " + this.nombre);
		System.out.println("El dinero del Alcalde es: " + this.dinero );
	}
	
}
