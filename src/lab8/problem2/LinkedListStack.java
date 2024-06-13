package lab8.problem2;

public class LinkedListStack {
    private Node stack;
    private int size;
    //push
    public void push(Integer value){
        if (value!= null){
            Node node = new Node(value);
            node.next = stack;
            stack = node;
            size++;
        }
    }
    //peek
    public Integer peek(){
        if (!isEmpty()){
            return stack.value;
        }
        return null;
    }
    //pop
    public Integer pop(){
        if (!isEmpty()){
            Node node = stack;
            stack = stack.next;
            node.next = null;
            size--;
            return node.value;
        }
        else
            return null;
    }
    //isEmpty
    public boolean isEmpty(){
        return size == 0;
    }
    //size
    public int size(){
        return size;
    }

    private class  Node{
        private Integer value;
        private Node next;
        public Node(Integer value){
            this.value = value;
        }
    }
}
