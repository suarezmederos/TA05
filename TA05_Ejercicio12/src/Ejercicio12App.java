
import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		
		String contrasena = "123";
		String contrasenaNew = "";
		
		int intento=1;
		boolean contrasenaCorrecta = false;
		while( intento <= 3 && !contrasenaCorrecta){
			contrasenaNew = JOptionPane.showInputDialog("Introduce la contraseña");
			if( contrasena.equals(contrasenaNew)){
				JOptionPane.showMessageDialog(null, "Enohorabuena");
				contrasenaCorrecta = true;
			}
		    intento++;
		}

	}

}
