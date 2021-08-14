package one.digitalinnovation.estruturas.doublyLinkedLists;

import one.digitalinnovation.estruturas.shared.DoublyNode;
import one.digitalinnovation.estruturas.shared.Node;

public class DoublyLinkedList<T> {

    private DoublyNode<T> head;
    private DoublyNode<T> tail;

    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void add(T object) {
        DoublyNode<T> newNode = new DoublyNode(object);
        newNode.setNext(null);
        newNode.setPrev(this.tail);

        if (this.head == null) {
            this.head = newNode;
        }

        if (this.tail != null) {
            this.tail.setNext(newNode);
        }

        this.tail = newNode;
        size++;
    }

    public void add(int index, T object) {
        DoublyNode<T> aux = this.getNode(index);
        DoublyNode<T> newNode = new DoublyNode<>(object);
        newNode.setNext(aux);

        if (newNode.getNext() != null) {
            newNode.setPrev(aux.getPrev());
            newNode.getNext().setPrev(newNode);
        } else {
            newNode.setPrev(this.tail);
            this.tail = newNode;
        }

        if (index == 0) {
            this.head = newNode;
        } else {
            newNode.getPrev().setNext(newNode);
        }

        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            this.head = this.head.getNext();
            if (this.head != null) {
                this.head.setPrev(null);
            }
        } else {
            DoublyNode<T> aux = this.getNode(index);
            aux.getPrev().setNext(aux.getNext());
            if (aux != this.tail) {
                aux.getNext().setPrev(aux.getPrev());
            } else {
                this.tail = aux;
            }
        }
        this.size--;
    }

    public T get(int index) {
        return this.getNode(index).getObject();
    }

    private DoublyNode<T> getNode(int index) {
        DoublyNode<T> aux = this.head;

        for (int i = 0; (i < index) && (aux != null); i++) {
            aux = aux.getNext();
        }

        return aux;
    }

    @Override
    public String toString() {
        String str = "\n---DoublyLinkedList---\n";
        DoublyNode<T> aux = this.head;
        for (int i =0; i < this.size(); i++) {
            str += aux + "-->";
            aux = aux.getNext();
        }
        str += "null";
        return str;
    }
}
