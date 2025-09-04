package com.xworkz.bank;

public class BankAccount {



        public static void dummy(){
            System.out.println("Dummy  invoked");
        }
        private double amount;
        private double balance;

        public double getBalance() {
            return balance;
        }

        public void credit(double amount){
            balance = balance + amount;
        }

        public void debit(double amount){
            balance =  balance - amount;
        }

        public void transfer(BankAccount beneficiaryAccount, double amount){
            this.debit(amount);
            beneficiaryAccount.credit(amount);
        }
    }

