package one.digitalinnovation.estruturas.binaryTree.model;

public abstract class TreeObj<T> implements Comparable<T> {
    public abstract boolean equals(Object object);
    public abstract int hashCode();
    public abstract int compareTo(T object);
    public abstract String toString();
}
