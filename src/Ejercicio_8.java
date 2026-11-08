// Libreria para usar cuadros de dialogo
import javax.swing.JOptionPane;
// Importando numeros y sus metodos
import numeros.*;

public class Ejercicio_8 {
 
    public static void main(String[] args) {
        
        int[] numeros = new int[15];

        int registrados = 0;

        JOptionPane.showMessageDialog(null, "Programa para separar números pares e impares.");

        while (registrados < 15) {

            String entrada = JOptionPane.showInputDialog("Número " + (registrados + 1) + " de 15:\n'Ingrese 999 para terminar la captura'");

            // Si el usuario cancela o cierra el cuadro de diálogo
            if (entrada == null) {
                break;
            }

            entrada = entrada.trim();

            // Si deja el campo vacío, se vuelve a pedir
            if (entrada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
                continue;
            }

            int numero = Integer.parseInt(entrada);

            // Si ingresa 999, termina la captura
            if (numero == 999) {
                break;
            }

            // Si es negativo, no se almacena y se vuelve a pedir
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "No se permiten números negativos. Intente de nuevo.");
                continue;
            }

            numeros[registrados] = numero;
            registrados++;
        }

        if (registrados == 0) {

            JOptionPane.showMessageDialog(null, "No se almaceno ningún número.");

        } else {

            // Mostrar los números almacenados
            Numeros.mostrarNumeros(numeros, registrados);

            int pares = Numeros.contarPares(numeros, registrados);
            int impares = Numeros.contarImpares(numeros, registrados);
            int sumaPares = Numeros.sumarPares(numeros, registrados);
            int sumaImpares = Numeros.sumarImpares(numeros, registrados);

            JOptionPane.showMessageDialog(null, "RESUMEN\n\n"
                    + "Números almacenados: " + registrados + "\n"
                    + "Cantidad de números pares: " + pares + "\n"
                    + "Cantidad de números impares: " + impares + "\n"
                    + "Suma de los números pares: " + sumaPares + "\n"
                    + "Suma de los números impares: " + sumaImpares);
        }

        JOptionPane.showMessageDialog(null, "El programa se ha cerrado correctamente.");

    }
    
}
