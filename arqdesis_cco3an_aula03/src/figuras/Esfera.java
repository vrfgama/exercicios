package figuras;

public class Esfera extends Circulo implements Volume{
	
	public double volume()
	{
		return (4*pi*(raio*raio*raio))/3;
	}
	
	public String tipo()
	{
		return "Esfera";
	}
}
