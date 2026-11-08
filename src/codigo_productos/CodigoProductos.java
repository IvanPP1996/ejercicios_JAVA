package codigo_productos;

public class CodigoProductos {
    
    public static int buscarCodigo(int[] arreglo, int codigo) {

        int posicion = -1;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == codigo) {
                posicion = i;
                break; 
            }
        }

        return posicion;
    }

}
