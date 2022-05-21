public class main {
    public static void main(String[] args){

    //strings in java are immutable!!!

    //string concatenation
    String first_name = "Casey";
    String last_name = "Neistat";
    String name = first_name + " " + last_name;
    System.out.println(name + "\n");

    //charAt
    String fullname = "Casey Neistat";
    System.out.println(fullname.charAt(0));
    System.out.println(fullname.charAt(1));
    System.out.println(fullname.charAt(2));
    System.out.println(fullname.charAt(3));
    System.out.println(fullname.charAt(4));
    System.out.println(fullname.charAt(5));

    //length
    System.out.println(first_name.length());
    System.out.println(name.length());
    System.out.println(fullname.length() + "\n");

    //replace
    String name2 = name.replace('C', 'S');
    System.out.println(name2 + "\n");

    //substring
        String name3 = "nyc is New York City!";
        System.out.println(name3.substring(0, 4)); //BeginIndex is counted but the EndIndex is not included.
    }
}