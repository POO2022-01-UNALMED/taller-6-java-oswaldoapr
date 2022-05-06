package vehiculos;

import java.util.Hashtable;

public class Pais {
	String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public static Pais paisMasVendedor() {
		Hashtable<Pais, Integer> paises = new Hashtable<Pais, Integer>();
		
		for(Fabricante fabricante : Vehiculo.getFabricantes()) {
			Pais pais = fabricante.getPais();
			if(paises.containsKey(pais)) {
				paises.put(pais, paises.get(pais) + 1);
			}
			else {
				paises.put(pais, 1);
			}
		}
		
		int max_val = 0;
		Pais max_pais = null;
		for(Pais pais: paises.keySet()) {
			if(paises.get(pais) > max_val) {
				max_val = paises.get(pais);
				max_pais = pais;
			}
		}
		
		return max_pais;
	}
}
