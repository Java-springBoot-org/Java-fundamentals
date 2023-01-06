package Collections;

// circular linked list is a type of linked list where the last node points back to
// the first node, forming a circle. Here is a step-by-step guide to implementing a circular linked list in Java:

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class CircularLinkedLists {
    Node head;
    Node tail;

    public void CircularLinkedList() {
        head = null;
        tail = null;
    }

//    Implement a method for inserting a new node into the list. This can be done by creating a new node and adding it to the end of the list. To do this, you will need to update the next field of the current tail node to point to the new node, and then update the tail node to be the new node. For example:
public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }
    tail.next = head;  // make the list circular
}
//
//    Implement a method for traversing the list and printing the data at each node. This can be done using a loop that starts at the head node and follows the next links until it reaches the tail node. For example:

    public void printList() {
        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != tail);
        System.out.println(tail.data);  // print the data at the tail node
    }



}
