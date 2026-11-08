import javax.swing.JOptionPane;

import codigo_productos.CodigoProductos;

public class Ejercicio_5 {
    
    public static void main(String[] args) {
        
        // Arreglo con 10 códigos de productos
        int[] codigos = {101, 205, 310, 422, 518, 633, 749, 856, 964, 1070};

        JOptionPane.showMessageDialog(null, "Programa para buscar un código de producto en un arreglo de 10 códigos.");

        while (true) {

            String entrada = JOptionPane.showInputDialog("Ingrese el código a buscar o\n0 para cancelar las búsquedas:");

            // Si el usuario cancela la busqueda
            if (entrada == null) {
                break;
            }

            // Valida que sea un número entero
            if (!entrada.trim().matches("-?\\d{1,9}")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero válido.");
                continue;
            }

            int codigo = Integer.parseInt(entrada.trim());

            // Si es 0, se cancelan las búsquedas
            if (codigo == 0) {
                break;
            }

            // Si es negativo, pide otro código sin buscar
            if (codigo < 0) {
                JOptionPane.showMessageDialog(null, "El código no puede ser negativo. Intente de nuevo.");
                continue;
            }

            // Llamada al método de búsqueda
            int posicion = CodigoProductos.buscarCodigo(codigos, codigo);

            if (posicion != -1) {
                JOptionPane.showMessageDialog(null, "Código " + codigo + " ENCONTRADO en la posición " + posicion + ".");
            } else {
                JOptionPane.showMessageDialog(null, "El código " + codigo + " NO fue encontrado en el arreglo.");
            }
        }

        JOptionPane.showMessageDialog(null, "Búsquedas canceladas. El programa se ha cerrado correctamente.");

    }

}
