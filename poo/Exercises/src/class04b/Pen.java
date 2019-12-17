package class04b;

public class Pen {

    private String model;
    private float tip;
    private String color;
    private boolean capped;

    public Pen(String m, String c, float t)
    { //This is construct method.
        this.model = m;
        this.color = c;
        this.setTip(t);
        this.cap();
    }

    public String getModel()
    {
        return this.model;
    }

    public void setModel(String m)
    {
        this.model = m;

    }

    public double getTip()
    {
        return this.tip;
    }

    public void setTip(float t)
    {
        this.tip = t;
    }

    public void cap()
    {
        this.capped = false;
    }
    
    

    public void status()
    {
        System.out.println("About the pen: ");
        System.out.println("Model: " + this.getModel());
        System.out.println("Tip: " + this.getTip());
        System.out.println("Color: " + this.color);
        System.out.println("Capped: " + this.capped);
    }
}
