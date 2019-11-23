/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author shocker
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int average, num, sum = 0;
        int nPair = 0;
        int nOdd = 0;
        int n100 = 0;
        int totVal = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: " + "<br><em>(valor 0 interrompe)</em></html>"));
            sum += num;
            if (num % 2 == 0) {
                nPair++;
            } else {
                nOdd++;
            }
            if (num > 100) {
                n100++;
            }
            if (num != 0) {
                totVal++;
            }
        } while (num != 0);
        average = sum + totVal;

        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Total dos valores: " + totVal +
                "<br>Total de pares: " + nPair + "<br>Total ímpares: " + nOdd + "<br>Acima de 100: " + n100 + "<br>Média dps valores: " + average);

    }
}
