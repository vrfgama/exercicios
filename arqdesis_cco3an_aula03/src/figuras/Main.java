package figuras;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args){
		Geometria g= new Geometria();
		g.popula();
		JOptionPane.showMessageDialog(null, g.imprime());
	}

}
