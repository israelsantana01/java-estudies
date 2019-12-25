package class05ab;

public class Main05
{

    public static void main(String[] args)
    {
        BankAccount p1 = new BankAccount();
        p1.setNumbCount(1111);
        p1.setOwner("Jubileu");
        p1.openCount("CA");

        BankAccount p2 = new BankAccount();
        p2.setNumbCount(2222);
        p2.setOwner("Creuza");
        p2.openCount("SA");

        p1.deposit(100);
        p2.deposit(500);
        p2.withDraw(100);

        p1.withDraw(150);
        p1.closeCount();

        System.out.println("------------");
        p1.CurrentState();
        System.out.println("------------");
        p2.CurrentState();
    }
}
