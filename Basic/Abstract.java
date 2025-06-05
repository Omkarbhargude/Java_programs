import java.util.*;

abstract class SBI
{
    public String Country = "INDIA";

    public void DisplayKYC()
    {
        System.out.println("---Please submit your ID proof---");
    }

    abstract public void DisplayROI();
}

class RBI extends SBI
{
    public void DisplayROI()
    {
        System.out.println("Our Rate of interest for housing loan is 8.57%");
    }
}
class BOM extends SBI
{
    public void DisplayROI()
    {
        System.out.println("Our Rate of interest for housing loan is 7.89%");
    }
}

class Abstract
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        SBI obj = null;
        
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------WELCOME TO OUR APPLICATION----------------");
        System.out.println("---------------------------------------------------------");

        
        System.out.println("--Please Select anyone of the option below-- ");
        System.out.println("1:- Reserve Bank of india");
        System.out.println("2:- Bank of Maharashtra");
        int Option = sobj.nextInt();

        if(Option == 1)
        {
            obj = new RBI();
        }
        else
        {
            obj = new BOM();
        }

        System.out.println("Country = "+obj.Country);

        obj.DisplayKYC();
        obj.DisplayROI();

    }
}