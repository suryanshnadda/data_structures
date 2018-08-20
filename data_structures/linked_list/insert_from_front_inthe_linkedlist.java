/*
change the name of java file to nody.java

to insert element from the front of the linked list

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

    //function to insert from front of linked list

    public void insertfront(int a)
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
            link add= new link(a);
            add.next=head;
            head=add;
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
        obj.insertfront(1);
        obj.insertfront(2);
        obj.insertfront(3);
        obj.display();

     }
}
