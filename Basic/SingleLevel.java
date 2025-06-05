class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Inside base constructor");
    }
    public void Fun()
    {
        System.out.println("Inside fun of base");
    }

}

class Derived extends Base  // in cpp class Derived : public Base 
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Inside derived constructor");
    }
    public void Gun()
    {
        System.out.println("Inside Gun of base");
    }


}


class SingleLevel
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        Derived dobj = new Derived();

        dobj.Fun();
        dobj.Gun();

    }
}