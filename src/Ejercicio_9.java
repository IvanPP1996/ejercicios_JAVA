// Libreria para usar cuadros de dialogo
import javax.swing.JOptionPane;
// Importando cajero y sus metodos
import cajero.*;

public class Ejercicio_9 {
    
    public static void main(String[] args) {
        
        double saldo = 500000;

        JOptionPane.showMessageDialog(null, "Bienvenido al cajero automático.");

        while (true) {

            String entrada = JOptionPane.showInputDialog("Seleccione una opción:\n1) Consultar saldo\n2) Retirar dinero\n3) Consignar\n4) Salir");

            // Si el usuario cancela o cierra el cuadro de diálogo
            if (entrada == null) {
                break;
            }

            entrada = entrada.trim();

            // Si deja el campo vacío, se vuelve a mostrar el menú
            if (entrada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar una opción.");
                continue;
            }

            int opcion = Integer.parseInt(entrada);

            // Si selecciona salir, termina el programa
            if (opcion == 4) {
                break;
            }

            // Si la opción no existe, vuelve a mostrar el menú
            if (opcion < 1 || opcion > 3) {
                JOptionPane.showMessageDialog(null, "Opción inválida. Debe elegir entre 1 y 4.");
                continue;
            }

            if (opcion == 1) {

                // Consultar saldo
                Cajero.consultarSaldo(saldo);

            } else if (opcion == 2) {

                // Retirar dinero
                String textoRetiro = JOptionPane.showInputDialog("Ingrese el valor a retirar:");

                if (textoRetiro == null || textoRetiro.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor.");
                    continue;
                }

                double retiro = Double.parseDouble(textoRetiro.trim());

                // No se permiten valores iguales o inferiores a cero
                if (retiro <= 0) {
                    JOptionPane.showMessageDialog(null, "El valor a retirar debe ser mayor que cero.");
                    continue;
                }

                // No se permiten retiros superiores al saldo
                if (retiro > saldo) {
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes. Su saldo es: $" + String.format("%,.2f", saldo));
                    continue;
                }

                saldo = Cajero.retirar(saldo, retiro);
                JOptionPane.showMessageDialog(null, "Retiro exitoso.\nNuevo saldo: $" + String.format("%,.2f", saldo));

            } else if (opcion == 3) {

                // Consignar dinero
                String textoConsignacion = JOptionPane.showInputDialog("Ingrese el valor a consignar:");

                if (textoConsignacion == null || textoConsignacion.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor.");
                    continue;
                }

                double consignacion = Double.parseDouble(textoConsignacion.trim());

                // No se permiten valores iguales o inferiores a cero
                if (consignacion <= 0) {
                    JOptionPane.showMessageDialog(null, "El valor a consignar debe ser mayor que cero.");
                    continue;
                }

                saldo = Cajero.consignar(saldo, consignacion);
                JOptionPane.showMessageDialog(null, "Consignación exitosa.\nNuevo saldo: $" + String.format("%,.2f", saldo));
            }
        }

        JOptionPane.showMessageDialog(null, "Gracias por usar el cajero. El programa se ha cerrado correctamente.");

    }

}
