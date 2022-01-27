/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.assessment;

import java.util.Scanner;

/**
 *
 * @author okeow
 */
public class HealthyHearts {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your age?");
        
        String age = sc.nextLine();
        
        int max = 220-Integer.parseInt(age);
        
        System.out.println("Your maximum heart rate should be " + max + " beats per minute");
        
        System.out.println("Your target HR Zone is " + (0.5*max) + " - " + (0.85*max) + " beats per minute");
        
        
    }
}
