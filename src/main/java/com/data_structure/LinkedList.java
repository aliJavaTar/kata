package com.data_structure;
// add  reverse get

import lombok.Getter;
import lombok.Setter;

// add index - > next location index
public class LinkedList<T> {
    Node<T> node;

    public void add(T data) {
        Node<T> nextNode = new Node<>(data);
        if (node == null) {
            node = nextNode;
        }
        Node<T> exist = node;
        while (exist.getNext() != null) {
            exist = exist.getNext();
        }
        exist.setNext(nextNode);
    }

    public void get() {
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
        System.out.println("null");
    }
}

@Getter
class Node<D> {
    private final D data;
    @Setter
    private Node<D> next;

    Node(D data) {
        this.data = data;
        next = null;
    }

}