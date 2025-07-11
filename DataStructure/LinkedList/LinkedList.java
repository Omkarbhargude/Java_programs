///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Name : LinkedList 
// Description : Implementing all type of linkedlist in Java with operations like Insertion, Deletion and Traversal
// Input : Integer
// Output : Integer
// Author : Omkar Mahadev Bhargude
// Date : 10/07/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class snode
{
    public int data;
    public snode next;
}

class dnode
{
    public dnode prev;
    public int data;
    public dnode next;
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////// Singly Linear Linkedlist ///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class SinglyLLL
{
    private snode first;
    private int iCount;

    public SinglyLLL()
    {
        first = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        snode newn = new snode();

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
        snode newn = new snode();
        snode temp = null;

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
        else
        {
            first = first.next;
        }

        iCount--;
    }

    public void DeleteLast()
    {
        snode temp = null;

        if(first ==  null)
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
        snode newn = null;
        snode temp = null;

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
            newn = new snode();

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
        snode temp = null;

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
        snode temp = first;

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

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////// Singly Circular Linkedlist //////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class SinglyCLL
{
    private snode first;
    private int iCount;
    private snode last;

    public SinglyCLL()
    {
        first = null;
        iCount = 0;
        last = null;
    }


    public void InsertFirst(int no)
    {
        snode newn = new snode();
        newn.data = no;
        newn.next = null;

        if(first == null & last == null)
        {
            first = newn;
            last = newn;
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
        snode newn = new snode();
        newn.data = no;
        newn.next = null;

        if(first == null & last == null)
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
        if(first == null & last == null)
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
        snode temp = null;

        if(first == null & last == null)
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
        snode newn = null;
        snode temp = null;

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
            newn = new snode();
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
        snode temp = null;

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
        snode temp = null;

        temp = first;

        if(temp == null)
        {
            System.out.println("Linkedlist is emtpy");
            return;
        }

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

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////// DOubly Linear Linkedlist ////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class DoublyLLL
{
    private dnode first;
    private int iCount;

    public DoublyLLL()
    {
        first = null;
        iCount = 0;
    }


    public void InsertFirst(int no)
    {
        dnode newn = new dnode();
        
        newn.data = no;
        newn.next = null;
        newn.prev = null;

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first.prev = newn;

            first = newn;
        }

        iCount++;
    }

    public void InsertLast(int no)
    {
        dnode newn = new dnode();
        dnode temp = null;
        
        newn.data = no;
        newn.next = null;
        newn.prev = null;

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
            newn.prev = temp;
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
            first.prev = null;
        }

        iCount--;
    }

    public void DeleteLast()
    {
        dnode temp = null;

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
        dnode newn = null;
        dnode temp = null;

        if((pos < 1) || (pos > iCount+1))
        {
            System.out.println("Invalid Positon");
            return;
        }

        if(pos  == 1)
        {
            InsertFirst(no);
        }
        else if(pos == iCount+1)
        {
            InsertLast(no);
        }
        else
        {
            newn = new dnode();

            newn.data = no;
            newn.next = null;
            newn.prev = null;

            temp = first;

            for(iCnt = 1; iCnt < pos-1; iCnt++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next.prev = newn;

            temp.next = newn;
            newn.prev = temp;

            iCount++;
        }
    }

    public void DeleteAtPos(int pos)
    {
        int iCnt = 0;
        dnode temp = null;
        dnode target = null;

        if((pos < 1) || (pos > iCount))
        {
            System.out.println("Invalid Positon");
            return;
        }

        if(pos  == 1)
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
            target.next.prev = temp;

            target = null;

            iCount--;
        }
    }

    public void Display()
    {
        dnode temp = first;
        int iCnt = 0;

        if(temp == null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }

        System.out.print(" null <=> ");
        for(iCnt = 1; iCnt <= iCount; iCnt++)
        {
            System.out.print(" | "+temp.data+" | <=> ");

            temp = temp.next;
        }
        System.out.println(" null ");

    }

    public int Count()
    {
        return iCount;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////// Doubly Circular Linkedlist //////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class DoublyCLL
{
    private dnode first;
    private int iCount;
    private dnode last;

    public DoublyCLL()
    {
        first = null;
        iCount = 0;
        last = null;
    }


    public void InsertFirst(int no)
    {
        dnode newn = new dnode();

        newn.data = no;
        newn.next = null;
        newn.prev = null;

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            newn.next = first;
            first.prev = newn;

            first = newn;
        }

        first.prev = last;
        last.next = first;

        iCount++;
    }

    public void InsertLast(int no)
    {
        dnode newn = new dnode();

        newn.data = no;
        newn.next = null;
        newn.prev = null;

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            newn.prev = last;

            last = newn;
        }

        first.prev = last;
        last.next = first;

        iCount++;
    }

    public void DeleteFirst()
    {
        if(first == null & last == null)
        {
            return;
        }
        else if(first == null)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
        }

        first.prev = last;
        last.next = first;

        iCount--;
    }

    public void DeleteLast()
    {
        if(first == null & last == null)
        {
            return;
        }
        else if(first == null)
        {
            first = null;
            last = null;
        }
        else
        {
            last = last.prev;

            last.next = first;
        }

        first.prev = last;

        iCount--;
    }

    public void InsertAtPos(int no, int pos)
    {
        int iCnt = 0;
        dnode newn = null;
        dnode temp = null;

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
            newn = new dnode();

            newn.data = no;
            newn.next = null;
            newn.prev = null;

            temp = first;
            
            for(iCnt = 1; iCnt < pos-1; iCnt++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next.prev = newn;

            newn.prev = temp;
            temp.next = newn;

            iCount++;

        }
    }

    public void DeleteAtPos(int pos)
    {
        int iCnt = 0;
        dnode temp = null;
        dnode target = null;

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

            target = temp.next;

            temp.next = target.next;
            target.next.prev = temp;

            target = null;

            iCount--;            
        }
    }

    public void Display()
    {
        int iCnt = 0;

        dnode temp = first;

        if(temp == null)
        {
            System.out.println("LinkedList is empty");
            return;
        }


        System.out.print(" <=> ");

        for(iCnt = 1; iCnt <= iCount; iCnt++)
        {
            System.out.print(" | "+temp.data+" | <=> ");

            temp = temp.next;
        }

        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }
}

class LinkedList
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        

        int choice = 0, value = 0, pos = 0;

        SinglyLLL slobj = new SinglyLLL();
        SinglyCLL scobj = new SinglyCLL();
        DoublyLLL dlobj = new DoublyLLL();
        DoublyCLL dcobj = new DoublyCLL();

        System.out.println("===========+|- Linked List Menu -|+===========");
        System.out.println("1. Singly Linear Linked List");
        System.out.println("2. Singly Circular Linked List");
        System.out.println("3. Doubly Linear Linked List");
        System.out.println("4. Doubly Circular Linked List");
        System.out.println("0. Exit");
        System.out.println("=========================================");

        System.out.print("\nSelect Linked List: ");
        int LLchoice = sobj.nextInt();

        while (LLchoice != 0)
        {
            System.out.println("===================================");
            System.out.println("\n1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display");
            System.out.println("8. Count");
            System.out.println("0. Back to Main Menu");
            System.out.println("===================================");

            System.out.print("\nEnter your choice: ");
            choice = sobj.nextInt();
            System.out.println();

            switch(LLchoice)
            {
                case 1: // SinglyLL
                    switch(choice)
                    {
                        case 1:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            slobj.InsertFirst(value);
                            break;

                        case 2:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            slobj.InsertLast(value);
                            break;

                        case 3:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            System.out.print("Enter position: ");
                            pos = sobj.nextInt();
                            slobj.InsertAtPos(value, pos);
                            break;

                        case 4:
                            slobj.DeleteFirst();
                            break;

                        case 5:
                            slobj.DeleteLast();
                            break;

                        case 6:
                            System.out.print("Enter position: ");
                            pos = sobj.nextInt();
                            slobj.DeleteAtPos(pos);
                            break;

                        case 7:
                            slobj.Display();
                            break;

                        case 8:
                            System.out.println("Number of elements in LinkedList are : " + slobj.Count());
                            break;
                    }
                    break;

                case 2: // SinglyCLL
                    switch(choice)
                    {
                        case 1:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            scobj.InsertFirst(value);
                            break;

                        case 2:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            scobj.InsertLast(value);
                            break;

                        case 3:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            System.out.print("Enter position: ");
                            pos = sobj.nextInt();
                            scobj.InsertAtPos(value, pos);
                            break;

                        case 4:
                            scobj.DeleteFirst();
                            break;

                        case 5:
                            scobj.DeleteLast();
                            break;

                        case 6:
                            System.out.print("Enter position: ");
                            pos = sobj.nextInt();
                            scobj.DeleteAtPos(pos);
                            break;

                        case 7:
                            scobj.Display();
                            break;

                        case 8:
                            System.out.println("Number of elements in LinkedList are : " + scobj.Count());
                            break;
                    }
                    break;

                case 3: // DoublyLL
                    switch(choice)
                    {
                        case 1:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            dlobj.InsertFirst(value);
                            break;

                        case 2:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            dlobj.InsertLast(value);
                            break;

                        case 3:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            System.out.print("Enter position: ");
                            pos = sobj.nextInt();
                            dlobj.InsertAtPos(value, pos);
                            break;

                        case 4:
                            dlobj.DeleteFirst();
                            break;

                        case 5:
                            dlobj.DeleteLast();
                            break;

                        case 6:
                            System.out.print("Enter position: ");
                            pos = sobj.nextInt();
                            dlobj.DeleteAtPos(pos);
                            break;

                        case 7:
                            dlobj.Display();
                            break;

                        case 8:
                            System.out.println("Number of elements in LinkedList are : " + dlobj.Count());
                            break;
                    }
                    break;

                case 4: // DoublyCLL
                    switch(choice)
                    {
                        case 1:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            dcobj.InsertFirst(value);
                            break;

                        case 2:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            dcobj.InsertLast(value);
                            break;

                        case 3:
                            System.out.print("Enter value: ");
                            value = sobj.nextInt();
                            System.out.print("Enter position: ");
                            pos = sobj.nextInt();
                            dcobj.InsertAtPos(value, pos);
                            break;

                        case 4:
                            dcobj.DeleteFirst();
                            break;

                        case 5:
                            dcobj.DeleteLast();
                            break;

                        case 6:
                            System.out.print("Enter position: ");
                            pos = sobj.nextInt();
                            dcobj.DeleteAtPos(pos);
                            break;

                        case 7:
                            dcobj.Display();
                            break;

                        case 8:
                            System.out.println("Number of elements in LinkedList are : " + dcobj.Count());
                            break;

                        
                    }
                    break;

                default:
                    System.out.println("Invalid Linked List Choice");
                    break;
            }

            if (choice == 0)
            {
                System.out.println("\n==== Linked List Menu ====");
                System.out.println("1. Singly Linear LL");
                System.out.println("2. Singly Circular LL");
                System.out.println("3. Doubly Linear LL");
                System.out.println("4. Doubly Circular LL");
                System.out.println("0. Exit");
                System.out.print("\nSelect Linked List (0 to Exit): ");
                LLchoice = sobj.nextInt();
            }
        }

        System.out.println("\nProgram exited.");
     
        
    }
}