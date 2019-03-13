package PacoteJava;

import javax.swing.*;

public class ExemploJOP {

    public static void main(String[] args) {
        String nome, aux;
        int idade;
        
        nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
        
        aux = JOptionPane.showInputDialog(null, "Insira a sua idade");
        idade = Integer.parseInt(aux);

        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
        JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + " anos.");
    }
}
