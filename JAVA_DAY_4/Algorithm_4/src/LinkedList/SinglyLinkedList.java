package LinkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        ListNode current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Node with value " + data + " not found");
            return;
        }
        current.next = current.next.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();  // Output: 1 -> 2 -> 3 -> null
        list.delete(2);
        list.display();  // Output: 1 -> 3 -> null
        list.delete(5);  // Output: Node with value 5 not found
    }
}
