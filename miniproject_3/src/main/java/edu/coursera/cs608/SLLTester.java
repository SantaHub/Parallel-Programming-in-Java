package edu.coursera.cs608;


public class SLLTester {

    public static SLLnoTail initializeList(SLLnoTail list, int size){
        SLLnoTail.Node head = new SLLnoTail.Node(1);
        list.head = head;
        SLLnoTail.Node pointer = head;
        while (size > 1){
            pointer.next = new SLLnoTail.Node(size);
            pointer = pointer.next;
            size--;
        }
        return list;
    }

    public static void main(String args[]){
        SLLnoTail list = new SLLnoTail();
        initializeList(list, 10);
        testSize(list);
        testPrint(list);
        testContains(list);
        testAdd(list);
        testRemove(list);
    }

    // Test Size
    public  static void testSize(SLLnoTail list){
        System.out.println("\nTesting Size: ");
        SLLnoTail.getSize(list);
    }

    // Test Print
    public  static  void testPrint(SLLnoTail list){
        System.out.println("\nTesting Print: ");
        SLLnoTail.printList(list);
    }

    // Test Contains
    public  static void testContains(SLLnoTail list){
        System.out.println("\nTesting Contains:");
        SLLnoTail.checkValuePresent(list, 1);
        SLLnoTail.checkValuePresent(list, 100);

    }

    // Test Add
    public  static  void testAdd(SLLnoTail list){
        System.out.println("\nTesting Add :");
        SLLnoTail.addValue(list, 5);
        SLLnoTail.addValue(list, 90);
    }

    // Test Remove
    public  static  void testRemove(SLLnoTail list){
        System.out.println("\nTesting Remove : ");
        SLLnoTail.removeValue(list, 80);
        SLLnoTail.removeValue(list, 90);
    }
}
