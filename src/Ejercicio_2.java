// Para implementar metodos de los arrays
import java.util.Arrays;
// Para implementar por cuadro de dialogo
import javax.swing.JOptionPane;
// importando productos y sus metodos
import productos.*;

public class Ejercicio_2 {
     
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Programa para de inventario de x productos ingresados.");

        String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad de productos que quiere registrar: ");
        int cantidadNumero = Integer.parseInt(cantidad);

        int contador = 0;

        // arreglo definido con su tamaño
        int[] productos = new int[cantidadNumero];

        for (int i = 0; i < productos.length; i++) {
            String producto = JOptionPane.showInputDialog("Ingrese la cantidad del producto #" + (i + 1) + "\nde " + cantidadNumero + " productos:");
            int productoNumero = Integer.parseInt(producto);

            if (productoNumero == -1) {
                // Cambio el tamaño del arreglo con la variable contador
                productos = Arrays.copyOf(productos, contador);
                break;
            } else if (productoNumero <= -2) {
                continue;
            } else {
                productos[contador] = productoNumero;
                contador += 1;
            }

        }
        
        productos = Arrays.copyOf(productos, contador);

        //Arreglo con datos
        String productosString = Arrays.toString(productos);

        //Productos iguales a 0
        int total = Productos.numerosIgualesCero(productos);

        //Sua total de todos los productos
        int cantidadProductos = Productos.unidadesTotal(productos);

        JOptionPane.showMessageDialog(null, "1) El arreglo de productos es: " + productosString + "\n2) La cantidad e productos 0 es de: " + total + "\n3) La cantidad de unidades de productos que hay es de: " + cantidadProductos);
    }
}
