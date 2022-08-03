import java.util.LinkedList;


public class ListConcatenate {
    public static LinkedList<Integer> concatenate(LinkedList<Integer> linkedlist1, LinkedList<Integer> linkedList2) {
            linkedlist1.addAll(linkedList2);
            return linkedlist1;

    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedlist1 = new LinkedList<>();
        LinkedList<Integer> linkedlist2 = new LinkedList<>();
        linkedlist1.add(1);
        linkedlist1.add(2);
        linkedlist1.add(3);
        linkedlist1.add(4);
        linkedlist2.add(5);
        linkedlist2.add(6);
        linkedlist2.add(7);
        System.out.println(concatenate(linkedlist1, linkedlist2));
    }
}
