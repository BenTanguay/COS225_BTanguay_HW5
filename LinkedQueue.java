public class LinkedQueue<T> implements Queue<T> {

    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    private int size = 0;

    public LinkedQueue(){
        head = null;
    }

    //O(1)
    public void enqueue(T element){
        if(head == null){
            head = new LinkedNode<T>(element);
            tail = head;
            size = 1;
        } else {
            tail.next = new LinkedNode<T>(element);
            tail = tail.next;
            size++;
        }
    }

/*
    //O(n) - uh oh
    public void enqueue(T element){
        if (head == null){
            head = new LinkedNode<T>(element);
            size = 1;
        } else {
            LinkedNode<T> temp = head;
            while (temp.next != null){ // <-
                temp = temp.next;
            }
            temp.next = new LinkedNode<T>(element);
            size++;
        }
    }
*/

    //O(1)
    public T dequeue(){
        if(head == null){
            return null;
        } else if (head == tail){
            LinkedNode<T> temp = head;
            head = head.next;
            tail = null;
            size--;
            return temp.element;
        } else {
            LinkedNode<T> temp = head;
            head = head.next;
            size--;
            return temp.element;
        }
    }

    //O(n)
    public int size(){
        return size;
    }

/* 
    //O(n)
    public int size(){
        int x = 1;
        if(this.isEmpty()){
            return 0;
        } else {
            LinkedNode<T> temp = head;
            while (temp.next != null){
                x++;
                temp = temp.next;
            }
            return x;
        }
    }
*/

    //O(1)
    public boolean isEmpty(){
        return head == null;
    }

    //O(1)
    public T getFront(){
        if (head != null){
            return head.element;
        } else {
            return null;
        }
    }
}
