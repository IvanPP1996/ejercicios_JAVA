// Libreria para usar cuadros de dialogo
import javax.swing.JOptionPane;
// Importando energia y sus metodos
import energia.*;

public class Ejercicio_10 {

    public static void main(String[] args) {
        
        // Arreglo para el consumo (kWh) de 10 viviendas
        double[] consumos = new double[10];

        int registrados = 0;

        JOptionPane.showMessageDialog(null, "Programa para registrar el consumo de energía de 10 viviendas.");

        while (registrados < 10) {

            String entrada = JOptionPane.showInputDialog("Consumo (kWh) de la vivienda " + (registrados + 1) + " de 10:\n(Ingrese -1 para terminar la captura)");

            if (entrada == null) {
                break;
            }

            entrada = entrada.trim();

            // Si deja el campo vacío, se vuelve a pedir
            if (entrada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor.");
                continue;
            }

            double consumo = Double.parseDouble(entrada);

            // Si ingresa -1, termina la captura
            if (consumo == -1) {
                break;
            }

            // Si es negativo y diferente de -1, se ignora el dato
            if (consumo < 0) {
                JOptionPane.showMessageDialog(null, "El consumo no puede ser negativo. Dato ignorado.");
                continue;
            }

            consumos[registrados] = consumo;
            registrados++;
        }

        if (registrados == 0) {

            JOptionPane.showMessageDialog(null, "No se registró ningún consumo.");

        } else {

            // Mostrar los consumos registrados
            String lista = "CONSUMOS REGISTRADOS\n\n";

            for (int i = 0; i < registrados; i++) {
                lista += "Vivienda " + (i + 1) + ": " + String.format("%.2f", consumos[i]) + " kWh\n";
            }

            JOptionPane.showMessageDialog(null, lista);

            // Resultados del reporte
            double total = Energia.consumoTotal(consumos, registrados);
            double promedio = Energia.consumoPromedio(consumos, registrados);
            int superan = Energia.contarSuperanLimite(consumos, registrados);

            JOptionPane.showMessageDialog(null, "REPORTE DE CONSUMO\n\n"
                + "Viviendas registradas: " + registrados + "\n"
                + "Consumo total: " + String.format("%.2f", total) + " kWh\n"
                + "Consumo promedio: " + String.format("%.2f", promedio) + " kWh\n"
                + "Viviendas que superan 150 kWh: " + superan);
        }

        JOptionPane.showMessageDialog(null, "El programa se ha cerrado correctamente.");

    }
    
}
