public class main {
    public static void main(String[] args){

        //TRY-CATCH in exception handling
        int[] marks = {97, 64, 87};
        try{
            System.out.println(marks[5]);
        }
        catch(Exception exception) {
            //something after catching the exception.
        }
        System.out.println("Exception is handled");
    }
}