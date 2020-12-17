/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descendente;

import javax.swing.JOptionPane;

public class Descendente {

    public static void main(String[] args) {
        int fila, i, j;
        int columna;
        int suma = 0;

        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresa fila"));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingresa columna"));

        int[][] matriz = new int[3][3];

        for (i = 0; i < fila; i++) {
            for (j = 0; j < columna; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor[" + i + "] [" + j + "]"));
                suma = suma + matriz[i][j];
            }
        }
        for (i = 0; i < fila; i++) {

            for (j = 0; j < columna; j++) {
                JOptionPane.showMessageDialog(null, "los valores de la matriz :" + "[" + i + "] [" + j + "]: " + matriz[i][j] + "");
            }
        }
        JOptionPane.showMessageDialog(null, "la suma de los elementos de la matriz :" + suma);
    }
}
