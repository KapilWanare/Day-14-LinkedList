import java.util.*;

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

        //uc6
        Integer poppedData2 = linkedList2.popLast();
        if (poppedData2 == null)
            System.out.println("Linked List is Empty");
        else
            System.out.println("The element popped is => " + poppedData2);

        linkedList2.show();

        //uc7
        System.out.println("Adding Element Back to LinkedList");
        linkedList2.add(70);
        linkedList2.show();
        System.out.println("Searching whether element 30 is present in LinkedList or not.");
        Node<Integer> searchedData = linkedList2.search(30);
        if (searchedData == null) {
            System.out.println("Element 30 not found!");
        } else {
            System.out.println("Element 30 Found");
        }

        //uc8
        boolean isInserted = linkedList2.insertAfter(30, 40);
        if (isInserted)
            System.out.println("Element inserted successfully!");
        else
            System.out.println("Element not inserted!");
        linkedList2.show();

        //uc9
        boolean isDeleted = linkedList2.deleteNode(40);
        if(isDeleted)
            System.out.println("Element deleted successfully!");
        else
            System.out.println("Element not found and not deleted");
        linkedList2.show();
      
        //UC 10
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.append(30);
        linkedList3.append(40);
        linkedList3.append(56);
        linkedList3.append(70);
        linkedList3.show();


    }

}
