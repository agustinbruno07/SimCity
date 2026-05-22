public class Tienda { 
  
 private Edificio[] catalogo; 
  
 public Tienda() { 

	 cargarCatalogo();
	
 } 
 
  
 private void cargarCatalogo() { 
	 catalogo = new Edificio[30]; 
	 catalogo[0] = new Edificio("Rascascielos", "Maravilla", 0, 0, 10, 900000); 
	 catalogo[1] = new Edificio("Torre Eiffel", "Maravilla", 0, 0, 10, 850000); 
	 catalogo[2] = new Edificio("Arco del triunfo", "Maravilla", 0, 0, 9, 700000); 
	 catalogo[3] = new Edificio("Pirámide", "Maravilla", 0, 0, 9, 600000); 
	 catalogo[4] = new Edificio("Obelisco", "Maravilla", 0, 0, 8, 450000); 
	 catalogo[5] = new Edificio("Planta de energía eólica", "Planta energética", 0, 0, 10, 500000); 
	 catalogo[6] = new Edificio("Planta de energía solar", "Planta energética", 0, 0, 9, 400000); 
	 catalogo[7] = new Edificio("Planta de energía hidroeléctrica", "Planta energética", 0, 0, 8, 300000); 
	 catalogo[8] = new Edificio("Planta de energía de carbón", "Planta energética", 0, 0, 4, 150000); 
	 catalogo[9] = new Edificio("Empresa de agua corriente", "Planta de agua", 0, 0, 10, 750000); 
	 catalogo[10] = new Edificio("Obras de cañerías para agua potable", "Planta de agua", 0, 0, 9, 500000); 
	 catalogo[11] = new Edificio("Tanques de agua por manzana", "Planta de agua", 0, 10, 9, 350000); 
	 catalogo[12] = new Edificio("Pozos de agua", "Planta de agua", 0, 0, 7, 200000); 
	 catalogo[13] = new Edificio("Mega estación de policía", "Seguridad", 10, 0, 10, 400000); 
	 catalogo[14] = new Edificio("Estación de policía grande", "Seguridad", 9, 0, 9, 300000);
	 catalogo[15] = new Edificio("Estación de policía mediana", "Seguridad", 7, 0, 5, 200000); 
	 catalogo[16] = new Edificio("Estación de policía chica", "Seguridad", 5, 0, 2, 100000); 
	 catalogo[17] = new Edificio("Mega estación de bomberos", "Incendios", 0, 10, 10, 450000); 
	 catalogo[18] = new Edificio("Estación de bomberos grande", "Incendios", 0, 8, 8, 350000); 
	 catalogo[19] = new Edificio("Estación de bomberos mediana", "Incendios", 0, 7, 6, 250000); 
	 catalogo[20] = new Edificio("Estación de bomberos chica", "Incendios", 0, 6, 5, 150000); 
	 catalogo[21] = new Edificio("Rutas", "Caminos", 0, 0, 10, 400000); 
	 catalogo[22] = new Edificio("Autopistas", "Caminos", 0, 0, 9, 300000); 
	 catalogo[23] = new Edificio("Avenidas", "Caminos", 0, 0, 8, 200000); 
	 catalogo[24] = new Edificio("Calles de asfalto", "Caminos", 0, 0, 6, 150000); 
	 catalogo[25] = new Edificio("Calles de tierra", "Caminos", 0, 0, 1, 50000); 
	 catalogo[26] = new Edificio("Reserva natural", "Ecología", 0, 0, 10, 500000); 
	 catalogo[27] = new Edificio("Parque polideportivo", "Ecología", 0, 0, 9, 300000); 
	 catalogo[28] = new Edificio("Parque grande", "Ecología", 0, 0, 8, 200000); 
	 catalogo[29] = new Edificio("Plaza", "Ecología", 0, 0, 7, 100000); 
 } 
 
 public void mostrarCatalogo() { 
	 for(int i = 0; i < catalogo.length; i++) {
		 System.out.println("--");
		 catalogo[i].mostrarDatos();
		 
	 }
 } 
  
public Edificio obtenerEdificio(int posicion) { 
 // devolver un edificio del catálogo 
	return this.catalogo[posicion - 1];
	
}
 }
