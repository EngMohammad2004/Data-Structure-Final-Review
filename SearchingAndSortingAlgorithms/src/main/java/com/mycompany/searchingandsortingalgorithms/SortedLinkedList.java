/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingandsortingalgorithms;

/**
 *
 * @author m7md
 */
class Node{
    int data;
    Node next;
    
    public Node(int i){
        data = i;
        next = null;
    }
    
    public void displayNode(){
        System.out.print(data + ", ");
    }
}

public class SortedLinkedList {
    Node first;
    
    public SortedLinkedList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void insert(int i){
        Node newNode = new Node(i);
        if(isEmpty() || newNode.data < first.data){
            newNode.next = first;
            first = newNode;
        }else{
            Node current = first;
            while(current.next != null && current.next.data < newNode.data){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }
    
    public void display(){
        Node current = first;
        while(current != null){
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println("");
    }
    
}