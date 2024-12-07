class nthnode2 {

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }

        public static void display(node head) {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static node nthnode2(node head, int n) {
        node slow = head;
        node fast = head;

        for (int i = 1; i <= n; i++) {
            if (fast != null) {
                fast = fast.next;
            } else {
                return null;
            }
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        node a = new node(100);
        node b = new node(10);
        node c = new node(50);
        node d = new node(200);

        a.next = b;
        b.next = c;
        c.next = d;

        node.display(a);

        node result = nthnode2(a, 2);
        if (result != null) {
            System.out.println("2nd node from the end is: " + result.data);
        } else {
            System.out.println("Invalid position.");
        }
    }
}
