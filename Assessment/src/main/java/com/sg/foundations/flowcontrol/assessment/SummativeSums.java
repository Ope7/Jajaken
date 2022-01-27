/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.assessment;

/**
 *
 * @author okeow
 */
public class SummativeSums {
    
    public static void main(String[] args) {
        
        
        int array1[] = {43, 55, 33, 21};
        int array2[] = {1, 2, 76, 42, 22, 58, 54};
        int array3[] = {19, 27, 38, -83};
        
        addArray(array1, 1);
        addArray(array2, 2);
        addArray(array3, 3);
    }
    
    public static int addArray(int array[], int x) {
        int sum = 0;
        
        for (int i: array) {
            sum += i;
        }
        System.out.println("#" + x + " Array Sum: " + sum);
        return 0;
        
    }
}
