import java.util.Scanner;

abstract class RBI
{
    public String Country = "India";

    public void DisplayKYC()
    {
        System.out.println("Please submit your address proof and photo id");
    }

    abstract public void DisplayROI();
}

class SBI extends RBI
{
    public void DisplayROI()
    {
        System.out.println("Our ROI for FD is 7.5%");
    }
}
class BOM extends RBI
{
     public void DisplayROI()
    {
        System.out.println("Our ROI for FD is 8.5%");
    }
}


class AbstractDemo
{
    public static void main(String A[])
    {
        RBI robj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please select your bank");
        System.out.println("1 : state bank of india");
        System.out.println("2 : bank of maharashtra");
        int Option = sobj.nextInt();

        if(Option == 1)
        {
             robj = new SBI();  // up casting
        }
        else if (Option == 2)
        {
            robj = new BOM();  // up casting
        }

        System.out.println("Country is :"+robj.Country);

        robj.DisplayKYC();
        robj.DisplayROI();

    }
}           
