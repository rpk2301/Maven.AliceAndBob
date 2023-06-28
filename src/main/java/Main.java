import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = "";
        String Alice = "Alice";
        String Bob = "Bob";
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = scan.nextLine();


        //If the name entered is bob or alice, return the print statement welcoming them.
        if (name.equals(Bob)|| name.equals(Alice))
        {
        System.out.println("Hello, " + name);
        }

    }
}





