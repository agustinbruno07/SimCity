
public class Edificio {

	private String tipo;
	private String nombre;
	private int seguridad;
	private int prevIncendios;
	private int felicidad;
	private int precio;
	
	public Edificio(String nombre, String tipo,  int seguridad, int prevIncendios, int felicidad, int precio) {
		
		this.tipo = tipo;
		this.nombre = nombre;
		this.seguridad = seguridad;
		this.prevIncendios = prevIncendios;
		this.felicidad = felicidad;
		this.precio = precio;
		
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getSeguridad() {
		return this.seguridad;
	}
	public int getPrevIncendios() {
		return this.prevIncendios;
	}
	public int getFelicidad() {
		return this.prevIncendios;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void mostrarDatos() {
	    System.out.println("• Nombre: " + this.nombre);
	    System.out.println("• Tipo: " + this.tipo);
	    System.out.println("• Seguridad: " + this.seguridad);
	    System.out.println("• Precio: $" + this.precio);
	}
	
	
}
