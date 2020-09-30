package com.company;
import java.util.Random;
import java.util.Scanner;
public class solving_exercise2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int upperval = 4;
        int chance;
        int rounds = 1;
        int usrscore = 0;
        int compscore = 0;
        chance = 0;
        System.out.println("Welcome to the game here you are going to play Rock Paper Scissor");
        System.out.println("You have 5 chances");
        while (chance < 5) {
            int int_random = rand.nextInt(upperval - 1);
            System.out.println("---------------------------------------------------------------------------------------+");
            System.out.println("Instructions:                                                                          |");
            System.out.println("To choose Rock press 0, For Paper choose 1, and press 2 for Scissor                    |");
            System.out.println("---------------------------------------------------------------------------------------+");
            System.out.println("Round "+rounds);
            rounds++;
            int input = sc.nextInt();

//            if User chooses Rock
            if (input == 0) {
                System.out.println("You choose Rock");
                if (int_random == 0) {
                    System.out.println("Computer choose Rock");
                    System.out.println("Match has tied");
                } else if (int_random == 1) {
                    System.out.println("Computer choose Paper");
                    System.out.println("You Loose");
                    compscore++;
                } else if (int_random == 2) {
                    System.out.println("Computer choose Scissor");
                    System.out.println("You Win");
                    usrscore++;
                } else {
                    System.out.println("Here is an error i will solve this shortly");
                }
                chance = ++chance;
                System.out.print("Chances completed ");
                System.out.print(chance);
                System.out.println("/5");

            }

//            IF User chooses Paper
            else if (input == 1) {
                System.out.println("You choose Paper");
                if (int_random == 0) {
                    System.out.println("Computer choose Rock");
                    System.out.println("You Win");
                    usrscore++;
                } else if (int_random == 1) {
                    System.out.println("Computer choose Paper");
                    System.out.println("Match has tied");
                } else if (int_random == 2) {
                    System.out.println("Computer choose Scissor");
                    System.out.println("You Loose");
                    compscore++;
                } else {
                    System.out.println("Here is an error i will solve this shortly");
                }
                chance = ++chance;
                System.out.print("Chances completed ");
                System.out.print(chance);
                System.out.println("/5");

            }

//            If User chooses Scissor
            else if (input == 2) {
                System.out.println("You choose Scissor");
                if (int_random == 0) {
                    System.out.println("Computer choose Rock");
                    System.out.println("You Loose");
                    compscore++;
                } else if (int_random == 1) {
                    System.out.println("Computer choose Paper");
                    System.out.println("You Win");
                    usrscore++;
                } else if (int_random == 2) {
                    System.out.println("Computer choose Scissor");
                    System.out.println("Match has tied");
                } else {
                    System.out.println("Here is an error I will solve this shortly");
                }
                chance = ++chance;
                System.out.print("Chances completed ");
                System.out.print(chance);
                System.out.println("/5");

            }
//            If Invalid input occurs
            else {
                System.out.println("Please enter a valid Input");

            }
        }
        System.out.println("Computer's Score is "+compscore);
        System.out.println("Your Score is "+usrscore);
        if (usrscore<compscore){
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("|                        You Loose                              |");
            System.out.println("+---------------------------------------------------------------+");
        }
        else if (usrscore>compscore){
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("|                        You Win                                |");
            System.out.println("+---------------------------------------------------------------+");
        }
        else {
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("|                        Match has tied                         |");
            System.out.println("+---------------------------------------------------------------+");
        }

    }
}