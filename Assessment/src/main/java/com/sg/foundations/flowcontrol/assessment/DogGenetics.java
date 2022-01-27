/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.assessment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author okeow
 */
public class DogGenetics {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your dog's name?");
        
        String dogName = sc.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(); // Leaves a line empty
        
        // Using lists below to declare the breeds
        String[] breeds = {"Hell Hound", "Cerebus", "Dire Wolf", "Shar Pei", "Dingo"} ;
        
        Random percentage = new Random();
        
        int startPercent = 100;
        int percentBreed = 0;
        
        System.out.println(dogName + " is: ");
        System.out.println();
        
        for (int i =0; i < 5; i++) {  // This loops around the list
            String breed = breeds[i]; // Selecting the breed one by one
            
            if (i != 4) {
                percentBreed = percentage.nextInt(startPercent);
                startPercent -= percentBreed;
            }
            else {
                percentBreed = startPercent;
            }
            
            System.out.println(percentBreed + "%" + breed );
        }
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
        
        
    }
    
}
