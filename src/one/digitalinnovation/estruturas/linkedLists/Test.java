package one.digitalinnovation.estruturas.linkedLists;

public class Test {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.remove(0));
        System.out.println(linkedList.remove(1));
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
    }
}
