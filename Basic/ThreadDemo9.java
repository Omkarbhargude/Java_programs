class BankAccount
{
    private int Balance = 1000;

    public  synchronized void Withdraw(int Amount) //sychronized
    {
        if(Amount <= Balance)
        {
            System.out.println(Thread.currentThread().getName()+" successfully withdraw");
            Balance = Balance - Amount;
            System.out.println("Balance Amount is :"+Balance);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+" unable to withdraw");
        }
    }

}

class Customer extends Thread
{
    public BankAccount bobj;

    public Customer(BankAccount obj, String Name)
    {
        super (Name);
        this.bobj = obj;
    }
    public void run()
    {
        bobj.Withdraw(800);
    }

}



class ThreadDemo9
{
    public static void main(String A[]) throws Exception
    {
        BankAccount bobj = new BankAccount();

        Customer cobj1 = new Customer(bobj,"Sagar");
        Customer cobj2 = new Customer(bobj,"Sumit");

        cobj1.start();
        cobj2.start();

        cobj1.join();
        cobj2.join();

        System.out.println("End of banking application");

    }
}