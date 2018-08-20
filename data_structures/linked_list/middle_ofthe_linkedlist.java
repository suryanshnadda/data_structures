/*
change the name of java file to nody.java

to find the middle element of the linked_list

@suryansh_nody.
*/
public class nody{

    static class link
    {

     private int data;
     private link next;

     public link(int data)
     {
         this.data=data;
     }

      public int data()
      {
          return data;
      }
    }

    link head;

    public nody()
    {
        head=null;
    }

    //function to insert from back of linked list

    public void insertback(int a)
    {
        // if the linked list is empty
        if(head==null)
        {
            head=new link(a);
            head.next=null;
            return;
        }
        //if linked list have elements
        else
        {
            link current=head;

            while(current.next!=null)
            {
                current=current.next;
            }

            link add= new link(a);
            add.next=null;
            current.next=add;

        }
    }

    //function to find the middle of linked_list

    public void middle()
    {
          if(head==null)
          {
           System.out.println("linked_list is empty");
           return;
          }
        link p=head;
        link q=head;

        while(q!=null && q.next!=null && q.next.next!=null)
        {
            p=p.next;
            q=q.next.next;
        }

        System.out.println("the middle element of linked_list is "+ p.data());
    }


    //function to display a linked list
    public void display()
    {
        System.out.println("elements present in the linkedlist");

        link current=head;
        if(head==null)
        {
            System.out.println("linkedlist is empty");
         return;
        }
        else
        {
        while(current!=null)
        {
            System.out.println(current.data());
            current=current.next;
        }
        }
    }
     public static void main(String []args){
        nody obj= new nody();
        obj.insertback(1);
        obj.insertback(2);
        obj.insertback(3);
        obj.insertback(4);
        obj.insertback(5);
        obj.display();
        obj.middle();
     }
}
