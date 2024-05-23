

package com.mycompany.searchingandsortingalgorithms;

/**
 *
 * @author m7md
 */
public class SearchingAndSortingAlgorithms {

    public static void main(String[] args) {
        //////////////////    Binary Search    ////////////////////////////////////////
        System.out.println("//////////////////    Binary Search    ////////////////////////////////////////");
        
        Array BSearchArray = new Array(20);
        BSearchArray.insert(3);
        BSearchArray.insert(4);
        BSearchArray.insert(6);
        BSearchArray.insert(7);
        BSearchArray.insert(14);
        BSearchArray.insert(26);
        BSearchArray.insert(28);
        BSearchArray.insert(78);
        BSearchArray.insert(89);
        BSearchArray.insert(120);
        BSearchArray.insert(310);
        
        System.out.println(BSearchArray.findBSearch(26));
        
        //////////////////    Sorting    ////////////////////////////////////////
        System.out.println("//////////////////    Sorting    ////////////////////////////////////////");
        
        Array SortArray = new Array(20);
        SortArray.insert(5);
        SortArray.insert(6);
        SortArray.insert(2);
        SortArray.insert(3);
        SortArray.insert(1);
        SortArray.insert(4);
        SortArray.insert(0);
        
        // SortArray.bubbleSort();
        // SortArray.selectionSort();
        SortArray.insertionSort();
        
        SortArray.display();
        
        //////////////////////////    Stack With Array    ////////////////////////////////
        System.out.println("///////////////////////////    Stack With Array    ////////////////////////////////");
        
        StackX theStack = new StackX(20);
        
        theStack.push(11);
        theStack.push(73);
        theStack.push(34);
        theStack.push(122);
        theStack.push(16);
        theStack.push(63);
        theStack.push(23);
        theStack.pop();
        theStack.pop();
        theStack.pop();
        theStack.push(33);
        theStack.push(4);
        theStack.push(2);
        
        while(!theStack.isEmpty())
            System.out.print(theStack.pop() + ", ");
        System.out.println("");
        
        //////////////////////////    Queue With Array    ////////////////////////////////
        System.out.println("///////////////////////////    Queue With Array    ////////////////////////////////");
        
        Queue theQue = new Queue(20);
        theQue.insert(3);
        theQue.insert(32);
        theQue.insert(33);
        theQue.insert(12);
        theQue.insert(23);
        theQue.insert(16);
        theQue.insert(37);
        theQue.remove();
        theQue.remove();
        theQue.remove();
        theQue.insert(89);
        theQue.insert(12);
        theQue.insert(322);
        theQue.insert(241);
        
        while(!theQue.isEmpty())
            System.out.print(theQue.remove() + ", ");
        System.out.println("");
        
        //////////////////////////    Priority Queue With Array    ////////////////////////////////
        System.out.println("///////////////////////////    Priority Queue With Array    ////////////////////////////////");
        
        PriorityQ pQue = new PriorityQ(100);
        pQue.insert(4);
        pQue.insert(3);
        pQue.insert(5);
        pQue.insert(2);
        pQue.insert(7);
        pQue.insert(6);
        pQue.insert(9);
        pQue.insert(10);
        pQue.insert(8);
        pQue.insert(1);
        pQue.remove();
        pQue.remove();
        pQue.remove();
        
        while(!pQue.isEmpty())
            System.out.print(pQue.remove() + ", ");
        System.out.println("");

        //////////////////////////    Linked List    ////////////////////////////////
        System.out.println("///////////////////////////    Linked List    ////////////////////////////////");
        
        LinkedList list = new LinkedList();
        list.insertFirst(87);
        list.insertFirst(42);
        list.insertFirst(18);
        list.insertFirst(14);
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertFirst(22);
        list.insertFirst(19);
        list.insertFirst(6);
        list.insertFirst(2);
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        
        list.display();
        
        //////////////////////////    Stack With Linked List    ////////////////////////////////
        System.out.println("///////////////////////////    Stack With Linked List    ////////////////////////////////");
        
        LinkedList stackList = new LinkedList();
        stackList.insertFirst(8);
        stackList.insertFirst(7);
        stackList.insertFirst(6);
        stackList.insertFirst(5);
        stackList.insertFirst(4);
        stackList.insertFirst(3);
        stackList.insertFirst(2);
        stackList.insertFirst(1);
        stackList.insertFirst(0);
        
        while(!stackList.isEmpty())
            System.out.print(stackList.deleteFirst().data + ", ");
        System.out.println("");
        
        //////////////////////////    Queue With Linked List    ////////////////////////////////
        System.out.println("///////////////////////////    Queue With Linked List    ////////////////////////////////");
        
        LinkedList queList = new LinkedList();
        queList.insertLast(8);
        queList.insertLast(7);
        queList.insertLast(6);
        queList.insertLast(5);
        queList.insertLast(4);
        queList.insertLast(3);
        queList.insertLast(2);
        queList.insertLast(1);
        queList.insertLast(0);
        
        while(!queList.isEmpty())
            System.out.print(queList.deleteFirst().data + ", ");
        System.out.println("");
        
        //////////////////////////    Sorted Linked List    ////////////////////////////////
        System.out.println("///////////////////////////    Sorted Linked List    ////////////////////////////////");
        
        SortedLinkedList sortedList = new SortedLinkedList();
        sortedList.insert(4);
        sortedList.insert(5);
        sortedList.insert(2);
        sortedList.insert(7);
        sortedList.insert(8);
        sortedList.insert(1);
        sortedList.insert(6);
        sortedList.insert(3);
        sortedList.insert(0);
        
        sortedList.display();
    }
}
