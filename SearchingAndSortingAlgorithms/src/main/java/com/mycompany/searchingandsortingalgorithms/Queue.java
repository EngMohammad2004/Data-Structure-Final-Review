/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingandsortingalgorithms;

/**
 *
 * @author m7md
 */
public class Queue {
    int maxSize;
    long queArray[];
    int front;
    int rear;
    int nItems;
    
    public Queue(int s){
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public void insert(long item){
        if(rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = item;
        nItems++;
    }
    
    public long remove(){
        long temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }
    
    public long peekFront(){
        return queArray[front];
    }
    
    public boolean isEmpty(){
        return nItems == 0;
    }
    
    public boolean isFull(){
        return nItems == maxSize;
    }
    
    public int size(){
        return nItems;
    }
}
