/*
rename the file to nody.java before running the program
->___double_linked_list_insert_to_front.
*/
public class nody{
    class link
    {
        private int data;
        private link previous;
        private link next;
        public link(int data)
        {
            this.data=data;
            previous=null;
            next=null;
        }
        public link(link previous,int data,link next)
        {
            this.data=data;
            this.previous=previous;
            this.next=next;
        }
        public int data()
        {
            return data;
        }
    }
      link head;
      nody()
      {
          head=null;
      }
      // insert from front
      public void insert_front(int a)
      {
         if(head==null)
         {
             head=new link(null,a,null);
         }
         else
         {
            link current=head;
            link n= new link(null,a,current);
            current.previous=n;
            head=n;
         }
      }
      // display_print the list
      public void display()
      {
        link current=head;
        while(current!=null)
         {
         System.out.println(current.data());
         current=current.next;
         }
      }
     public static void main(String []args)
      {
        nody obj= new nody();
        obj.insert_front(1);
        obj.insert_front(2);
        obj.insert_front(3);
        obj.insert_front(4);
        obj.display();
      }
}
