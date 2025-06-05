import Marvellous.PPA;
import Marvellous.LB;
import Marvellous.Infosystem.Python;

class PackageDemo
{
    public static void main(String A[])
    {
        System.out.println("Inside main of packageDemo");

        PPA pobj = new PPA();
        LB lobj = new LB();
        Python yobj = new Python();

        pobj.DisplayPPA();
        lobj.DisplayLB();
        yobj.DisplayPython();
    }
}