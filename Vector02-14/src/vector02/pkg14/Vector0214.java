/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector02.pkg14;

import java.util.Arrays;

/**
 *
 * @author shocker
 */
public class Vector0214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int vector[] = {3, 7, 8, -10, -45};
        for (int value:vector){
            System.out.println(value);
        }
        System.out.println("");
        int p = Arrays.binarySearch(vector, 3);
        System.out.println("I find vector in the position " + p);
    }
    
}
