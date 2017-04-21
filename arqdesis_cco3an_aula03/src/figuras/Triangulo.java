package figuras;

public class Triangulo extends Poligono {

	protected double ladoa= 2;
	protected double ladob= 3;
	protected double ladoc= 1;
	
	@Override
	public double area() {
		return (base*altura)/2;
	}

	@Override
	public double perimetro() {
		return ladoa+ladob+ladoc;
	}

	@Override
	public String tipo() {
		return "Triângulo";
	}

}
