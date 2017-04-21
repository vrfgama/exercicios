package figuras;

public class Losango extends Poligono implements Diagonal{
	
	@Override
	public double area() {
		return base*altura;
	}

	@Override
	public double diagonal() {
		return Math.sqrt((base*base)+(altura*altura));
	}

	@Override
	public double perimetro() {
		return 4*base;
	}

	@Override
	public String tipo() {
		return "Losango";
	}
}
