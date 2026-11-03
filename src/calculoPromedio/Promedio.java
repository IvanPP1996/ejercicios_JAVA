package calculoPromedio;


public class Promedio {

    public static double promedioTemperaturas (double[] temp) {
        double total = 0;
        for (int i = 0; i < temp.length; i++) {
            total += temp[i];
        }

        total = total / temp.length;

        return total;
    }
}

