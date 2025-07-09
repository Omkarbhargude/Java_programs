/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Name : Singly Circular Linkedlist
// Description : Implementing Singly Circular linkedlist in Java with function like insertion, deletion and traversal.
// Input : Integer
// Output : Integer
// Author : Omkar Mahadev Bhargude
// Date : 09/07/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class node
{
    public int data;
    public node next;
}

class SinglyCLL
{
    private node first;
    private node last;
    private int iCount;

    public SinglyCLL()
    {
        first = null;
        last = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = null;

        newn =  new node();

        newn.data = no;
        newn.next = null;

        if(first == null && last == null)
        {
            first = newn;
            last = newn;

            last.next = first;
        }
        else
        {
            newn.next = first;
            first = newn;
        }

        last.next = first;

        iCount++;
    }

    public void InsertLast(int no)
    {
        node newn = null;

        newn =  new node();

        newn.data = no;
        newn.next = null;

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            last = newn;
        }

        last.next = first;
        iCount++;
    }

    public void DeleteFirst()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
            last.next = first;  
        }

        iCount--;
    }

    public void DeleteLast()
    {
        node temp = null;

        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            temp = first;

            while(temp.next.next != first)
            {
                temp = temp.next;
            }

            last = temp;
            last.next = null;

            last.next = first;
        }

        iCount--;
    }

    public void InsertAtPos(int no, int pos)
    {
        int iCnt = 0;
        node newn = null;
        node temp = null;

        if((pos < 1) || (pos > iCount+1))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(pos == 1)
        {
            InsertFirst(no);
        }
        else if(pos == iCount+1)
        {
            InsertLast(no);
        }
        else
        {
            newn = new node();
            newn.data = no;
            newn.next = null;

            temp = first;

            for(iCnt = 1; iCnt < pos-1; iCnt++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;

            iCount++;
        }
    }

    public void DeleteAtPos(int pos)
    {
        int iCnt = 0;
        node temp = null;
        node target = null;
        
        if((pos < 1) || (pos > iCount))
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            DeleteFirst();
        }
        else if(pos == iCount)
        {
            DeleteLast();
        }
        else
        {
            temp = first;

            for(iCnt = 1; iCnt < pos-1; iCnt++)
            {
                temp = temp.next;
            }

            target = temp.next;

            temp.next = target.next;

            target = null;

            iCount--;
        }
    }

    public void Display()
    {
        node temp = null;

        if(first == null && last == null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        temp = first;

        do
        {
            System.out.print(" | "+temp.data+" | -> ");

            temp = temp.next;
        
        }while(temp != first);

        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }
}


class SinglyCircular
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        SinglyCLL scobj = new SinglyCLL();

        int iRet = 0;
        int iPos = 0;
        int iValue = 0;
        int iChoice = 1;


        System.out.println("========================================================================");
        System.out.println("====================== Singly Circular Linkedlist ======================");
        System.out.println("========================================================================\n");

        while(iChoice != 0)
        {
            System.out.println("\n========================================================================");
            System.out.println("------------------------- Select the Option ----------------------------");
            System.out.println("========================================================================");
            System.out.println("1 : Insert new node at first position");
            System.out.println("2 : Insert new node at last position");
            System.out.println("3 : Insert new node at given position");
            System.out.println("4 : Delete the node at first position");
            System.out.println("5 : Delete the node at last position");
            System.out.println("6 : Delete the node at given position");
            System.out.println("7 : Display elements from linkedlist");
            System.out.println("8 : Count the elements from linkedlist");
            System.out.println("0 : Terminate the application");
            System.out.println("========================================================================\n");

            System.out.println("Enter the option : ");
            iChoice = sobj.nextInt();
            System.out.println("-------------------------------------------------------------------------");

            switch(iChoice)
            {
                case 1:
                    
                    System.out.println("Enter the data that you want to insert : ");
                    iValue = sobj.nextInt();
                    scobj.InsertFirst(iValue);
                    break;

                case 2:
                    
                    System.out.println("Enter the data that you want to insert : ");
                    iValue = sobj.nextInt();
                    scobj.InsertLast(iValue);
                    break;

                case 3:

                    System.out.println("Enter the data : ");
                    iValue = sobj.nextInt();
                    System.out.println("Enter the Position : ");
                    iPos = sobj.nextInt();

                    scobj.InsertAtPos(iValue,iPos);
                    break;

                case 4:
                    
                    System.out.println("Deleting first element....");
                    scobj.DeleteFirst();
                    break;

                case 5:

                    System.out.println("Deleting last element : ");
                    scobj.DeleteLast();
                    break;

                case 6:

                    System.out.println("Enter the position : ");
                    iPos = sobj.nextInt();
                    scobj.DeleteAtPos(iPos);
                    break;

                case 7:

                    System.out.println("Elements from linkedlist are : \n");
                    scobj.Display();
                    break;

                case 8:
                    
                    iRet = scobj.Count();
                    System.out.println("Number of elements are : "+iRet);
                    break;

                case 0:

                    System.out.println("--------------- Thanks for using our application -------------");
                    return;

                default:

                    System.out.println("Invalid Option");
                    break;

            }
        }

    }
}
