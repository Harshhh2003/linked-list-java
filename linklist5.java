public class linklist5{
    //  normal dislplay method
    public static void display(node5 head){
        if(head == null) return;
        System.out.println(head.data );
        display(head.next);
       

    } //  revrse list print method 
    public static void displayr(node5 head){
        if(head == null) return;
        System.out.println(head.data );
        display(head.next);
        
        System.out.print(head.data);
       

    } public static void displayreverse( node5 head){
        if(head == null) return;
        displayreverse(head.next);
        System.out.println(head.data);


    }
    public static class node5{
        int data; node5 next;
        node5(int data){
            this.data = data;


        }

    }
    public static void main(String[] args) {
        node5 y = new node5(150);
        node5 z = new node5(80);
        node5 a = new node5(10);
        node5 b = new node5(90);
        node5 h = new node5(20);
        
        y.next= z;
        z.next= a;
        a.next= b;
        b.next =h;
        display(y);
        
      System.out.println("reverse order ");
        displayreverse(y);

        
    }
}