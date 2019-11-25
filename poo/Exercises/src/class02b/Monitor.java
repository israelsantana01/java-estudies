package class02b;

public class Monitor {
    int tamanhodatela;
    String marca;
    int num$serie;
    boolean brilhobotao;
    
    void status() {
        if (this.brilhobotao == true) {
            System.out.println("Marca: " + this.marca);
            System.out.println("O monitor esta ligado");
        } else {
            System.out.println("Marca: " + this.marca);
            System.out.println("O monitor esta desligado");
        }
    }
    
    void apertabotao() {
        this.brilhobotao = true;
    }
    
    void tiradatomada() {
        this.brilhobotao = false;
    }
}
