package vehiculos;

import java.util.Hashtable;

public class Fabricante {
	String nombre;
	Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getPais() {
		return this.pais;
	}
	
	public Fabricante fabricaMayorVentas() {
		Hashtable<Fabricante, Integer> fabricantes = new Hashtable<Fabricante, Integer>();
		
		for(Fabricante fabricante : Vehiculo.getFabricantes()) {
			if(fabricantes.containsKey(fabricante)) {
				fabricantes.put(fabricante, fabricantes.get(fabricante) + 1);
			}
			else {
				fabricantes.put(fabricante, 1);
			}
		}
		
		int max_val = 0;
		Fabricante max_fabricante = null;
		for(Fabricante fabricante: fabricantes.keySet()) {
			if(fabricantes.get(fabricante) > max_val) {
				max_val = fabricantes.get(fabricante);
				max_fabricante = fabricante;
			}
		}
		
		return max_fabricante;
	}
}
