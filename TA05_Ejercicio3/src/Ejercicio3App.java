
import javax.swing.JOptionPane;

public class Ejercicio3App {

	public static void main(String[] args) {
		
        String nombre = "Juan Miguel";
		
		System.out.println("Hola, Bienvenido");
		nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Hola, Bienvenido"+nombre);

	}

}
