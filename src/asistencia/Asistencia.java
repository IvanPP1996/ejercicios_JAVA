package asistencia;

public class Asistencia {

    public static int contarPresentes(boolean[] arreglo, int registrados) {

        int total = 0;

        for (int i = 0; i < registrados; i++) {
            if (arreglo[i]) {
                total++;
            }
        }

        return total;
    }

    public static int contarAusentes(boolean[] arreglo, int registrados) {

        int total = 0;

        for (int i = 0; i < registrados; i++) {
            if (!arreglo[i]) {
                total++;
            }
        }

        return total;
    }

    public static double calcularPorcentaje(int presentes, int registrados) {

        if (registrados == 0) {
            return 0;
        }

        return (presentes * 100.0) / registrados;
    }
}
