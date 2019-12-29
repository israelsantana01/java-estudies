package class06b;

public class RemoteControl implements Controller {

    //Atributes
    private int volume;
    private boolean on;
    private boolean touching;

    //Special Methods
    public RemoteControl()
    {
        this.volume = 50;
        this.on = true;
        this.touching = false;
    }

    private int getVolume()
    {
        return volume;
    }

    private boolean getOn()
    {
        return on;
    }

    private boolean getTouching()
    {
        return touching;
    }

    private void setVolume(int volume)
    {
        this.volume = volume;
    }

    private void setOn(boolean on)
    {
        this.on = on;
    }

    private void setTouching(boolean touching)
    {
        this.touching = touching;
    }

    //Abstract Methods
    @Override
    public void turnOn()
    {
        this.setOn(true);
    }

    @Override
    public void turnOff()
    {
        this.setOn(false);
    }

    @Override
    public void openMenu()
    {
        if (this.getOn()) {
            System.out.println("-------MENU------");
            System.out.println("Is it on? " + this.getOn());
            System.out.println("Is it touching? " + this.getTouching());
            System.out.print("Volume: " + this.getVolume());

            for (int i = 0; i < this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println("");
        } else {
            System.out.println("The control is off!");
        }
    }

    @Override
    public void closeMenu()
    {
        System.out.println("Close menu....");
    }

    @Override
    public void moreVolume()
    {
        if (this.getOn()) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void lessVolume()
    {
        if (this.getOn()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossible decrease volume");
        }
    }

    @Override
    public void muteOn()
    {
        if (this.getOn() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void muteOff()
    {
        if (this.getOn() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play()
    {
        if (this.getOn() && this.getTouching()) {
            this.setOn(true);
        } else {
            System.out.println("Cannot play");
        }
    }

    @Override
    public void pause()
    {
        if (this.getOn() && this.getTouching()) {
            this.setTouching(false);
        } else {
            System.out.println("Cannot pause");
        }
    }

}
