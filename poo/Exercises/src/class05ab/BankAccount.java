package class05ab;

public class BankAccount
{

    public int numbcount;
    protected String type; //SA - Savings account and CA - Checking account
    private String owner;
    private double balance;
    private boolean status;

    //Construct
    public BankAccount()
    {
        this.balance = 0.0;
        this.status = false;
    }

    //Special Methods - GET
    public int getNumbCount()
    {
        return numbcount;
    }

    public String getType()
    {
        return type;
    }

    public String getOwner()
    {
        return owner;
    }

    public double getBalance()
    {
        return balance;
    }

    public boolean getStatus()
    {
        return status;
    }

    //Special Methods - SET
    public void setNumbCount(int numbcount)
    {
        this.numbcount = numbcount;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    //Methods
    public void CurrentState()
    {
        System.out.println("Account: " + this.numbcount);
        System.out.println("Type: " + this.type);
        System.out.println("Owner: " + this.owner);
        System.out.println("Funds: " + this.balance);
        System.out.println("Status: " + this.status);
    }

    public void openCount(String type)
    {
        this.type = type;
        this.status = true;
        if (type.equals("CA")) {
            this.balance += 50.0;
        } else {
            this.balance += 150.0;
        }
        System.out.println("Open account succes");
    }

    public void closeCount()
    {
        if (this.balance > 0) {
            System.out.println("Account with money!");
        } else if (this.balance < 0) {
            System.out.println("Account in debit!");
        } else {
            this.status = false;
            System.out.println("Close account success");
        }
    }

    public void deposit(double value)
    {
        if (this.status) {
            this.balance += value;
            System.out.println("Deposit realized in account of  " + this.owner);
        } else {
            System.out.println("Impossible to deposit");
        }
    }

    public void withDraw(double value)
    {
        if (this.status) {
            if (this.balance >= value) {
                this.balance -= value;
                System.out.println("Withdraw realized in account of " + this.owner);
            } else {
                System.out.println("Insufficient funds for withdraw");
            }
        } else {
            System.out.println("Impossible withdraw in close account");
        }
    }

    public void monthlyPay()
    {
        double pay = 0;
        if (this.type.equals("CA")) {
            pay = 12.0;
        } else if (this.type.equals("CS")) {
            pay = 20;
        }
        if (this.status) {
            this.balance -= pay;
            System.out.println("Paid success");
        } else {
            System.out.println("Impossible to pay!");
        }
    }
}
