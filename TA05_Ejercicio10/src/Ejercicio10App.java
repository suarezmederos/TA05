
import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		
		String numeroVentas = JOptionPane.showInputDialog("Introduce el numero de ventas");
		int numeroVentasConvert = Integer.parseInt(numeroVentas);
		
		double ventaConvert=0;
		double sumaTotal=0;
		
		for(int i=1; i<= numeroVentasConvert; i++){
			String venta = JOptionPane.showInputDialog("Introduce la venta");
		    ventaConvert = Double.parseDouble(venta);
			sumaTotal += ventaConvert *0.21;
		}
		JOptionPane.showMessageDialog(null, "La suma de las ventas es de" +sumaTotal);
	}

}
