public class main {
    public static void main(String[] args){

        //Assignment Operators
        int a = 15;
        System.out.println(a += 3); // 8
        System.out.println(a -= 3); // 2
        System.out.println(a *= 3); // 15
        System.out.println(a /= 5); // 1

        //Relational Operators
        int b = 8;
        int c = 6;
        if(b == c){
            System.out.println("equal");
        }
        else if(b != c){
            System.out.println("not equal");
        }
        else if(b < c){
            System.out.println("less than");
        }
        else if(b > c){
            System.out.println("greater than");
        }
        else if(b <= c){
            System.out.println("less or equal");
        }
        else if(b >= c){
            System.out.println("greater or equal");
        }

        //Logical Operators - return boolean
        System.out.println(a == b && b == c);
        System.out.println(a >= b || b <= c);
        System.out.println(!(a == b));

    }
}