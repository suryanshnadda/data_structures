/*
change the name of java file to nody.java
to delete element from end  of the linked_list
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
    //function to delete from the front of the linked_list

    public void delete_end()
    {
        link current=head;

        if(head==null)
        {
            System.out.println("linkedlist is empty");
            return;
        }
        else if(head.next==null)
        {
            head=null;
            return;
        }
        else
        {
        while(current.next!=null && current.next.next!=null)
        {

            current=current.next;
        }
        System.out.println("->deleted single element from end");
        current.next=null;
        }
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
        obj.delete_end();
        obj.display();

     }
}
