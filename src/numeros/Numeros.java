package numeros;

// Libreria para usar cuadro de dialogo
import javax.swing.JOptionPane;

public class Numeros {
    
    public static int contarPares(int[] arreglo, int registrados) {

        int contador = 0;

        for (int i = 0; i < registrados; i++) {
            if (arreglo[i] % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    public static int contarImpares(int[] arreglo, int registrados) {

        int contador = 0;

        for (int i = 0; i < registrados; i++) {
            if (arreglo[i] % 2 != 0) {
                contador++;
            }
        }

        return contador;
    }

    public static int sumarPares(int[] arreglo, int registrados) {

        int suma = 0;

        for (int i = 0; i < registrados; i++) {
            if (arreglo[i] % 2 == 0) {
                suma += arreglo[i];
            }
        }

        return suma;
    }

    public static int sumarImpares(int[] arreglo, int registrados) {

        int suma = 0;

        for (int i = 0; i < registrados; i++) {
            if (arreglo[i] % 2 != 0) {
                suma += arreglo[i];
            }
        }

        return suma;
    }

    public static void mostrarNumeros(int[] arreglo, int registrados) {

        String lista = "NÚMEROS ALMACENADOS\n\n";

        for (int i = 0; i < registrados; i++) {
            if (arreglo[i] % 2 == 0) {
                lista += arreglo[i] + " (par)\n";
            } else {
                lista += arreglo[i] + " (impar)\n";
            }
        }

        JOptionPane.showMessageDialog(null, lista);
    }
}
