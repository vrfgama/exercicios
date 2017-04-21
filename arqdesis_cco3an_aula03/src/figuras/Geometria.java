package figuras;

import java.util.ArrayList;

public class Geometria {
	
	ArrayList<Figura> figura;
	Circulo circulo;
	Quadrado quadrado;
	Retangulo retangulo;
	Losango losango;
	Triangulo triangulo;
	Trapezio trapezio;
	Esfera esfera;
	Cilindro cilindro;
	Cubo cubo;
	Piramide piramide;
	String x;
	
	public Geometria(){
		figura= new ArrayList<Figura>();
		circulo= new Circulo();
		quadrado= new Quadrado();
		retangulo= new Retangulo();
		losango= new Losango();
		triangulo= new Triangulo();
		trapezio= new Trapezio();
		esfera= new Esfera();
		cilindro= new Cilindro();
		piramide= new Piramide();
		cubo= new Cubo();
		x="";
	}
	
	public void popula()
	{
		figura.add(circulo);
		figura.add(quadrado);
		figura.add(retangulo);
		figura.add(losango);
		figura.add(triangulo);
		figura.add(trapezio);
		figura.add(esfera);
		figura.add(cilindro);
		figura.add(cubo);
		figura.add(piramide);
	}
	
	public String imprime(){
			
		for(Figura f: figura){
			
			if(f.tipo()=="Esfera" || f.tipo()=="Cilindro" || f.tipo()=="Pirâmide" || f.tipo()=="Cubo"){
				x+= f.tipo()+"\nVolume: "+f.volume()+"\n";
				x+="************************\n";
			}else{
				x+= f.tipo()+"\nArea: "+f.area()+"\nPerímetro: "+f.perimetro()+"\n";
				x+="************************\n";
			}
		}
		return x;
	}
	


}
