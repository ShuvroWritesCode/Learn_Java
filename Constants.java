public class main {
    public static void main(String[] args){

        //Variables
        int age = 31;
        age = 32;
        age = 33; //age changes every year.
        double weight = 69.254;
        weight = 67.23;
        weight = 83.2384; //weight may vary from time to time.
        boolean decision = true;
        decision = false; //decision might change depending on situations.

        //Constants
        /*
        Can the value of pie ever change?
        Can the value of golden ratio change?
        - NO.
        This is where constants are used.
        */

        final float PI = 3.1416F; //final prefix makes each of these constants.
       //PI = 3.13234; - You cannot change a constant. You will face an error if you try to.
        final double GOLDEN_RATIO = 1.6180339; //It is a convention to name each constant in UPPERCASE letters.
    }
}