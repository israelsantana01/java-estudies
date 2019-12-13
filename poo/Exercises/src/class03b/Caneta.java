package class03b;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Model: " + this.modelo);
        System.out.println("A pen: " + this.cor);
        System.out.println("Pont: " + this.ponta);
        System.out.println("Charge: " + this.carga);
        System.out.println("is it capped? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true)
        {
            System.out.println("ERROR! Cannot scribble");
        } else
        {
            System.out.println("I'm doodling!");
        }
    }

    public void destampar() {
        this.tampada = false;
    }

    private void tampar() {
        this.tampada = true;
    }
}
