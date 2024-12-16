public class doublylinklist{
    

    public  static class node{
        int data ;   node next; node prev;
        node(int data){
            this.data = data;
        }

    } 
    public static  void display(node head){
        node temp = head;
        while(temp !=null){ System.out.println(temp.data  +   "   ");
temp = temp.next;
        }  System.out.println();
    }
    public static void main(String[] args) {
        node  a = new  node(10);    node  b = new  node(101);
        node  c = new  node(20);
        node  d = new  node(100);  
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
        display(a);
        // output  10 101 20 100



    }
} 
