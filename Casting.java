public class main {
    public static void main(String[] args){

        //Casting
        //Implicit casting - auto in java
        int price = 100;
        double finalPrice = price + 15.00;
        System.out.println(finalPrice);

        //Explicit casting
        int p = 100;
        // int fb = p + 15.00; - This syntax will give an error.
        int fp = p + (int) 15.00; //Here, we used explicit casting.
        System.out.println(fp);
    }
}