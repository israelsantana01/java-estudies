
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoTela {

    
    public static void main(String[] args) {
       Toolkit tk = Toolkit.getDefaultToolkit();
       Dimension d = tk.getScreenSize();
       System.out.println("A resolução do seu sistema é:" +d.width + "x" +d.height);
    }
    
}
