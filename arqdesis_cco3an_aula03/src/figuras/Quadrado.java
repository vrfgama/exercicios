package figuras;

public class Quadrado extends Poligono implements Diagonal {

	@Override
	public double area() {
		return altura*altura;
	}

	@Override
	public double diagonal() {	
		return Math.sqrt((base*base)+(altura*altura));	
	}

	@Override
	public double perimetro() {
		return 4*altura;
	}

	@Override
	public String tipo() {
		return "Quadrado";
	}

}
