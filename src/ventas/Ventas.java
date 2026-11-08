package ventas;

public class Ventas {
    
    public static double totalVendido(double[] arreglo, int registrados) {

        double total = 0;

        for (int i = 0; i < registrados; i++) {
            total += arreglo[i];
        }

        return total;
    }

    public static int contarDiasConVentas(double[] arreglo, int registrados) {

        int contador = 0;

        for (int i = 0; i < registrados; i++) {

            if (arreglo[i] == 0) {
                continue; // Este día no cuenta como día con ventas
            }

            contador++;
        }

        return contador;
    }


    public static double promedioVentas(double[] arreglo, int registrados) {

        double suma = 0;
        int diasConVentas = 0;

        for (int i = 0; i < registrados; i++) {

            if (arreglo[i] == 0) {
                continue;
            }

            suma += arreglo[i];
            diasConVentas++;
        }

        if (diasConVentas == 0) {
            return 0;
        }

        return suma / diasConVentas;
    }

    public static int diaMayorVenta(double[] arreglo, int registrados) {

        int posicionMayor = 0;

        for (int i = 1; i < registrados; i++) {

            if (arreglo[i] > arreglo[posicionMayor]) {
                posicionMayor = i;
            }
        }

        return posicionMayor;
    }

}
