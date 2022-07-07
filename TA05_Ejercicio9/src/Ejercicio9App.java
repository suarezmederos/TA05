
import javax.swing.JOptionPane;

public class Ejercicio9App {

	public static void main(String[] args) {
		
		for(int numero =1; numero <=100; numero++){
			if(numero %2 ==0 && numero % 3 ==0 ){
				JOptionPane.showMessageDialog(null, "Numero"+numero);
			}
		}

	}

}
