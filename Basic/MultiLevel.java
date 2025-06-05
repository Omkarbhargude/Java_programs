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
        System.out.println("Inside Gun of Derived");
    }
}
class DerivedX extends Derived
{
    public int L,M;
    public DerivedX()
    {
        System.out.println("Inside derivedX constructor");
    }
    public void Sun()
    {
        System.out.println("Inside Sun of DerivedX");
    }
}

class MultiLevel
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        DerivedX dobj = new DerivedX();

        dobj.Fun(); // base fun
        dobj.Gun(); // derived gun
        dobj.Sun(); // derivedX sun

    }
}