package figuras;

public class Cubo extends Quadrado implements Volume{
	
	public double volume()
	{
		return (base*base*base); 
	}
	
	public String tipo()
	{
		return "Cubo";
	}
}
