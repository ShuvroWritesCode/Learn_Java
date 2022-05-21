public class main {
    public static void main(String[] args){

        int a = 5;
        int b = 10;
        
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));

        System.out.println(Math.random()); //this random function can generate random number from 0.0 ~ 1.0
        System.out.println((int)(Math.random()*10)); //if we want to get random number from 0 ~ 9
        System.out.println((int)(Math.random()*100)); //if we want to get random number from 0 ~ 99
    }
}