package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	private static int CantidadCamiones;

	public Camion(String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso,
			String traccion, Fabricante fabricante) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		
		this.ejes = ejes;
		Camion.CantidadCamiones = Camion.CantidadCamiones+1;
		
	}
	
	public int getEjes() {return ejes;}
	public void setEjes(int x) {this.ejes = x;}
	
	public static int getCantidadCamiones(){return Camion.CantidadCamiones;}
	public static void setCantidadCamiones(int x) {Camion.CantidadCamiones = x;}
}