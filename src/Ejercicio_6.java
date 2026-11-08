// Libreria para usar cuadros de dialogo
import javax.swing.JOptionPane;
// Importando asistencia y sus metodos
import asistencia.*;

public class Ejercicio_6 {
    
    public static void main(String[] args) {
        
        boolean[] asistencia = new boolean[12];

        // Cantidad de registros válidos guardados
        int registrados = 0;

        JOptionPane.showMessageDialog(null, "Programa para controlar la asistencia de 12 aprendices.");

        while (registrados < 12) {

            // Registro de estado de aprendices en el arreglo
            String entrada = JOptionPane.showInputDialog("Aprendiz " + (registrados + 1) + " de 12:\nIngrese P (presente), A (ausente) o X (terminar)");

            // Si el usuario cancela
            if (entrada == null) {
                break;
            }

            entrada = entrada.trim();

            // Si ingresa X, termina el registro anticipadamente
            if (entrada.equalsIgnoreCase("X")) {
                break;
            }

            if (entrada.equalsIgnoreCase("P")) {

                asistencia[registrados] = true;
                registrados++;

            } else if (entrada.equalsIgnoreCase("A")) {

                asistencia[registrados] = false;
                registrados++;

            } else {

                // Valor diferente de P, A o X vuelve a pedir
                JOptionPane.showMessageDialog(null, "Valor no válido. Solo puede ingresar P, A o X.");
                continue;
            }
        }

        if (registrados == 0) {

            JOptionPane.showMessageDialog(null, "No se registró ningún aprendiz.");

        } else {

            int presentes = Asistencia.contarPresentes(asistencia, registrados);
            int ausentes = Asistencia.contarAusentes(asistencia, registrados);
            double porcentaje = Asistencia.calcularPorcentaje(presentes, registrados);

            JOptionPane.showMessageDialog(null, "RESUMEN DE ASISTENCIA\n\n"
                    + "Registros válidos: " + registrados + "\n"
                    + "Presentes: " + presentes + "\n"
                    + "Ausentes: " + ausentes + "\n"
                    + "Porcentaje de asistencia: " + String.format("%.2f", porcentaje) + "%");
        }

        JOptionPane.showMessageDialog(null, "El programa se ha cerrado correctamente.");

    }

}
