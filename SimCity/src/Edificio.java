
public class Edificio {

	private String tipo;
	private String nombre;
	private int seguridad;
	private int prevencionIncendios;
	private int felicidad;
	private int precio;
	
	public Edificio(String nombre, String tipo,  int seguridad, int prevencionIncendios, int felicidad, int precio) {
		
		this.tipo = tipo;
		this.nombre = nombre;
		this.seguridad = seguridad;
		this.prevencionIncendios = prevencionIncendios;
		this.felicidad = felicidad;
		this.precio = precio;
		
	}

	public Edificio(Edificio otroEdificio) {
	    this.nombre = otroEdificio.getNombre();
	    this.tipo = otroEdificio.getTipo();
	    this.seguridad = otroEdificio.getSeguridad();
	    this.prevencionIncendios = otroEdificio.getPrevencionIncendios();
	    this.felicidad = otroEdificio.getFelicidad();
	    this.precio = otroEdificio.getPrecio();
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
	public int getPrevencionIncendios() {
		return this.prevencionIncendios;
	}
	public int getFelicidad() {
		return this.felicidad;
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
