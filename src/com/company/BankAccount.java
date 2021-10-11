package com.company;

public class BankAccount {
   private double amount;
   public double getAmount(){
      return amount;
   }
   public void deposit(double sum) {
      amount = amount + sum;

   }
   public void wintsDraw(int sum) throws LimitExseption{
      amount = amount + sum;
    if (amount > sum){
       throw new LimitExseption("vv,fb");


   }
   }


}
