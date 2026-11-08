package energia;

public class Energia {
    
    public static double consumoTotal(double[] arreglo, int registrados) {

        double total = 0;

        for (int i = 0; i < registrados; i++) {
            total += arreglo[i];
        }

        return total;
    }

    public static double consumoPromedio(double[] arreglo, int registrados) {

        if (registrados == 0) {
            return 0;
        }

        return consumoTotal(arreglo, registrados) / registrados;
    }

    public static int contarSuperanLimite(double[] arreglo, int registrados) {

        int contador = 0;

        for (int i = 0; i < registrados; i++) {
            if (arreglo[i] > 150) {
                contador++;
            }
        }

        return contador;
    }

}
