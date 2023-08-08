import java.util.Scanner;

public class INTERFACE{
    public static void main(String[] args) {
        Scanner client = new Scanner(System.in);
        boolean controlWhile = true ;
        String OPTION1 = "inquire about your account balance";
        String OPTION2 = "deposit cash";
        String OPTION3 = "withdraw cash";
        String OPTION4 = "view your latest transactions";

        while (controlWhile){
            System.out.println("Please select an option:");
            System.out.println("Select 1 to "+OPTION1);
            System.out.println("Select 1 to "+OPTION2);
            System.out.println("Select 1 to "+OPTION3);
            System.out.println("Select 1 to "+OPTION4);
            System.out.print("Select an option or other key for exit and press enter: ");
            int option = client.nextInt();
            switch (option) {
                case 1:
                    System.out.println("You have selected option: " + OPTION1);
                    break;
                case 2:
                    System.out.println("You have selected option: " + OPTION2);
                    break;
                case 3:
                    System.out.println("You have selected option: " + OPTION3);
                    break;
                case 4:
                    System.out.println("You have selected option: " + OPTION4);
                    break;
                default:
                    System.out.println("Good bye, thanks for use us services");
                    controlWhile = false;
            }
        }
    }
}
