package productos;

public class Productos {
    
    public static int numerosIgualesCero(int[] arr_productos) {

        int contador = 0;

        for (int i = 0; i < arr_productos.length; i++) {
            if (arr_productos[i] == 0) {
                contador += 1;
            }
        }
        return contador;
    }
    public static int unidadesTotal(int[] arr_productos) {
        int suma = 0;

        for (int i = 0; i < arr_productos.length; i++) {
            suma += arr_productos[i];
        }
        return suma;
    }

}
