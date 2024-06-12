package lession9;

public class TestNode {
    public static void main(String[] args) {
        Node s = new Node(10);
        Node n1 = new Node(20);
        s.next = n1;
        n1.previous = s;
        System.out.println(s);
        System.out.println(s.next);
        System.out.println(n1.previous);
        Node n0 = new Node(15);
        n0.previous = s;
        n0.next = n1;
        s.next = n0;
        n1.previous = n0;
        System.out.println(s.next.next);
        System.out.println(s.next.previous);
        Node current = s;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
        int sum = 0;
        for (Node d = s; d != null; d = d.next) {
            sum += d.value;
        }
        System.out.println(sum);
    }
}
