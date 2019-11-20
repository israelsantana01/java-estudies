/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector02.pkg14;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

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
       //Calendar calend = GregorianCalendar.getInstance();
       //int year = calend.get(Calendar.YEAR);
       Scanner keyboard = new Scanner(System.in);
        System.out.print("Type it a year: ");
       int year = keyboard.nextInt();
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                        System.out.println("The year is leap!");
                        
                        String month[] = {"January", "February", "March", "Mayo", "June", "July", "August",
                            "September", "October", "November", "December"};
                    int total[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                    
                    for (int c = 0; c < month.length; c += 1) {
                        System.out.println(" The month of " + month[c] + " have " + total[c] + " days in all ");
                    }
                } else {
                    System.out.println("The year is not leap!");
                    
                    String month[] = {"January", "February", "March", "Mayo", "June", "July", "August",
                        "September", "October", "November", "December"};
                    
                    int total[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

                    for (int c = 0; c < month.length; c += 1) {
                        System.out.println(" The month of " + month[c] + " have " + total[c] + " days in all ");
                    }
                }
    }   
}
