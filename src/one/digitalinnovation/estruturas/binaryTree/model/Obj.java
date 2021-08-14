package one.digitalinnovation.estruturas.binaryTree.model;

import java.util.Objects;

public class Obj extends TreeObj<Obj> {

    Integer value;

    public Obj(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(value, obj.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Obj object) {
        if (value > object.value) {
            return 1;
        } else if (value < object.value) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
