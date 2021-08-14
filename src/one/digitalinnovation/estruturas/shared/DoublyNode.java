package one.digitalinnovation.estruturas.shared;

public class DoublyNode<T> {

    private T object;
    private DoublyNode<T> prev;
    private DoublyNode<T> next;

    public DoublyNode(T object) {
        this.object = object;
    }

    public DoublyNode(T object, DoublyNode<T> prev, DoublyNode<T> next) {
        this.object = object;
        this.prev = prev;
        this.next = next;
    }

    public T getObject() {
        return object;
    }

    public DoublyNode<T> getPrev() {
        return prev;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void setPrev(DoublyNode<T> prev) {
        this.prev = prev;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DoublyNode{" +
                "object=" + object +
                '}';
    }
}
