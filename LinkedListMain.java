public class LinkedListMain {
    public static void main(String[] args) {
        //uc1
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        //uc2
        linkedList1.add(70);
        linkedList1.add(30);
        linkedList1.add(56);
        linkedList1.show();

        //uc3
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.show();

        //uc5
        Integer poppedData1 = linkedList1.pop();
        if (poppedData1 == null)
            System.out.println("Linked List is Empty");
        else
            System.out.println("The element popped is => " + poppedData1);

        linkedList1.show();
    }
}
