public class linklist1{
    public  static class node{
        int data;   // value
        node next; // address of next node
 node( int data){
    this.data = data; // we r using constructor here

 }
    }
    
    public static void main(String[] args) {
       node x = new node(50);
       node y = new node(150);
       node z = new node(80);
       node a = new node(10);
       node b = new node(90);
       node h = new node(20);
       x.next= y;
       y.next= z;
       z.next= a;
       a.next= b;
       b.next =h;
       System.out.println(x.data); // 50 
       System.out.println(y); // 150 x me y node ke data type ka adress store ho jayega in x
        System.out.println(x.data);   // 150
         System.out.println(x.next.data); // will print the y value 
         System.out.println(x.next.next.next.data);
         System.out.println(x.next.next.next.next.data); // will pirnt the value of b
         
         
 
 
        
    }
}