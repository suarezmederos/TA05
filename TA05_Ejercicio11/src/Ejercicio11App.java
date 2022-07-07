
import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		
		String dia ="Lunes";
		dia = JOptionPane.showInputDialog("Introduce dia de la semana");
		switch(dia)
		{
			case "Lunes":
				JOptionPane.showMessageDialog(null, "Dia Laborable");
				break;
			case "Martes":
				JOptionPane.showMessageDialog(null, "Dia Laborable");
				break;
			case "Miercoles":
				JOptionPane.showMessageDialog(null, "Dia Laborable");
				break;
			case "Jueves":
				JOptionPane.showMessageDialog(null, "Dia Laborable");
				break;
			case "Viernes":
				JOptionPane.showMessageDialog(null, "Dia Laborable");
				break;
			case "Sabado":
				JOptionPane.showMessageDialog(null, "Dia no Laborable");
				break;
			case "Domingo":
				JOptionPane.showMessageDialog(null, "Dia no Laborable");
				break;
		}

	}

}
