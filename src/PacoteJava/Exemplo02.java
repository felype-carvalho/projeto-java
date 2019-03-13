
package PacoteJava;

public class Exemplo02 {
    
    static boolean flag;
    static final double pi = 3.141592653591412;
    
    public static void main(String[] args) {
        double num1 = 15.5, num2=20.0, resp=0.0;
        flag = false;
        valores();
        
        resp = num1 + num2 * pi;
    }
    
    public static void valores(){
        double num1 = 50.0;
        flag = true;
    }
}
