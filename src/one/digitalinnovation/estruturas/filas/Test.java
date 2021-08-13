package one.digitalinnovation.estruturas.filas;

public class Test {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue);
        System.out.println("Primeiro da fila: " + queue.first());
        System.out.println("Retirando primeiro da fila: " + queue.dequeue());
        System.out.println("Primeiro da fila agora: " + queue.first());
        System.out.println(queue);
    }
}
