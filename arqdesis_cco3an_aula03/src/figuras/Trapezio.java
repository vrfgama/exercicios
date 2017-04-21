package figuras;

public class Trapezio extends Poligono {

	double basem= 4;
	
	@Override
	public double area() {
		return ((base+basem)*altura)/2;
	}

	@Override
	public double perimetro() {
		double l= (basem-base)/2;
		double lado= Math.sqrt((l*l)+(altura*altura));
		return lado+lado+basem+base;
	}

	@Override
	public String tipo() {
		return "Trapézio";
	}

}
