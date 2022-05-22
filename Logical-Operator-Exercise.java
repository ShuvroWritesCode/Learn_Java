import java.util.Scanner;
public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int product_price, balance = 9999;
        boolean card_balance;
        System.out.println("Enter price of the product: ");
        product_price = sc.nextInt();
        System.out.println("Inserd card --> ");
        card_balance = sc.nextBoolean();
        if(product_price <= balance){
            System.out.println("Product Purchased!");
        }
        else{
            System.out.println("Insufficient Balance!");
        }
    }
}