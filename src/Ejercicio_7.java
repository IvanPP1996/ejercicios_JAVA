// Libreria para usar cuadros de dialogo
import javax.swing.JOptionPane;
// Importando ventas y sus metodos
import ventas.*;


public class Ejercicio_7 {
    
    public static void main(String[] args) {
        
        // Arreglo para las ventas de 7 días
        double[] ventas = new double[7];

        int registrados = 0;

        JOptionPane.showMessageDialog(null, "Programa para registrar las ventas diarias de una semana.");

        while (registrados < 7) {

            String entrada = JOptionPane.showInputDialog("Ventas del día " + (registrados + 1) + " de 7:\n(Ingrese -1 para terminar la captura)");

            if (entrada == null) {
                break;
            }

            entrada = entrada.trim();

            // Si deja el campo vacío vuelve a pedir
            if (entrada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor.");
                continue;
            }

            double valor = Double.parseDouble(entrada);

            // Si ingresa -1, termina el proceso de capturar datos
            if (valor == -1) {
                break;
            }

            // Cualquier otro negativo no es valido
            if (valor < 0) {
                JOptionPane.showMessageDialog(null, "La venta no puede ser negativa. Intente de nuevo.");
                continue;
            }

            ventas[registrados] = valor;
            registrados++;
        }

        if (registrados == 0) {

            JOptionPane.showMessageDialog(null, "No se registró ninguna venta.");

        } else {

            double total = Ventas.totalVendido(ventas, registrados);
            int diasConVentas = Ventas.contarDiasConVentas(ventas, registrados);
            double promedio = Ventas.promedioVentas(ventas, registrados);
            int posicionMayor = Ventas.diaMayorVenta(ventas, registrados);

            String resumen = "RESUMEN DE VENTAS\n\n"
                + "Días registrados: " + registrados + "\n"
                + "Días con ventas: " + diasConVentas + "\n"
                + "Total vendido: $" + String.format("%.2f", total) + "\n"
                + "Promedio de los días con ventas: $" + String.format("%.2f", promedio) + "\n";

            if (diasConVentas > 0) {
                resumen += "Día con la venta más alta: día " + (posicionMayor + 1)
                        + " $" + String.format("%.2f", ventas[posicionMayor]) + "";
            } else {
                resumen += "No hubo días con ventas.";
            }

            JOptionPane.showMessageDialog(null, resumen);
        }

        JOptionPane.showMessageDialog(null, "El programa se ha cerrado correctamente.");

    }

}
