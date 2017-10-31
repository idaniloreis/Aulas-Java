package javaapplication3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication3 {

    public static void main(String[] args) {
        modAdicao();
    }

    static void modAdicao() {
        Scanner sc = new Scanner(System.in);

        double v1;
        double v2;
        double res;

        /* System.out.print("Digite o primeiro valor"); */
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor"));

       /*  System.out.print("Digite o segundo valor"); */
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor"));

       /* v2 = sc.nextDouble(); */

        res = v1 + v2;
        
        JOptionPane.showMessageDialog(null, res);

        /* System.out.print("Soma = " + res); */

    }

}
