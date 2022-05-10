package vehiculos;

public class Camioneta extends Vehiculo{
	
	private boolean volco;
	private static int CantidadCamioneta;
	
	public Camioneta (String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso,
			String traccion, Fabricante fabricante) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		
		this.volco = volco;
		Camioneta.CantidadCamioneta = Camioneta.CantidadCamioneta +1;
		}
	
	public boolean isVolco(){return volco;}
	public void setVolco(boolean x){this.volco = x;}
	
	public static int getCantidadCamionetas(){return Camioneta.CantidadCamioneta;}
	public static void setCantidadCamionetas(int x) {Camioneta.CantidadCamioneta = x;}

	
}
