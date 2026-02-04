// restoring list after checking palindrome 

class Node {
    Node next;
    int data;

    Node(int data) {
        this.next = null;
        this.data = data;
    }
}

public class main {

    static Node middle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static Node secondeHalfReverse(Node slow) {
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        return prev;
    }

    static boolean checkBothParts(Node head, Node prev) {
        while (prev != null) {
            if (head.data != prev.data) {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }

    static Node restore(Node prev) {
        Node p = null;
        while (prev != null) {
            Node next = prev.next;
            prev.next = p;
            p = prev;
            prev = next;
        }
        return p;
    }

    static void printlist(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(03);

        Node slow = middle(head);
        Node prev = secondeHalfReverse(slow);

        if (checkBothParts(head, prev)) {
            System.out.println("the linkList is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }        

        restore(prev);
        printlist(head);


    }
}