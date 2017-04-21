package figuras;

public class Retangulo extends Poligono implements Diagonal{

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
		return 2*base+2*altura;
	}

	@Override
	public String tipo() {
		return "Retângulo";
	}

}
