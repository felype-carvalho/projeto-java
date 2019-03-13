
package PacoteJava;

import javax.swing.*;

public class SomaNumeros {
    public static void main(String[] args) {
        String aux;
        double num1, num2, result=0.0;
        
        aux = JOptionPane.showInputDialog(null, "Digite um número para a soma: ");       
        num1 = Double.parseDouble(aux);
 
        aux = JOptionPane.showInputDialog(null, "Digite outro número para a soma: ");
        num2 = Double.parseDouble(aux);
        
        result = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "A soma deu: " + result);

        
    }
    
}
