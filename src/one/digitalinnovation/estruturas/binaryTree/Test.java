package one.digitalinnovation.estruturas.binaryTree;

import one.digitalinnovation.estruturas.binaryTree.model.Obj;

public class Test {
    public static void main(String[] args) {
        BinaryTree<Obj> binaryTree = new BinaryTree<>();

        binaryTree.insert(new Obj(13));
        binaryTree.insert(new Obj(10));
        binaryTree.insert(new Obj(25));
        binaryTree.insert(new Obj(2));
        binaryTree.insert(new Obj(12));
        binaryTree.insert(new Obj(20));
        binaryTree.insert(new Obj(31));
        binaryTree.insert(new Obj(29));
        binaryTree.remove(new Obj(2));

        binaryTree.showPostOrder();
        binaryTree.showInOrder();
        binaryTree.showPreOrder();
    }
}
