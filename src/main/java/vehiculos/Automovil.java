package vehiculos;

public class Automovil extends Vehiculo {
	int puestos;
	
	Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
}
