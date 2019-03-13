
package PacoteJava.CalculadoraSimples;

import javax.swing.*;

public class Resposta {
    public static void resultado (double aux, double num1, double num2, String op) {
        double resp;
        
        resp = aux;
        
        JOptionPane.showMessageDialog(null ,"A " + op + " entre " + num1 + " e " + num1 + " é igual à " + aux );
        Entrada.entrada();
    }
    
}
