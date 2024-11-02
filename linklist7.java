public class linklist7{
    public static void display(node7 head) {
        while (head != null) {
            System.out.print(head.data + " ");  
            head = head.next; 
        }
        System.out.println(); 
    }
    
    public static class node7{

        int data; node7 next;
        node7(int data){
            this.data = data;


        }
    } public static class Linklist{

        node7 head = null;
        node7 tail = null;
        void insertatend(int value){
            node7 temp = new  node7(value);
            if(head == null){
                head = temp;
            } else{
                tail.next = temp;
            }
            tail = temp;
        }
    }
    public static void main(String[] args) {
        Linklist l1 = new Linklist( );
        l1.insertatend(10);
 l1.insertatend(50);   
 l1.insertatend(100);
 display(l1.head);
//  ans
     
        
    }
}