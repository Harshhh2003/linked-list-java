public class reverselinklist{
    void display(node head){
        node temp =  head;
        while(temp!= null){
            System.out.println(temp.data +   "    ");
            temp = temp.next;

        } System.out.println();

    }
    public static class  node{
        int data ;  node next;
        node(int data){
            this.data = data;   this.next = null;
                }
    }
    public static node reverse(node head) {
        if (head == null || head.next == null) {
            return head; 
        }

        node newnode = reverse(head.next); 
        head.next.next = head; 
        head.next = null; 

        return newnode;  // newnode will be 10 here
    }

    public static void main(String[] args) {
        reverselinklist  list = new reverselinklist();
        node head = new node(1);
        head.next = new node(3);
        head.next.next = new node(5);
        head.next.next.next = new node(10);
      System.out.println("original array");
      list.display(head);
   System.out.println("reverse linklist");
      list.display(reverse(head));

        
    }
}