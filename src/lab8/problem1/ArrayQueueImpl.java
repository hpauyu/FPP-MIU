package lab8.problem1;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        return isEmpty()? -1: arr[front+1];
//implement
    }

    public void enqueue(int obj) {
//implement
        if (rear == arr.length)
            resize();
        arr[rear] = obj;
        rear++;
    }

    public int dequeue() {
        if(isEmpty())
            return -1;
        return arr[++front];
//implement
    }

    public boolean isEmpty() {
//implement
        return size() == 0 ? true:false;
    }

    public int size() {
//implement
        return ((rear-1)-(front));
    }

    private void resize() {
//implement
        int[] temp = new int[arr.length*2];
        System.arraycopy(arr,0,temp,0,arr.length);
        arr = temp;
    }
}
