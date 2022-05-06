package test;

import java.util.ArrayList;
import java.util.Hashtable;
import vehiculos.Fabricante;
import vehiculos.Pais;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
		
		Pais pais1 = new Pais("Colombia");
		Pais pais2 = new Pais("USA");
		Pais pais3 = new Pais("Alemania");
		
		fabricantes.add(new Fabricante("1", pais1));
		fabricantes.add(new Fabricante("2", pais1));
		fabricantes.add(new Fabricante("3", pais1));
		fabricantes.add(new Fabricante("4", pais2));
		fabricantes.add(new Fabricante("5", pais2));
		fabricantes.add(new Fabricante("6", pais3));
		
		
		Hashtable<Pais, Integer> paises = new Hashtable<Pais, Integer>();
		
		for(Fabricante fabricante : fabricantes) {
			
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
		
		System.out.println(max_pais.getNombre());

	}

}
