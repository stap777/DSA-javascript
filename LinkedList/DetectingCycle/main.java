class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class main {
    
    static boolean detectingCycle(Node head) {
        boolean isCycle = false;
        Node current = head;
        Node s = head;
        Node f = head.next;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                return true;
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(11);
        Node third = new Node(12);
        Node fourth = new Node(13);

        head.next = second;
        head.next.next = third;
        head.next.next.next = fourth;
        head.next.next.next.next = second;

        if (detectingCycle(head)) {
            System.out.println("cycle detected");
        } else {
            System.out.println("no Cycle")
        }
    }

}