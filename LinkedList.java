class LinkedList
{
  public ListNode first,last;
    
    LinkedList()
    {
      first=new ListNode();
      last =new ListNode();
      first.next=last;

    }
   
  public void insert(int value)
   {   
        if(first.datum==0)
        {
           first.datum=value;
           
        }  
        else if(last.datum==0)
        {
          last.datum=value;
         
        }
         
        else
        {
           ListNode l=new ListNode(value);
           last.next=l;
           last=l;
	   
        }
        
   }
   public void show()
   {
     ListNode n=first;
     while(n.next!=null)
        {
          System.out.println("Numbers= "+n.datum);
          n=n.next;
          if(n.equals(last))
          {
            System.out.println("Numbers= "+n.datum);
          }    
        }
   
   }

}