// Para implementar metodos de los arrays
import java.util.Arrays;
// Para implementar por cuadro de dialogo
import javax.swing.JOptionPane;
// Importando notas y sus metodos
import notas.*;

public class Ejercicio_3 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Programa para saber las notas definitivas\nde X estudiantes");

        String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes los cuales quiere conocer sus notas.");
        int cantidadNumero = Integer.parseInt(cantidad);

        int contador = 0;

        double[] notas = new double[cantidadNumero];

        for (int i = 0; i < notas.length; i++) {
            
            String notaEst = JOptionPane.showInputDialog("Ingrese la nota #" + (i + 1));
            double notasNumero = Double.parseDouble(notaEst);

            if (notasNumero == 99) {

                notas = Arrays.copyOf(notas, contador);
                break;

            } else if (notasNumero < 0.0 || notasNumero > 5.0) {
                
                continue;

            } else {

                notas[contador] = notasNumero;
                contador += 1;

            }

        }

        notas = Arrays.copyOf(notas, contador);

        // Arreglo de notas
        String notasString = Arrays.toString(notas);

        // Promedio notas
        double promNotas = Notas.promedio(notas);

        // Estudiantes aprobados mayor a 3.0
        int[] arrEstudiantesAR = Notas.aprobados(notas);

        JOptionPane.showMessageDialog(null, "1) El arreglo de notas es: " + notasString + "\n2) El promedio de las notas es de: " + promNotas + "\n3) El total de estudiantes aprobados es: " + arrEstudiantesAR[0] + "\n    El total de estudiantes reprobados es: " + arrEstudiantesAR[1]);

    }
}
