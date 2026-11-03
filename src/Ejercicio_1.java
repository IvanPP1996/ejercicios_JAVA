// implementar metodos de los arrays
import java.util.Arrays;
// Para implementar por cuadro de dialogo
import javax.swing.JOptionPane;

import calculoPromedio.Promedio;

public class Ejercicio_1 {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Programa para registro y manejo de \ntemperaturas por x días.");
        
        String dias = JOptionPane.showInputDialog("Ingrese el número de días quiere saber la temperatura: ");
        int diasNumero = Integer.parseInt(dias);

        // arreglo definido con su tamaño
        double[] temperaturas = new double[diasNumero];
        
        for (int i = 0; i < temperaturas.length; i++) {
            String dato = JOptionPane.showInputDialog("Ingrese la temperatura del día #" + (i+1) + ": ");
            double datoNumero = Double.parseDouble(dato);
            temperaturas[i] = datoNumero;
        }

        String temperaturasString = Arrays.toString(temperaturas);
        JOptionPane.showMessageDialog(null, "El arreglo es: " + temperaturasString);

        // Promedio de las temperaturas
        double prom = Promedio.promedioTemperaturas(temperaturas);
        JOptionPane.showMessageDialog(null, "El promedio es de: " + prom);
    }
}
