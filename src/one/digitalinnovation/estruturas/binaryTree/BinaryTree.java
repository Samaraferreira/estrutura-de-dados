package one.digitalinnovation.estruturas.binaryTree;

import one.digitalinnovation.estruturas.shared.BinaryNode;

public class BinaryTree<T extends Comparable<T>> {

    private BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T object) {
        BinaryNode<T> newNode = new BinaryNode<>(object);
        root = insert(this.root, newNode);
    }

    public void remove(T object) {
        try {
            BinaryNode<T> current = this.root;
            BinaryNode<T> father = null;
            BinaryNode<T> child = null;
            BinaryNode<T> temp = null;

            while (current != null && !current.getObject().equals(object)) {
                father = current;
                if (object.compareTo(current.getObject()) < 0) {
                    current = current.getLeft();
                } else {
                    current = current.getRight();
                }
            }

            if (current == null) {
                System.out.println("Conteudo não encontrado. try");
            }

            if (father == null) {
                if (current.getRight() == null) {
                    this.root = current.getLeft();
                } else if (current.getLeft() == null) {
                    this.root = current.getRight();
                } else {
                    for (temp = current, child = current.getLeft();
                        child.getRight() != null;
                        temp = child, child = child.getLeft()
                    ) {
                        if (child != current.getLeft()) {
                            temp.setRight(child.getLeft());
                            child.setLeft(root.getLeft());
                        }
                    }
                    child.setRight(root.getRight());
                    root = child;
                }
            } else if (current.getRight() == null) {
                if (father.getLeft() == current) {
                    father.setLeft(current.getLeft());
                } else {
                    father.setRight(current.getLeft());
                }
            } else if (current.getLeft() == null) {
                if (father.getLeft() == current) {
                    father.setLeft(current.getRight());
                } else {
                    father.setRight(current.getRight());
                }
            } else {
                for (temp = current, child = current.getLeft();
                     child.getRight() != null;
                     temp = child, child = child.getRight()
                ) {
                    if (child != current.getLeft()) {
                        temp.setRight(child.getLeft());
                        child.setLeft(current.getLeft());
                    }

                    child.setRight(current.getRight());
                    if (father.getLeft() == current) {
                        father.setLeft(father);
                    } else {
                        father.setRight(child);
                    }
                }
            }

        } catch (NullPointerException exception) {
            System.out.println("Conteudo não existe");
        }
    }

    public void showInOrder() {
        System.out.println("\nExibindo em ordem");
        showInOrder(this.root);
    }

    private void showInOrder(BinaryNode<T> current) {
        if (current != null) {
            showInOrder(current.getLeft());
            System.out.print(current.getObject() + ", ");
            showInOrder(current.getRight());
        }
    }

    public void showPostOrder() {
        System.out.println("\nExibindo em pós ordem");
        showPostOrder(this.root);
    }

    private void showPostOrder(BinaryNode<T> current) {
        if (current != null) {
            showPostOrder(current.getLeft());
            showPostOrder(current.getRight());
            System.out.print(current.getObject() + ", ");
        }
    }

    public void showPreOrder() {
        System.out.println("\nExibindo em pre ordem");
        showPreOrder(this.root);
    }

    private void showPreOrder(BinaryNode<T> current) {
        if (current != null) {
            System.out.print(current.getObject() + ", ");
            showPreOrder(current.getLeft());
            showPreOrder(current.getRight());
        }
    }

    private BinaryNode<T> insert(BinaryNode<T> current, BinaryNode<T> newNode) {
        if (current == null) {
            return newNode;
        } else if (newNode.getObject().compareTo(current.getObject()) < 0) { // se menor
            current.setLeft(insert(current.getLeft(), newNode)); // recursividade
        } else {
            current.setRight(insert(current.getRight(), newNode));
        }
        return current;
    }
}
