package figuras;

public class Circulo extends Figura{
	
	double raio= 2;
	double pi= 3.14;
	
	@Override
	public double area()
	{
		return pi*(raio*raio);
	}
	
	public double perimetro()
	{
		return 2*pi*raio;		
	}

	@Override
	public String tipo() {
		return "Circulo";
	}

}
