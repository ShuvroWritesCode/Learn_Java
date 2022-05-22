public class main {
    public static void printJava(){
        System.out.println("Learning Basic Java is Over!");
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        int i = 0;
        while(i < 100){
            printJava();
            i++;
        }
        printName("--THE END--");
    }
}