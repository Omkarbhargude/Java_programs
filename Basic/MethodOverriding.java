class Base
{
  public void Fun()
  { System.out.println("Base fun");}
  public void Gun()
  { System.out.println("Base gun");}
  public void Sun()
  { System.out.println("Base sun");}
}

class Derived extends Base
{
    public void Fun()
    { System.out.println("Derived fun");}
    public void Run()
    { System.out.println("Derived Run");}

}


class MethodOverriding
{
    public static void main(String A[])
    {
        //Base bobj1 = new Base();   // no casting
        //Derived dobj1 = new Derived(); // no casting
       // Derived dobj2 = new Base();   // Down casting NOT ALLOWED //Error//

        Base bobj2 = new Derived();    // up casting for overriding

        bobj2.Fun(); //Derived fun
        bobj2.Gun(); // base gun
        bobj2.Sun(); // base sun
       // bobj2.Run(); // error


    }
}