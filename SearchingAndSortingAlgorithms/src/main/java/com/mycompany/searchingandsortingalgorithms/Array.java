/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingandsortingalgorithms;

/**
 *
 * @author m7md
 */
public class Array {
    private long[] a;
    private int nElems;
    
    public Array(int max){
        a = new long[max];
        nElems = 0;
    }
    
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    
    public void display(){
        for(int j=0; j<nElems; j++)
        System.out.print(a[j] + "");
        System.out.println("");
    }
    
    ////////////////////////    Binary Search     ///////////////////////
    
    public int findBSearch(long key){
        
        int lower = 0, higher = nElems - 1, curIn;
        
        while(true){
            curIn = (lower + higher) / 2;
            if(a[curIn] == key){
                System.out.println("Key found at index: " + curIn);
                return curIn;
            }else if(lower > higher)
                return -1;
            else{
                if(key < a[curIn])
                    higher = curIn - 1;
                else
                    lower = curIn + 1;
                
            }
        }
        
    }
    
    ////////////////////////    Bubble Sort     ///////////////////////
    
    public void bubbleSort(){
        int in, out;
        
        for(out = 0; out < nElems - 1; out++){
            for(in = 0; in < nElems - out - 1; in++){
                if(a[in] > a[in + 1])
                    swap(in, in + 1);
            }
        }
    }
    
    public void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    
    ////////////////////////    Selection Sort     ///////////////////////
    
    public void selectionSort(){
        int in,out,min;
        
        for(out = 0; out < nElems - 1; out++){
            min = out;
            for(in = 0; in < nElems - out - 1; in++){
                if(a[min] > a[out + in + 1])
                    swap(min, out + in + 1);
            }
        }
    }
    
    ////////////////////////    Insertion Sort     ///////////////////////
    
    public void insertionSort(){
        int out, in;
        
        for(out = 1; out < nElems; out++){
            in = out;
            long temp = a[out];
            
            while(in > 0 && a[in - 1] >= temp){
                a[in] = a[in -1];
                --in;
            }
            a[in] = temp;
        }
    }
    
    
}
