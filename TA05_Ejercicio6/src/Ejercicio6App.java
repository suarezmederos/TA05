
import javax.swing.JOptionPane;

public class Ejercicio6App {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Introduce el precio de un producto");
		double numeroConvert = Double.parseDouble(numero);
        
		double precioFinal = numeroConvert * 0.21;
		JOptionPane.showMessageDialog(null, "El precio final con IVA es:"+precioFinal);
	}

}
