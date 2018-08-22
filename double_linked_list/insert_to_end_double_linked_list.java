/*
rename the file to nody.java before running the program
->___double_linked_list_insert_to_end.
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
      // insert from end
        public void insert_end(int a)
        {
            if(head==null)
            {
                head=new link(null,a,null);
            }
            else
            {

                link current=head;
                while(current.next!=null)
                {
                    current=current.next;
                }
                link n=new link(current,a,null);
                current.next=n;

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
     public static void main(String []args){
        nody obj= new nody();
        obj.insert_end(1);
        obj.insert_end(2);
        obj.insert_end(3);
        obj.display();


     }
}
