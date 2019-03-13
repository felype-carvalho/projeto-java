
package PacoteJava.CalculadoraSimples;

import javax.swing.*;


public class Operacoes {
    
    public static double somaValor (double num1, double num2) {
        double aux;
        String op = "soma";
        aux = num1 + num2;
        Resposta.resultado(aux, num1, num2, op);
        return (num1 + num2);
    }
    
    public static double subtraiValor (double num1, double num2) {
        double aux;
        String op = "subtração";
        aux = num1 - num2;
        Resposta.resultado(aux, num1, num2, op);
        return (num1 - num2);
    }
    
    public static double multiplicaValor (double num1, double num2) {
        double aux;
        String op = "multiplicação";
        aux = num1 * num2;
        Resposta.resultado(aux, num1, num2, op);
        return (num1 * num2);
    }
    
    public static double divideValor (double num1, double num2) {
        
        double aux;
        String op = "divisão";
        if (num2 == 0.0) {
            JOptionPane.showMessageDialog(null ,"Valor Inválido, é imposivel dividir por 0.");
            Entrada.entrada();
        } else if(num1 == 0.0) {
            aux = 0;
            Resposta.resultado(aux, num1, num2, op);
        } else {
            aux = num1 / num2;
            Resposta.resultado(aux, num1, num2, op);
        }
        
        return (num1 / num2);
    }
    
}
