package com.company;

public class Main {

    public static void main(String[] args) {
    BankAccount com = new BankAccount();
    com.deposit(20000);
    while (true){
        try {
            com.wintsDraw(6000);


        }catch (LimitExseption b ){
            System.out.println("У вас не достаточно средст ");
            try {
                com.wintsDraw((int) com.getAmount());

            }catch (LimitExseption a){
                a.printStackTrace();
            }
            break;

            }


    }


    }
}
