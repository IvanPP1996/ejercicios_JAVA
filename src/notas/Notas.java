package notas;

public class Notas {

    public static double promedio (double[] arr_notas) {

        double total = 0;

        for (int i = 0; i < arr_notas.length; i++) {
            total += arr_notas[i];
        }

        total /= arr_notas.length;
        return total;
    }

    public static int[] aprobados (double[] arr_notas) {

        int totalApro = 0;
        int totalRepro = 0;

        for (int i = 0; i < arr_notas.length; i++) {
            if (arr_notas[i] >= 3.0) {
                totalApro ++;
            } else {
                totalRepro ++;
            }
        }

        return new int[] {totalApro, totalRepro};
    }

}
