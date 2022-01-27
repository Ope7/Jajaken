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
public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String fightOn;
        
        do // We want the program to run at least once before they are asked if they want to play again
        {    
            System.out.println("How many timelines/rounds would you like to explore? You choice can range from 1 to 10");

            String numberOfRounds = sc.nextLine();

            if (Integer.parseInt(numberOfRounds) > 10 || Integer.parseInt(numberOfRounds) < 1) {
                System.out.println("Sorry we do not have these number of timelines!");
                break; // This ends the entire loop
            } 
            else {


                int computerWins = 0;
                int playerWins = 0;
                int tie = 0;
                while ((computerWins + playerWins + tie) < Integer.parseInt(numberOfRounds)) {
                    String[] rockPaperScissors = {"Rock", "Paper", "Scissors"};
                    // I created an array to store the various choices

                    String computerChoice = rockPaperScissors[new Random().nextInt(rockPaperScissors.length)];
                    // The above line is in order to make the computer's choice random, meaning
                    // it selects 0, 1 0r 2 at random because of the array's length

                    // The line below is to get the player's choice
                    String playerChoice;
                    while (true) {
                        // Then we ask the player to enter their choice
                        System.out.println("Please enter your choice, either Rock, Paper or Scissors");
                        playerChoice = sc.nextLine();

                        if (playerChoice.equals("Rock") || playerChoice.equals("Paper") || playerChoice.equals("Scissors")) {
                            break;
                        }
                        System.out.println("This is not a valid move, please enter a valid move");
                    // So the while loop above asks the player to enter either one of the 3 choices given
                    // if they don't they are prompted to enter one over and over until they do
                    }

                    System.out.println("Computer played " + computerChoice);

                    // Now we start writing the game logic. We begin with a tie assessment
                    if (playerChoice.equals(computerChoice)) {
                        System.out.println("The game was a tie!");
                        tie ++;
                    }
                    // Next we assess the other outcomes
                    else if (playerChoice.equals("Rock")) {
                        if (computerChoice.equals("Paper")) {
                            System.out.println("Skynet wins. Hahaha!");
                            computerWins ++;
                        }
                        else if (computerChoice.equals("Scissors")) {
                            System.out.println("Good job Connor");
                            playerWins ++;
                        }
                    }
                    else if (playerChoice.equals("Paper")) {
                        if (computerChoice.equals("Scissors")) {
                            System.out.println("Skynet wins. Hahaha!");
                            computerWins ++;
                        }
                        else if (computerChoice.equals("Rock")) {
                            System.out.println("Good job Connor");
                            playerWins ++;
                        }
                    }
                    else if (playerChoice.equals("Scissors")) {
                        if (computerChoice.equals("Rock")) {
                            System.out.println("Skynet wins. Hahaha!");
                            computerWins ++;
                        }
                        else if (computerChoice.equals("Paper")) {
                            System.out.println("Good job Connor");
                            playerWins ++;
                        }
                    }
                }
                System.out.println("And the final score is " + playerWins + " points to Connor " + computerWins + " points to Skynet and it's a tie " + tie + " times.");
                // The if statement below declares the winner
                if (playerWins > computerWins) {
                    System.out.println("Humanity wins.");
                }
                else if (computerWins > playerWins) {
                    System.out.println("The robots have taken over!!!");
                }
                else {
                    System.out.println("The war continues...");
                }
                System.out.println("Would you like fight on? Choose Yes or No");
                
            }
            fightOn = sc.nextLine(); 
        } while (fightOn.equals("Yes"))   ; // This ensures that the player remains in the battle if they so choose
        
        
    }
}
