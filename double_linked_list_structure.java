/*
rename the file to nody.java before running the program
->___double_linked_list_basic-structure ___
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
     public static void main(String []args){
        nody obj= new nody();
        System.out.println("basic structure for double_linked_list");
     }
}
