package one.digitalinnovation.estruturas.doublyLinkedLists;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.add("A");
        doublyLinkedList.add("B");
        System.out.println(doublyLinkedList);
        doublyLinkedList.add(0, "C");
        System.out.println(doublyLinkedList);
        System.out.println(doublyLinkedList.get(2));
        doublyLinkedList.remove(0);
        System.out.println(doublyLinkedList);
    }
}
