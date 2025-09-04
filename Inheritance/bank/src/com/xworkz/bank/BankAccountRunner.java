package com.xworkz.bank;



    public class BankAccountRunner {

        public static void main(String[] args){

            BankAccount bankAccount = new BankAccount();
            bankAccount.credit(5000000.00);
            BankAccount sindhuCurrentAccount = new BankAccount();
            BankAccount sindhuSavingsAccount = new BankAccount();
            BankAccount anandSavingsAccount = new BankAccount();
            BankAccount anandCurrentAccount = new BankAccount();
            SavingAccount deepaSavingsAccount = new SavingAccount();
            SavingAccount deepaCurrentAccount = new SavingAccount();
            SavingAccount deepakAccount = new SavingAccount();
            BankAccount ganapatiAccount = new BankAccount();
            SavingAccount stutiAccount = new SavingAccount();

            bankAccount.transfer(deepaCurrentAccount, 3000);
            deepaCurrentAccount.transfer(deepakAccount, 6000);
            deepaCurrentAccount.transfer(sindhuCurrentAccount, 10000);
            sindhuSavingsAccount.transfer(anandCurrentAccount, 2000);
            anandCurrentAccount.transfer(deepaSavingsAccount,6000);
            ganapatiAccount.transfer(sindhuCurrentAccount, 500);
            sindhuCurrentAccount.transfer(ganapatiAccount, 2000);

            System.out.println("Deeksha: " +sindhuSavingsAccount.getBalance());
            System.out.println("Deepa: " +deepaCurrentAccount.getBalance());
            System.out.println("Deepak: " +deepakAccount.getBalance());
            System.out.println("Anand: " +anandCurrentAccount.getBalance());
            System.out.println("Ganapati: " +ganapatiAccount.getBalance());

            BankAccount.dummy();
        }
    }

