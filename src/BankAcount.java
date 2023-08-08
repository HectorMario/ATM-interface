public class BankAcount {
    String nameClient;
    TypeAcount typeAcount;
    double balance;
    final double COMMISSION = 1.2;
    BankAcount (String nameClient, TypeAcount typeAcount, double balance){
        this.nameClient = nameClient;
        this.typeAcount = typeAcount;
        this.balance = balance;
    }

    BankAcount(String nameClient , double balance){
        this(nameClient, TypeAcount.SAVINGS, balance);
    }

    BankAcount(){
        this("", TypeAcount.SAVINGS, 0);
    }

    void withdrawMoney(double quantity){
        if (quantity < 0){
            return;
        }
        double commission = getComision();
        balance -= quantity;
        balance -= commission;
    }

    void putMoney(double quantity){
        if (quantity < 0 ){
            return;
        }
        balance += quantity;
    }

    void changeTypeCount(TypeAcount typeAcount){
        this.typeAcount = typeAcount;
    }

    double getBalance(){
        return balance;
    }

    double getComision(){
        switch (typeAcount){
            case SAVINGS :
                return COMMISSION;
            default:
                return 0;
        }
    }
}
