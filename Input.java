import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Gender? ");
        char gender = sc.next().charAt(0); //There is no classical nextChar() method in Java Scanner class
        System.out.print("Enter your height in cm: ");
        double height = sc.nextDouble();

        System.out.println(); //just a line break;

        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);

        //input for strings
        System.out.print("Enter your first name: ");
//        String fname = sc.next(); //for a word till space/enter.
        String fname = sc.nextLine().split(" ")[0]; //If you use next() then later nextLine() will not be executed. Go check it yourself.
        System.out.println(fname);

        //Let's try to give input for a sentence.
        System.out.print("Enter your full-name: ");
        String full_name = sc.nextLine(); //for a sentence including spaces.
        System.out.println(full_name);
    }
}