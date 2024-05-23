/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingandsortingalgorithms;

/**
 *
 * @author m7md
 */
public class BinarySearch {
    int[] array;
    
    public int findBSearch(int[] arr, int key){
        array = arr;
        int lower = 0, higher = array.length - 1, curIn;
        
        while(true){
            curIn = (lower + higher) / 2;
            if(array[curIn] == key){
                System.out.println("Key found at index: " + curIn);
                return curIn;
            }else if(lower > higher)
                return -1;
            else{
                if(key < array[curIn])
                    higher = curIn - 1;
                else
                    lower = curIn + 1;
                
            }
        }
        
    }
}
