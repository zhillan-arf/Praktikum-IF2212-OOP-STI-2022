public class Node<T> {
    private T info;
    private Node<T> next;
    private Node<T> prev;

    public Node() {
        info = null;
        next = null;
        prev = null;
    }

    public Node(T info) {
        this.info = info;
        next = null;
        prev = null;
    }

    public Node(T info, Node<T> prev, Node<T> next) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    } 

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getFirst() {
        Node<T> cur = this;
        while (cur.prev != null) {
            cur = cur.prev;
        }
        return cur;
    }

    public Node<T> getLast() {
        Node<T> cur = this;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }
}