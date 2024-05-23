/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingandsortingalgorithms;

/**
 *
 * @author m7md
 */
public class StackX {
    int maxSize;
    long[] stackArray;
    int top;
    
    public StackX(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    
    public void push(long item){
        stackArray[++top] = item;
    }
    
    public long pop(){
        return stackArray[top--];
    }
    
    public long peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return top == maxSize - 1;
    }
    
}
