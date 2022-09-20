package digitos;
import javax.swing.JOptionPane;
public class Proceso {
    public static void unirDigitos() {
            String repetir;
            do {
                int entero = 0, lim;
                String digito = "a";
                int entero1 = 0, lim1;
                String digito1 = "a";
                while (!"F".equals(digito)) {
                    digito = JOptionPane.showInputDialog("Ingrese un solo digito a la vez.(Para marcar que el numero contiene decimales, ultilice el punto y para terminar el numero ingrese F) ");
                    if ("F".equals(digito)) {
                        digito1 = "F";
                    } else {
                        if (!".".equals(digito)) {
                            lim = Integer.parseInt(digito);
                            if (lim >= 0 && lim <= 9) {
                                entero = (entero * 10) + lim;
                            }
                        } else {
                            digito = "F";
                        }
                    }
                }
                while (!"F".equals(digito1)) {
                    digito1 = JOptionPane.showInputDialog("Ingrese un solo digito a la vez.(¡Usted esta ingresando numeros decimales!. Para terminar el numero ingrese F)  ");
                    if (!"F".equals(digito1)) {
                        if (!".".equals(digito1)) {
                            lim1 = Integer.parseInt(digito1);
                            if (lim1 >= 0 && lim1 <= 9) {
                                entero1 = entero1 * 10 + lim1;
                            }
                        } else {
                            digito1 = "F";
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Su numero es: " + entero + "." + entero1);
                repetir = JOptionPane.showInputDialog("¿Desea volver a crear otro numero? S/N ");
            } while ("S".equals(repetir) || "s".equals(repetir));
        }  
}
