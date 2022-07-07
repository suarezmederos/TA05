import javax.swing.JOptionPane;


public class Ejercicio5App {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Introduce un numero");
		double numeroConvert = Double.parseDouble(numero);
		
		int operacion = (int) (numeroConvert % 2);
		
		if(operacion ==0){
			JOptionPane.showMessageDialog(null, "El numero es divisible entre 2");
		}
		else if( operacion !=0){
			JOptionPane.showMessageDialog(null, "El numero no es divisible entre 2");
		}

	}

}
