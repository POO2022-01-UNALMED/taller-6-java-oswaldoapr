package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	static int cantidadVehiculos = 0;
	static int cantidadAutomoviles = 0;
	static int cantidadCamionetas = 0;
	static int cantidadCamiones = 0;
	static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		
		Vehiculo.cantidadVehiculos += 1;
		Vehiculo.fabricantes.add(this.fabricante);
		
		if(traccion == "FWD") {
			Vehiculo.cantidadAutomoviles += 1;
		}
		else if(traccion == "4X4") {
			Vehiculo.cantidadCamionetas += 1;
		}
		else if(traccion == "4X2") {
			Vehiculo.cantidadCamiones += 1;
		}
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	public static int getCantidadVehiculos() {
		return Vehiculo.cantidadVehiculos;
	}
	
	public static String vehiculosPorTipo() {		
		return "Automoviles: " + Vehiculo.cantidadAutomoviles +
			   "\nCamionetas: " + Vehiculo.cantidadCamionetas + 
			   "\nCamiones: " + Vehiculo.cantidadCamiones;
	}
	
	public static ArrayList<Fabricante> getFabricantes() {
		return Vehiculo.fabricantes;
	}
}
