package one.digitalinnovation.estruturas.circularlist;

public class Test {
    public static void main(String[] args) {
        CircularList<String> circularList = new CircularList<>();

        circularList.add("1");
        circularList.add("2");
        System.out.println(circularList);
    }
}
