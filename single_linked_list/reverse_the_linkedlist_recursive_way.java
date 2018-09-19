
// reversing the linked_list
public void revrese(link a)
{
  link current=a;
  if(current.next!=null)
  {

    revrese(current.next);
  }
  System.out.println(current.data());
}


