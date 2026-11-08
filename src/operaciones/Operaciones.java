package operaciones;

public class Operaciones {

    public static double suma (double num1, double num2) {

        return num1 + num2;
        
    }
    
    public  static double resta (double num1, double num2) {
        
        return num1 - num2;
    }

    public  static double multiplicacion (double num1, double num2) {
        
        return num1 * num2;
    }

    public  static double divison (double num1, double num2) {
        
        if (num1 != 0) {
            return num1 / num2;
        } else {
            return num1;
        }
    }
    
}
