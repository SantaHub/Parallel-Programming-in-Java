package edu.coursera.parallel;

public class SLLnoTail {

    Node head;

     static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static int getSize(SLLnoTail list){
        int size =0;
        Node pointer = list.head;
        while(pointer != null ) {
            size++;
            pointer = pointer.next;
        }
        System.out.println("The size of your list is : "+ size);
        return size;
    }

    public static void printList(SLLnoTail list){
         Node pointer = list.head;
         if(pointer == null) {
             System.out.println("Sorry, the list is empty.");
         } else {
             System.out.println("Printing the list : ");
             while(pointer != null) {
                 System.out.println(pointer.data);
                 pointer = pointer.next;
             }
             System.out.println("Printing Completed. Thank you !");
         }
    }

    public static boolean isValuePresent(SLLnoTail list, int value){
        Node pointer = list.head;
        boolean isValuePresent = false;
        while(pointer != null){
            if(pointer.data == value){
                isValuePresent = true;
                break;
            }
            pointer = pointer.next;
        }
        return isValuePresent;
    }

    public static  boolean checkValuePresent(SLLnoTail list, int value){
         boolean isValuePresent = isValuePresent(list, value);
        if(isValuePresent){
            System.out.println("Congratulations, "+ value+" is present the list !");
        } else {
            System.out.println("Sorry, "+ value+" is not in the list.");
        }
        return isValuePresent;
    }

    // Returns true when added and false when already present in list
    public static boolean addValue(SLLnoTail list, int value){
         boolean isValueAdded = false;
         Node pointer = list.head;
         boolean isValuePresent = isValuePresent(list, value);
         if(isValuePresent){
             System.out.println(value +" is present inside the list.");
         } else {// Adding value when not present.
             while (pointer !=null && pointer.next.next !=null){
                 pointer = pointer.next;
             }
             Node newNode = new Node(value);
             pointer.next = newNode;
             isValueAdded = true;
             System.out.println("We have added "+ value+" to the list for you. Thank you.");
         }
         return isValueAdded;
    }

    // Returns true when remove and false when not present in the list.
    public static boolean removeValue(SLLnoTail list, int value){
        Node pointer = list.head;
        boolean isValuePresent = isValuePresent(list, value);
        boolean isValueRemoved = false;
        if(isValuePresent){
            while (pointer != null && pointer.next.data != value ){
                pointer = pointer.next;
            }
            Node nodeToBeRemove = pointer.next;
            pointer.next = nodeToBeRemove.next;
            isValueRemoved = true;
            System.out.println("We have remove "+value+ " from the list. Thank you.");
        } else {
            System.out.println("Sorry, "+value+" is not present inside the list.");
        }
        return isValueRemoved;
    }

}
