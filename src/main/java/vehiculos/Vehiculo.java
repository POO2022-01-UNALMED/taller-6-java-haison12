package vehiculos;
import vehiculos.Fabricante;

public class Vehiculo {
	private String placa; 
	private int puertas; 
	private float velocidadMaxima; 
	private String nombre; 
	private float precio; 
	private float peso;
	private String traccion; 
	private Fabricante fabricante;
	
	private static int CantidadVehiculos;
	
	public Vehiculo (String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.CantidadVehiculos = Vehiculo.CantidadVehiculos + 1;
	}
	
	public String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantidadAutomovil() + 
				"\nCamionetas: " + Camioneta.getCantidadCamionetas() +
				"\nCamiones: " + Camion.getCantidadCamiones();
	}
	
	
	
	
	
	
	
	
	
	
	public String getPlaca() {return placa;}
	public void setPlaca(String x) {this.placa = x;}
	
	public int getPuertas() {return puertas;}
	public void setPuertas(int x) {this.puertas = x;}
	
	public float getVelocidadMaxima() {return velocidadMaxima;}
	public void setVelocidadMaxima(float x) {this.velocidadMaxima = x;}

	public String getNombre() {return nombre;}
	public void setNombre(String x) {this.nombre = x;}
	
	public float getPrecio() {return precio;}
	public void setPrecio(float x) {this.precio = x;}
	
	public float getPeso() {return peso;}
	public void setPeso(float x) {this.peso = x;}
	
	public String getTraccion() {return traccion;}
	public void setTraccion(String x) {this.traccion = x;}
	
	public Fabricante getFabricante() {return fabricante;}
	public void setFabricante(Fabricante x) {this.fabricante = x;}
	
	public static int getCantidadVehiculos(){return CantidadVehiculos;}
	public static void setCantidadVehiculos(int x) {CantidadVehiculos=x;}
	
	
}
