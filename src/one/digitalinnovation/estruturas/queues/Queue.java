package one.digitalinnovation.estruturas.queues;

import one.digitalinnovation.estruturas.shared.Node;

public class Queue<T> {

    private Node<T> node;

    public Queue() {
       this.node = null;
    }

    public void enqueue(T item) {
        Node newNode = new Node(item);

        newNode.setNext(this.node);

        this.node = newNode;
    }

    public T first() {
        if (!this.isEmpty()) {
            Node<T> firstNode = node;
            while(true) {
                if (firstNode.getNext() != null) {
                    firstNode = firstNode.getNext();
                } else {
                    break;
                }
            }
            return firstNode.getObject();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            Node firstNode = this.node;
            Node secondNode = this.node;

            while(true) {
                if (firstNode.getNext() != null) {
                    secondNode = firstNode;
                    firstNode = firstNode.getNext();
                } else {
                    secondNode.setNext(null);
                    break;
                }
            }

            return (T) firstNode.getObject();
        }

        return null;
    }

    public boolean isEmpty() {
        return node == null;
    }

    @Override
    public String toString() {
        String retorno = "\n---Queue---\n";
        Node auxiliar = this.node;

        if(!this.isEmpty()) {
            while(true) {
                retorno += "[Node{object=" + auxiliar.getObject() + "}]-->";
                if(auxiliar.getNext() != null) {
                    auxiliar = auxiliar.getNext();
                } else {
                    retorno += "null";
                    break;
                }
            }
        }

        return retorno;
    }
}
