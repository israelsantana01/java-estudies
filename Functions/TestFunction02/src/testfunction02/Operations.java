/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfunction02;

/**
 *
 * @author shocker
 */
public class Operations {
   public static String contador (int i, int f){
        String s = "";
        for (int c = i; c <= f; c += 1){
            s += c + " ";
        }
        return s;
    }       
}
