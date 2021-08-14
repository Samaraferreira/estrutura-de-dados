package one.digitalinnovation.estruturas.shared;

public class BinaryNode<T extends Comparable<T>> {

    private T object;
    private BinaryNode<T> left;
    private BinaryNode<T> right;

    public BinaryNode(T object) {
        this.object = object;
        this.left = this.right = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "object=" + object +
                '}';
    }
}
