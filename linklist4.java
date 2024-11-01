public class linklist4{ 
    static void displaylinklist(node4 head){
        node4 current = head;
         while(current!= null){
            System.out.println(current.data +   "      ");
            current = current.next;
        }

    }
    
    public static class node4{
        int data; node4 next;
        node4(int data){
            this.data = data;


        }

    }
    
    public static void main(String[] args) {
        node4 y = new node4(150);
        node4 z = new node4(80);
        node4 a = new node4(10);
        node4 b = new node4(90);
        node4 h = new node4(20);
        
        y.next= z;
        z.next= a;
        a.next= b;
        b.next =h;
      displaylinklist(y); 
    
}

}