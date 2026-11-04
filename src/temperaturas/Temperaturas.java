package temperaturas;

import java.util.Arrays;

public class Temperaturas {

    public static double promedioTemperaturas (double[] temp) {
        double total = 0;
        for (int i = 0; i < temp.length; i++) {
            total += temp[i];
        }

        total = total / temp.length;

        return total;
    }
    public static double[] temperaraturaAltaBaja (double[] temp) {
        Arrays.sort(temp);

        double menor = temp[0];
        double mayor = temp[temp.length - 1];

        return new double[] {menor, mayor};
    }
}

