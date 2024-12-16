public class doublylinklist2{
    public static void display(node head){
        node temp = head;
        while(temp !=null){
            System.out.println(temp.data +  "   ");
            temp = temp.next;

        } System.out.println();
    }
    public static class node{
        int data;
        node next;
        node  prev;
        node (int data){
            this.data = data;

        }
    }
    public static void displayreverse(node tail){
        node temp = tail;
        while(temp !=null){
            System.out.println(temp.data   +   "   ");
            temp = temp.prev;
        } System.out.println();
    }
    public static void main(String[] args) {
        node  a = new  node(1000);   
         node  b = new  node(101);
        node  c = new  node(230);
        node  d = new  node(110);  
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
        System.out.println("original linklist");
        display(a);
        System.out.println("reversed linklist");
        displayreverse(d);
    }
}