package lab8.problem1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl a = new ArrayQueueImpl();
        System.out.println(a.isEmpty());
        a.enqueue(1);
        System.out.println(a.isEmpty());
        System.out.println(a.dequeue());
        System.out.println(a.peek());
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        a.enqueue(4);
        a.enqueue(5);
        a.enqueue(6);
        a.enqueue(7);
        a.enqueue(8);
        a.enqueue(9);
        a.enqueue(10);
        a.enqueue(11);
        System.out.println(a.size());
        System.out.println(a.dequeue());
    }
}
