package one.digitalinnovation.estruturas.pilhas;

import one.digitalinnovation.estruturas.shared.Node;

public class Stack<T> {

    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    /**
    * Pushes an item onto the top of this stack
    * */
    public void push(T item) {
        Node newNode = new Node(item);
        newNode.setNext(top);
        this.top = newNode;
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     * */
    public T pop() {
        if (!this.isEmpty()) {
            T retValue = this.top.getObject();
            top = this.top.getNext();
            return retValue;
        }
        return null;
    }

    /**
    * Tests if this stack is empty.
    * */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * */
    public T peek() {
        return this.top.getObject();
    }

    @Override
    public String toString() {
        Node auxiliar = top;

        String retorno = "\n---Stack---\n";

        while (true) {
            if(auxiliar != null) {
                retorno += "[Node{object=" + auxiliar.getObject() + "}]\n";
                auxiliar = auxiliar.getNext();
            } else {
                break;
            }
        }

        return retorno;
    }
}
