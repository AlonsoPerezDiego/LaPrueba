
package rectangulo;

import javax.swing.JOptionPane;


public class Rectangulo {

 //El área viene dada en cm²
    
    public static void main(String[] args) {
        float base;
        float altura;
        base = Float.parseFloat(JOptionPane.showInputDialog("base "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("altura "));
                System.out.println("área rectangulo de base " + base + "cm e altura " + altura + "cm = " + base * altura + "cm²");
                //Despues de introducir los datos da el resultado 
    }
    
}
