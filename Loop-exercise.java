import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        for(;number >= 0;){
            System.out.println("Enter your number: ");
            number = sc.nextInt();
            System.out.println("Your number is: " + number);
        }
    }
}