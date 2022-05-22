import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int random = (int)(Math.random()*10);
        System.out.println("Welcome to Guessing Game!!");
        System.out.println();
        System.out.println();

        for(int i = 0; i < 3; i++){
        System.out.println("Guess a number from 0 to 9 --> ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Your given input was " + number);
            if(random > number){
                System.out.println("Ah! The correct number is greater than that!");
            }
            else if(random == number){
                System.out.println("Congratulations! You did the right guess.");
                break;
            }
            else{
                System.out.println("Hmm mmm, try something less than that.");
            }
        }
    }
}