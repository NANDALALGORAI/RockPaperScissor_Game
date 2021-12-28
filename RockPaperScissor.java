package com.company;
import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Welcome To Rock Paper Scissors Game \n - For Rock Enter (0) \n - For Paper Enter (1) \n - For Scissor Enter (2) \n Your Choice : ");
        byte user_input = 0;
        Scanner sc = new Scanner(System.in);
        user_input = sc.nextByte();
        Random choice = new Random();
        int random_choice = choice.nextInt(2);
        System.out.println("Computer's Choice : " + random_choice);

        // Win Situations
        if (user_input==0 && random_choice == 1 || user_input==1 && random_choice==0 || user_input==2 && random_choice==1){
            System.out.println("You Win !");
        }

        // Draw Situations
        else if(user_input==0 && random_choice==0 || user_input==1 && random_choice==1 || user_input==2 && random_choice==2){
            System.out.println("Draw !");
        }

        // if not correct option
        else if(user_input>=3){
            System.out.println("Enter the correct one !");
        }

        // Loose situation
        else{
            System.out.println("Loose !");
        }
    }
}
