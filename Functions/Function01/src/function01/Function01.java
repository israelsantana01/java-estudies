/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function01;

/**
 *
 * @author shocker
 */
public class Function01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Fatorial01 fat1 = new Fatorial01();
        fat1.setValor(5);
        System.out.println(fat1.getFormula());
        System.out.println(fat1.getFatorial());
    }
    
}
