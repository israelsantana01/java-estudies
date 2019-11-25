package class02b;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status()
    {
        System.out.println("Model: " + this.modelo);
        System.out.println("A pen: " + this.cor);
        System.out.println("Pont: " + this.ponta);
        System.out.println("Charge: " + this.carga);
        System.out.println("is it capped? " + this.tampada);
    }

    void rabiscar()
    {
        if (this.tampada == true) {
            System.out.println("ERROR! Cannot scribble");
        } else {
            System.out.println("I'm doodling!");
        }
    }

    void destampar()
    {
        this.tampada = false;
    }

    void tampar()
    {
        this.tampada = true;
    }
}
