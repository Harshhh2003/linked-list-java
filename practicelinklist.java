public class practicelinklist{
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;

        }
    }   class linklist{
        node head;
        void insertAtStart(int data){
            node newnode =  new node( data);
            newnode.next = head;
            head = newnode;


        }  void display(){
            node temp = head;
            while(temp !=null){
                System.out.println(temp.data +  "   ");
                temp = temp.next;
            } System.out.println();
        }
    }
    public static void main(String[] args) {
    linklist list = new linklist();
    list.insertAtStart(10);
    list.insertAtStart(20);
    list.insertAtStart(30);

    list.display();
    }
}