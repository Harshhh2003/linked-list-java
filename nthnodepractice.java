public class nthnodepractice{
    void display(node head){
        node temp = head;
        while(temp !=null){
            System.out.println(temp.data +  "    ");
            temp = temp.next;

        } System.out.println();
    }
    public static class  node{
        int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;

    }
    }
    public static node nthnode(node head , int n){
        int size=0;
        node temp = head;
        while(temp !=null){
            size++;
            temp = temp.next;
        }
     int m = size -n+1;
     temp = head;
     for(int i =1; i<m; i++){
        temp = temp.next;

     } return temp;
    }
    public static void main(String[] args) {
        
        
    }
}
