package vehiculos;

public class Automovil extends Vehiculo{
	
	private int puertas;
	private static int CantidadAutomovil;

	public Automovil(String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso,
			String traccion, Fabricante fabricante) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		
		this.puertas = puertas;
		Automovil.CantidadAutomovil = Automovil.CantidadAutomovil + 1;
		
	}
	
	public int getPuertas() {return puertas;}
	public void setPuertas(int x) {this.puertas = x;}
	
	public static int getCantidadAutomovil(){return Automovil.CantidadAutomovil;}
	public static void setCantidadAutomovil(int x) {Automovil.CantidadAutomovil = x;}
	
}