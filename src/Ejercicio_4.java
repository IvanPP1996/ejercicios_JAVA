// Libreria para usar cuadros de dialogo
import javax.swing.JOptionPane;
// Importando operaciones y sus metodos
import operaciones.*;

public class Ejercicio_4 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Programa para identificar las 4 operaciones basicas de la aritmetica con dos números.");

        String opcion = JOptionPane.showInputDialog("Seleccione la operación que desea realizar:\n1) Suma\n2) Resta\n3) Multiplicación\n4) División\n5) Salir");
        int opcionNumero = Integer.parseInt(opcion);

        while (opcionNumero != 5) {

            if (opcionNumero >= 1 && opcionNumero <= 5) {
                
                String num1 = JOptionPane.showInputDialog("Ingrese el primer número:");
                double num1Numero = Double.parseDouble(num1);
                
                String  num2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
                double num2Numero = Double.parseDouble(num2);
    
                if (opcionNumero == 1) {
                    
                    // método de suma
                    double total = Operaciones.suma(num1Numero, num2Numero);
                    
                    JOptionPane.showMessageDialog(null, "La suma de los números: " + num1Numero + " + " +  num2Numero + " = " + total);       
                } else if (opcionNumero == 2) {
    
                    // método de resta
                    double total = Operaciones.resta(num1Numero, num2Numero);
                    
                    JOptionPane.showMessageDialog(null, "La resta de los números: " + num1Numero + " - " +  num2Numero + " = " + total);       
                    
                } else if (opcionNumero == 3) {
                    
                    // método de multiplicacion
                    double total = Operaciones.multiplicacion(num1Numero, num2Numero);
                    
                    JOptionPane.showMessageDialog(null, "La multiplicación de los números: " + num1Numero + " * " +  num2Numero + " = " + total);  
    
                } else if (opcionNumero == 4) {
                    
                    // método de division
                    
                    if (num1Numero == 0) {
    
                        Operaciones.divison(num1Numero, num2Numero);
                        
                        JOptionPane.showMessageDialog(null, "¡¡¡OJO!!!\nEstas dividiendo entre 0:\n" + num1Numero + " / " + num2Numero + " = ERROR");
                    } else {
    
                        double total = Operaciones.divison(num1Numero, num2Numero);
    
                        JOptionPane.showMessageDialog(null, "La división de los números: " + num1Numero + " / " +  num2Numero + " = " + total);       
                    }
    
                } else if (opcionNumero == 5) {
                    
                    break;
    
                }
            } else {
                opcion = JOptionPane.showInputDialog("Ingrese una opción valdia recuerde:\n1) Suma\n2) Resta\n3) Multiplicación\n4) División\n5) Salir");
                opcionNumero = Integer.parseInt(opcion);
                continue;
            }
            

            opcion = JOptionPane.showInputDialog("Deseas realizar otra operación:\n1) Suma\n2) Resta\n3) Multiplicación\n4) División\n5) Salir");
            opcionNumero = Integer.parseInt(opcion);
        }

        JOptionPane.showMessageDialog(null, "El programa a cerrado correctamente gracias.\nVuelve pronto.");
    }

}
