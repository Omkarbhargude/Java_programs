/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Name : Singly Linear Linkedlist
// Description : Implementing Singly linear linkedlist in Java with function like insertion, deletion and traversal.
// Input : Integer
// Output : Integer
// Author : Omkar Mahadev Bhargude
// Date : 09/07/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class node
{
    public int data;
    public node next;
}

class SinglyLL
{
    private node first;
    private int iCount;

    public SinglyLL()
    {
        first = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = null;

        newn = new node();

        newn.data = no;
        newn.next = null;

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }

        iCount++;
    }

    public void InsertLast(int no)
    {
        node newn = null;
        node temp = null;

        newn = new node();

        newn.data = no;
        newn.next = null;

        if(first == null)
        {
            first = newn;
        }
        else
        {
            temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }

        iCount++;
    }

    public void DeleteFirst()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            first = first.next;
        }

        iCount--;
    }

    public void DeleteLast()
    {
        node temp = null;

        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            temp = first;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
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
            System.out.println("Invalid position");
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

        if((pos < 1) || (pos > iCount))
        {
            System.out.println("Invalid Position");
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

            temp.next = temp.next.next;

            iCount--;
        }
    }

    public void Display()
    {
        node temp = null;

        if(first == null)
        {
            System.out.println("Linked list is empty");
            return;
        }

        temp = first;

        while(temp != null)
        {
            System.out.print(" | "+temp.data+" | -> ");

            temp = temp.next;
        }

        System.out.println(" null ");
    }

    public int Count()
    {
        return iCount;
    }
}

class SinglyLinear
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        SinglyLL slobj = new SinglyLL();

        int iRet = 0;
        int iPos = 0;
        int iValue = 0;
        int iChoice = 1;


        System.out.println("========================================================================");
        System.out.println("====================== Singly Linear Linkedlist ========================");
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
                    slobj.InsertFirst(iValue);
                    break;

                case 2:
                    
                    System.out.println("Enter the data that you want to insert : ");
                    iValue = sobj.nextInt();
                    slobj.InsertLast(iValue);
                    break;

                case 3:

                    System.out.println("Enter the data : ");
                    iValue = sobj.nextInt();
                    System.out.println("Enter the Position : ");
                    iPos = sobj.nextInt();

                    slobj.InsertAtPos(iValue,iPos);
                    break;

                case 4:
                    
                    System.out.println("Deleting first element....");
                    slobj.DeleteFirst();
                    break;

                case 5:

                    System.out.println("Deleting last element : ");
                    slobj.DeleteLast();
                    break;

                case 6:

                    System.out.println("Enter the position : ");
                    iPos = sobj.nextInt();
                    slobj.DeleteAtPos(iPos);
                    break;

                case 7:

                    System.out.println("Elements from linkedlist are : ");
                    slobj.Display();
                    break;

                case 8:
                    
                    iRet = slobj.Count();
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