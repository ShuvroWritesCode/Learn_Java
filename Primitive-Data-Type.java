public class main {
    public static void main(String[] args){

        /*Primitive Data Type
        Byte - 1 [-128 ~ 127]
        Short - 2 [-32k ~ 32k]
        int - 4 [-2B ~ 2B]
        long -  8 [-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807]
        float - 4 [up to 7 decimal digits]
        double - 8 [up to 16 decimal digits]
        char - 2
        boolean - 1 [true/false]
        */

        /*Non-Primitive Data Type
        String
        Arrays
        * */

        Byte age = 17;
        short ID = 32457;
        int Phone1 = 017746324321;
        long Phone2 = 589278905674274L; //L is added after the number to simplify the compiler and language specification.
        float height = 1.75F; //F is added to specify it is a float type, and not a double.
        double weight = 69.25;
        char gender = 'M';
        boolean isAdult = false;

        System.out.println(age + "\n" + ID + "\n" + Phone1 + "\n" + Phone2 + "\n" + height + "\n" + weight + "\n" + gender + "\n" + isAdult);

    }
}