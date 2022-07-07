
import javax.swing.JOptionPane;


public class Ejercicio4 {

	public static void main(String[] args) {
		
		String radio = JOptionPane.showInputDialog("Introduce el radio del circulo");
		double radioConvert = Double.parseDouble(radio);
		
		double areaCirculo = Math.PI * Math.pow(radioConvert, 2);
		JOptionPane.showMessageDialog(null, "El area del circulo es ="+areaCirculo);
	}
}
