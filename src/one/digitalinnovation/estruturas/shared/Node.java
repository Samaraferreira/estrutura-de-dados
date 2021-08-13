package one.digitalinnovation.estruturas.shared;

public class Node<T> {

    private T object;
    private Node next = null;

    public Node(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
