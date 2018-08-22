/*


change the name of java file to nody.java

 basic struture of java linked list implementation

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
     public static void main(String []args){
        System.out.println("this is basic structure for linked list");
     }
}
