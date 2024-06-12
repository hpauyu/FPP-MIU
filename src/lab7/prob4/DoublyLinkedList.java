package lab7.prob4;

public class DoublyLinkedList {
    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    //1. adds to the end of the list
    public void addLast(String item) {
        Node node = new Node();
        node.value = item;
        //implement
        if (header.next == null) {
            header.next = node;
            node.previous = header;
            return;
        }
        Node current = header.next;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        node.previous = current;

    }

    // 2. Remove by passing object
    public boolean remove(String item) {
        //Implement
        Node current = header.next;
        boolean found = false;
        while (current != null) {
            if (current.value.equals(item)) {
                found = true;
                break;
            }
            current = current.next;
        }
        if (found) {
            current.previous.next = current.next;
            if (current.next != null)
                current.next.previous = current.previous;
            current.next = null;
            current.previous = null;
            return true;
        }
        return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        // Implement
        if (header.next != null) {
            Node remove = header.next;
            header.next = remove.next;
            if (remove.next != null)
                remove.next.previous = header;
            return true;
        }
        return false;

    }


    // 4. Prints the list from last to first
    public void printReverse() {

        // Implement
        Node last = header.next;
        while (last.next != null) {
            last = last.next;
        }
        printReverse(last);
        System.out.println();
    }

    private void printReverse(Node last) {
        if (last != null) {
            System.out.print(STR."\{last.value} ");
            printReverse(last.previous);
        }

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        list.printReverse();
        System.out.println(list);
        System.out.println(list.remove("Steve"));
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list);

        // Call all your implemented Methods
    }
}
