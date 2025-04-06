

package com.mycompany.exercicio12;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio12 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2: "));

        if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        } else {
            if (n1 > n2) {
                JOptionPane.showMessageDialog(null, "O número 1 é maior");
            } else {
                JOptionPane.showMessageDialog(null, "O número 2 é maior");
            }
        }

    }

}