package com.elbudii.homework3.linkedList;

import java.util.List;
import java.util.ListIterator;

public class Node {
    private int value; //the current element of the list
    private Node next; // link to next list
    private Node first; //the link to the first element
    public Node(int value) {
        this.value =value;
    }

    public int getValue() {return value;}

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {this.next = next;}

    public void add(Node node)  {
        Node last = this;
        while (last.getNext() != null) {
            last = last.getNext();
            return;
        }
        last.setNext(node);
        tail += 1;
        if (first == null)
            first = last;
    }

    public void removeLast() {
        Node last = this;
        if (last.getNext() != null) {
            while (last.getNext().getNext() != null) {
                last = last.getNext();
            }
            last.setNext(null);
        }
        else
            first = null;
    }

    //public void print(Node head) {
   /*     System.out.print(head.getValue() + " --> ");
        if (head.getNext() != null) {
            print(head.getNext());
       }
        System.out.println();
    }*/
    public void print() {
        if (first != null) {
            Node t = first;
            while (t != null) {
                System.out.print(t.getValue() + " --> ");
                t = t.getNext();
            }
            System.out.println();
        } else
            System.out.println("NULL");
    }

    /**
     * Removes Node from list that is located on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     */
    public void remove(int position) {
    /*Your code here*/
    }

    /**
     * Adds Node to list on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     */
    public void addNode(int position) {
        /*Your code here*/
    }

    /**
     * Gets then Node that located on the position starting from the tail (end of the list)
     * if position is more than list size - prints error message
     * @param position number of the Node starting from the tail
     * @return Node that located on the position from the tail (end of list) if position exists in list
     */
    public Node getFromTail(int position) {
        /*Your code here and please remove "return null". I've put it for ability to compile code*/
        return null;
    }
}
