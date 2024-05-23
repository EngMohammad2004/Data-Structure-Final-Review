/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingandsortingalgorithms;

/**
 *
 * @author m7md
 */
class Link{
    int data;
    Link next;
    
    public Link(int i){
        data = i;
        next = null;
    }
    
    public void displayLink(){
        System.out.print(data + ", ");
    }
}
public class LinkedList {
    Link first;
    Link last;
    
    public LinkedList(){
        first = null;
        last = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void insertFirst(int i){
        Link newLink = new Link(i);
        if(first == null)
            last = newLink;
        newLink.next = first;
        first = newLink;
    }
    
    public void insertLast(int i){
        Link newLink = new Link(i);
        if(first == null)
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }
    
    public Link deleteFirst(){
        Link temp = first;
        if(first.next == null)
            last = null;
        first = first.next;
        return temp;
    }
    
    public void display(){
        Link current = first;
        while(current != null){
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println("");
    }
    
}
