import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MovimentsGenerator {
    ArrayList<String> typeMovements = new ArrayList<String>(
            Arrays.asList("Transfer: ", "Deposit: ", "Withdrawal: ", "Card payment: ", "Payroll deposit: ", "Bill payment: ")
    );
    ArrayList<String> getMoviments(int quantityMoviments, String typemoney){
        ArrayList<String> moviments = new ArrayList<String>();
        for (int i = 0; i < quantityMoviments; i++){
            double transferRandom = randomNumber(1, 3_000);
            int positionRandom = positonRamdom(0 , typeMovements.toArray().length -1 );
            moviments.add(typeMovements.get(positionRandom) +   String.format("%.2f", transferRandom) + " " + typemoney);
        }
        return moviments;
    }

    double randomNumber(int min, int max){
        return ThreadLocalRandom.current().nextDouble(min, max + 1.0);
    }

    int positonRamdom(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
