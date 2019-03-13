package PacoteJava.CalculadoraSimples;

import javax.swing.*;

public class Entrada {

    public static void main(String[] args) {
        entrada();

    }

    public static void entrada() {

        String aux;
        double num1, num2, result;
        int op;

        try {

            aux = JOptionPane.showInputDialog(null, "Digite um número para ser calculado: ");
            if (aux.equals("")) {
                JOptionPane.showMessageDialog(null, "Valor Inválido");
                entrada();
            }
            num1 = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Digite outro número para ser calculado: ");
            if (aux.equals("")) {
                JOptionPane.showMessageDialog(null, "Valor Inválido");
                entrada();
            }
            num2 = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Selecione qual operação matemática você deseja digitando:\n"
                    + " 1 - para Soma \n"
                    + " 2 - para Subtração \n"
                    + " 3 - para Multiplicação \n"
                    + " 4 - para Divisão");

            if (aux.equals("")) {
                JOptionPane.showMessageDialog(null, "Valor Inválido");
                entrada();
            }
            op = Integer.parseInt(aux);

            /*if (op > 0 && op < 5) {

                if (op == 1) {
                    Operacoes.somaValor(num1, num2);
                }

                if (op == 2) {
                    Operacoes.subtraiValor(num1, num2);
                }

                if (op == 3) {
                    Operacoes.multiplicaValor(num1, num2);
                }

                if (op == 4) {
                    Operacoes.divideValor(num1, num2);
                }*/
            switch (op) {
                case 1:
                    Operacoes.somaValor(num1, num2);
                    break;
                case 2:
                    Operacoes.somaValor(num1, num2);
                    break;
                case 3:
                    Operacoes.somaValor(num1, num2);
                    break;
                case 4:
                    Operacoes.somaValor(num1, num2);
                    break;

            }

            /*} else {
                JOptionPane.showMessageDialog(null, "Valor Inválido");
                entrada();
            }*/
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");
            
        }
    }

}
