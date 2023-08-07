import java.util.Scanner;

public class INTERFACE{
    public static void main(String[] args) {
        Scanner client = new Scanner(System.in);
        System.out.println("Please select an option:");
        System.out.println("Select 1 to inquire about your account balance");
        System.out.println("Select 2 to deposit cash");
        System.out.println("Select 3 to withdraw cash");
        System.out.println("Select 4 to view your latest transactions");
        System.out.print("Select an option and press enter: ");
        int option = client.nextInt();
        System.out.println("You have selected option: " + option);
    }
}
