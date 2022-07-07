
import javax.swing.JOptionPane;

public class CalculadoraApp {

	public static void main(String[] args) {
		
		String operando1 = JOptionPane.showInputDialog("Introduce el operando 1");
		String operando2 = JOptionPane.showInputDialog("Introduce el operando 2");
		String signo = JOptionPane.showInputDialog("Introduce un signo");
		
		int operandoConvert1 = Integer.parseInt(operando1);
		int operandoConvert2 = Integer.parseInt(operando2);
		double operacion=0;
		
		if(signo.equals("+")){
			operacion= operandoConvert1 + operandoConvert2;
		}else if(signo.equals("-")){
			operacion= operandoConvert1 - operandoConvert2;
		}else if(signo.equals("*")){
			operacion= operandoConvert1 * operandoConvert2;
		}else if(signo.equals("/")){
			operacion= operandoConvert1 / operandoConvert2;
		}else if(signo.equals("%")){
			operacion= operandoConvert1 % operandoConvert2;
		}else
			operacion = Math.pow(operandoConvert1, operandoConvert2);
		JOptionPane.showMessageDialog(null, "El resultado de la operacion es" +operacion);
	}

}
