package test;

import java.util.ArrayList;
import java.util.Hashtable;

import vehiculos.Automovil;
import vehiculos.Camion;
import vehiculos.Camioneta;
import vehiculos.Fabricante;
import vehiculos.Pais;
import vehiculos.Vehiculo;

public class Test {

	public static void main(String[] args) {	
		Pais p1 = new Pais("Ecuador");
		Pais p2 = new Pais("USA");
		Pais p3 = new Pais("Canada");
		
		Fabricante f1 = new Fabricante("Renault", p1);
		Fabricante f2 = new Fabricante("Chevrolet", p1);
		Fabricante f3 = new Fabricante("Tesla", p2);
		Fabricante f4 = new Fabricante("Volvo", p3);
		
		new Camion("SS", "Camion premium", 1000, 100, f1, 3);
		new Camion("AA", "Camion", 1000, 100, f1, 3);
		new Automovil("NN", "Mac 100", 820, 20, f1, 4);
		new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		new Automovil("NN", "Mac 100", 820, 20, f2, 4);
		new Camioneta("CC", 5, "Ford", 500, 150, f2, true);
		
		new Camion("SS", "Camion premium", 1000, 100, f3, 3);
		new Camion("AA", "Camion", 1000, 100, f3, 3);
		new Automovil("NN", "Mac 100", 820, 20, f3, 4);
		
		new Camioneta("CC", 5, "Ford", 500, 150, f4, true);
		new Automovil("NN", "Mac 100", 820, 20, f4, 4);
		
		
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
		
		System.out.println(max_fabricante.getNombre());
		
//		Hashtable<Pais, Integer> paises = new Hashtable<Pais, Integer>();
//		
//		for(Fabricante fabricante : Vehiculo.getFabricantes()) {
//			
//			Pais pais = fabricante.getPais();
//			
//			if(paises.containsKey(pais)) {
//				paises.put(pais, paises.get(pais) + 1);
//			}
//			else {
//				paises.put(pais, 1);
//			}
//		}
//		
//		int max_val = 0;
//		Pais max_pais = null;
//		for(Pais pais: paises.keySet()) {
//			if(paises.get(pais) > max_val) {
//				max_val = paises.get(pais);
//				max_pais = pais;
//			}
//		}
//		
//		System.out.println(max_pais.getNombre());

	}

}
