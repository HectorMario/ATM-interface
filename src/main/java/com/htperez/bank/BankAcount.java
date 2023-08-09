package com.htperez.bank;
public class BankAcount {
    public String nameClient;
    private TypeAcount typeAcount;
    private double balance;
    private final double COMMISSION = 1.2;
    public BankAcount (String nameClient, TypeAcount typeAcount, double balance){
        this.nameClient = nameClient;
        this.typeAcount = typeAcount;
        this.balance = balance;
    }

    public BankAcount(String nameClient , double balance){
        this(nameClient, TypeAcount.SAVINGS, balance);
    }

    public BankAcount(){
        this("", TypeAcount.SAVINGS, 0);
    }

    public void withdrawMoney(double quantity){
        if (quantity < 0){
            return;
        }
        double commission = getComision();
        balance -= quantity;
        balance -= commission;
    }

    public void putMoney(double quantity){
        if (quantity < 0 ){
            return;
        }
        balance += quantity;
    }

    public void changeTypeCount(TypeAcount typeAcount){
        this.typeAcount = typeAcount;
    }

    public double getBalance(){
        return balance;
    }

    private double getComision(){
        switch (typeAcount){
            case SAVINGS :
                return COMMISSION;
            default:
                return 0;
        }
    }
}
