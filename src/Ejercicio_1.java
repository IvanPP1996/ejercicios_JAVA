// implementar metodos de los arrays
import java.util.Arrays;
// Para implementar por cuadro de dialogo
import javax.swing.JOptionPane;
// Importando temperaturas y sus metodos
import temperaturas.*;

public class Ejercicio_1 {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Programa para registro y manejo de \ntemperaturas por x días.");
        
        String dias = JOptionPane.showInputDialog("Ingrese el número de días quiere saber la temperatura: ");
        int diasNumero = Integer.parseInt(dias);
        
        int contador = 0;

        // arreglo definido con su tamaño
        double[] temperaturas = new double[diasNumero];
        
        for (int i = 0; i < temperaturas.length; i++) {
            String dato = JOptionPane.showInputDialog("Ingrese la temperatura del día #" + (i+1) + ": ");
            double datoNumero = Double.parseDouble(dato);
            // Ingresando -999
            if (datoNumero == -999) {
                // Cambio el tamaño del arreglo con la variable contador
                temperaturas = Arrays.copyOf(temperaturas, contador);
                break;
                // Ingresando mayor a 60 y menor a -50
            } else if (datoNumero <= -50 || datoNumero >= 60) {
                continue;
            } else {
                temperaturas[contador] = datoNumero;
                contador += 1;
            }
        }
        temperaturas = Arrays.copyOf(temperaturas, contador);
        
        // Arreglo con temperaturas
        String temperaturasString = Arrays.toString(temperaturas);
        
        // Promedio de las temperaturas
        double prom = Temperaturas.promedioTemperaturas(temperaturas);
        
        // Temperatura mas alta y baja
        double[] ArrayTempAltaBaja = Temperaturas.temperaraturaAltaBaja(temperaturas);
        
        JOptionPane.showMessageDialog(null, "1) El arreglo es: " + temperaturasString + "\n2) El promedio es de: " + prom + "\n3) La temperatura mas baja es: " + ArrayTempAltaBaja[0] + "\n    La temeperatura mas alta es: " + ArrayTempAltaBaja[1]);
    }
}
