public class linklist2{
    public static class node2{
        int data;  node2 next;
        node2(int data){
            this.data = data;
        }

    }
   public static void main(String[] args) {
    node2 x = new node2(50);
    node2 y = new node2(150);
    node2 z = new node2(80);
    node2 a = new node2(10);
    node2 b = new node2(90);
    node2 h = new node2(20);
    x.next= y;
    y.next= z;
    z.next= a;
    a.next= b;
    b.next =h;
    node2 temp = x;
    for(int i=1 ; i<=5; i++){
        System.out.println(temp.data + "     ");
        temp = temp.next;

    }
    
   }
}