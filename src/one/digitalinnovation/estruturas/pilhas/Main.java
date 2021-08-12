package one.digitalinnovation.estruturas.pilhas;

import one.digitalinnovation.estruturas.shared.Node;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();

        stack.push("Oi 1");
        stack.push("Oi 2");
        stack.push("Oi 3");

        System.out.println(stack);

        var no = stack.peek();
        System.out.println("Topo da pilha: " + no);

        var noExcluido = stack.pop();
        System.out.println("Excluído: " + noExcluido);
        System.out.println(stack);

        System.out.println("Is empty? " + stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println("Is empty? " + stack.isEmpty());
    }
}
