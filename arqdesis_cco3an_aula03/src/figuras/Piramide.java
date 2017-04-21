package figuras;

public class Piramide extends Triangulo implements Volume{
	
	public double volume()
	{
		return (base*altura)/3;
	}
	
	public String tipo()
	{
		return "Pirâmide";
	}
}
