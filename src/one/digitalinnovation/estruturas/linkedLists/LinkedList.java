package one.digitalinnovation.estruturas.linkedLists;

import one.digitalinnovation.estruturas.shared.Node;

public class LinkedList<T> {

    private Node<T> node;

    public LinkedList() {
       this.node = null;
    }

    public void add(T item) {
        Node<T> newNode = new Node(item);
        if (this.isEmpty()) {
            this.node = newNode;
            return;
        }

        Node<T> aux = this.node;
        for (int i = 0; i < this.size()-1; i++) {
            aux = aux.getNext();
        }

        aux.setNext(newNode);
    }

    public Node<T> getNode(int index) {
        validateIndex(index);

        Node<T> aux = this.node;
        Node<T> returnNode = null;
        for (int i = 0; i <= index; i++) {
            returnNode = aux;
            aux = aux.getNext();
        }
        return returnNode;
    }

    public T get(int index) {
        return getNode(index).getObject();
    }

    public int size() {
        int sizeList = 0;
        Node<T> aux = this.node;

        while (true) {
            if (aux != null) {
                sizeList += 1;
                if (aux.getNext() != null) {
                    aux = aux.getNext();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return sizeList;
    }

    public T remove(int index) {
        Node<T> found = this.getNode(index);

        if (index == 0) {
            this.node = found.getNext();
            return found.getObject();
        }

        Node<T> left = this.getNode(index - 1);
        left.setNext(found.getNext());
        return found.getObject();
    }

    public boolean isEmpty() {
        return node == null;
    }

    private void validateIndex(int index) {
        if (index >= this.size()) {
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index);
        }
    }

    @Override
    public String toString() {
        String retorno = "\n---Linked List---\n";
        Node auxiliar = this.node;

        for (int i = 0; i < this.size(); i++) {
            retorno += "[Node{object=" + auxiliar.getObject() + "}]-->";
            auxiliar = auxiliar.getNext();
        }
        retorno += "null";

        return retorno;
    }
}
