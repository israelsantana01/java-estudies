/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector01.pkg14;

/**
 *
 * @author shocker
 */
public class Vector0114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int number[] = {3, 2, 8, 7, 5, 4};
        
        for (int c = 0; c <= number.length-1; c += 1){
            System.out.println("In the position " + c + " we have the value " + number[c]);
        }
    }
    
}
