public  class palindromelinklist{
    void display(node head){
        node temp = head;
        while(temp !=null){
            System.out.println(temp.data   +  " "   );
            temp = temp.next;
        } System.out.println();
    }
    public static node middle(node head){
        node  slow = head;
        node fast = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }
   static boolean palindrome(node head){
    if(head ==null) return true; // true means palindrome beacuse only one node is present
   }
   node mid = middle(head);
   node last = middle(mid.next);
   node current  = head;
   while(last !=null ){
    if(last.data  != current.data)  return false;
    last = last.next ;
    current = current.next;

   } return  true;
   }
    public static class node{
        int data;  node  next;
        node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static void main(String[] args) {
        
    }
}