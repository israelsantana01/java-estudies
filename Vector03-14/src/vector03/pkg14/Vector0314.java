/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector03.pkg14;

import java.util.Arrays;

/**
 *
 * @author shocker
 */
public class Vector0314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        double vector[] = {3, -3.4, -5, 678};
        Arrays.sort(vector);
        for (double value: vector){
            System.out.println(value + " ");
        }
    }    
}
