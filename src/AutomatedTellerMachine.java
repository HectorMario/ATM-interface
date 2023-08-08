import java.util.Scanner;
public class AutomatedTellerMachine {

    AutomatedTellerMachine(String user, String password){

    }

    public static void main(String[] args) {
        TypeAcount actualBankAcount;

        BankAcount testAcount = new BankAcount("Hector", 25_000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String username = scanner.next();
        if(username.equals(testAcount.nameClient)){
            boolean controlWhile = true;
            do {
                Interface clientInterface =  new Interface();
                int option = clientInterface.ClientInterface();
                double quantity;
                switch (option){
                    case 1:
                        System.out.println("Your balance is: " +  testAcount.getBalance());
                        break;
                    case 2:
                        System.out.println("How much: ");
                        quantity = scanner.nextDouble();
                        testAcount.putMoney(quantity);
                        System.out.println("Your balance is: " +  testAcount.getBalance());
                        break;
                    case 3:
                        System.out.println("How much: ");
                        quantity = scanner.nextDouble();
                        testAcount.withdrawMoney(quantity);
                        System.out.println("Your balance is: " +  testAcount.getBalance());
                        break;
                    case 4:
                        break;
                    default:
                        controlWhile = false;
                }
            } while (controlWhile);

        }
    }
}
