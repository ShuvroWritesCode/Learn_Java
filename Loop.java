public class main {
    public static void main(String[] args){
        int n = 10;
        //For Loop
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
        System.out.println();
        //While Loop
        int i = 0;
        while(i < n){
            System.out.println(i);
            i++;
        }
        System.out.println();
        //Do-While Loop
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while(j < n);
    }
}