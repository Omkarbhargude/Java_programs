class Base
{
    public int x,y;
    public Base(int a , int b)
    {
        this.x = a;
        this.y = b;
    }

    public void Fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base
{
    public int x,y;

    public Derived()
    {
        super(11,21); // use 1
        this.x = 51;
        this.y = 101;
    }

    public void Fun()
    {
        super.Fun(); // use 2
        System.out.println("Inside derived fun");
        System.out.println("Value of x is:"+x);
        System.out.println("Value of x using super keyword:"+super.x);
    
    }

}


class SuperDemo
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        dobj.Fun();

    }
}