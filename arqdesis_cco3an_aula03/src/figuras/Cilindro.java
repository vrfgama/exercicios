package figuras;

public class Cilindro extends Circulo implements Volume{
	
	double altura= 3;
	
	public double volume()
	{
		return pi*(raio*raio)*altura;		
	}
	
	public String tipo()
	{
		return "Cilindro";
	}
}
