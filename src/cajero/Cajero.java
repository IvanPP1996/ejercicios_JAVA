package cajero;

// Libreria para usar cuadro de dialogo
import javax.swing.JOptionPane;

public class Cajero {
    
    public static void consultarSaldo(double saldo) {

        JOptionPane.showMessageDialog(null, "Su saldo disponible es: $" + String.format("%,.2f", saldo));
    }

    public static double retirar(double saldo, double valor) {

        return saldo - valor;
    }

    public static double consignar(double saldo, double valor) {

        return saldo + valor;
    }

}
