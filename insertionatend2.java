public class insertionatend2{
    class node{
        int data; node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    } class linklist{
        node head;
        void insertionatend(int data){
            node newnode = new node(data);
            if(head == null){
                head = newnode;
                return;
            } node temp = head;
            while(temp.next !=null){
                temp = temp.next;

            }
            temp.next = newnode;
        }
    }
    public static void main(String[] args) {
 Linklist l1 = new LinkedList();
        
    }
}