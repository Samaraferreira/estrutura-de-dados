package one.digitalinnovation.estruturas.circularlist;

import one.digitalinnovation.estruturas.shared.Node;

public class CircularList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CircularList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T object){
        Node<T> newNode = new Node<>(object);
        if(size == 0){
            this.head = newNode;
            this.tail = this.head;
            this.head.setNext(this.tail);
        }else{
            newNode.setNext(this.tail);
            this.head.setNext(newNode);
            this.tail = newNode;
        }
        this.size++;
    }

    public void remove(int index){
        if(index >= this.size)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        Node<T> aux = tail;
        if(index == 0){ //estou na cauda
            this.tail = this.tail.getNext();
            this.head.setNext(tail);
        }else if(index == 1){
            this.tail.setNext(this.tail.getNext().getNext());
        }else{
            for(int i = 0; i < index-1; i++){
                aux = aux.getNext();
            }
            aux.setNext(aux.getNext().getNext());
        }
        this.size--;
    }

    public T get(int index){
        return getNo(index).getObject();
    }

    private Node<T> getNo(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if(index == 0){
            return this.tail;
        }

        Node<T> aux = this.tail;
        for(int i = 0; (i < index) && (aux != null); i++){
            aux = aux.getNext();
        }
        return aux;
    }

    public boolean isEmpty(){
        return this.size == 0 ? true : false;
    }

    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        String str = "";
        Node<T> aux = this.tail;
        for(int i = 0; i < size(); i++){
            str += "[No{object=" + aux.getObject() +"}]--->";
            aux = aux.getNext();
        }
        str += size() != 0 ? "(Retorna ao início)" : "[]";
        return str;
    }

}
