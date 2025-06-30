class BankAccount {
	static int accountNumber ;
      static  int branchCode ;
      static  int accountType;
      static  int customerAge;
      static  int creditScore;
       static int numberOfTransactions;
       static int failedLoginAttempts;
       static int debitCardLimit ;
       static int numberOfLoans;
       static int numberOfDependents;
       static long accountBalance;
       static long dailyWithdrawalLimit;
       static long lastTransactionAmount;
        static long totalDeposits ;
       static long totalWithdrawals ;
       static String accountHolderName;
        static String ifscCode;
       static String mobileNumber;
       static String emailAddress;
       static String address ;
    public static void main(String[] args) {
		  accountNumber = 123456;
         branchCode = 11002;
       accountType = 1;
       customerAge = 35;
       creditScore = 750;
       numberOfTransactions = 120;
       failedLoginAttempts = 2;
        debitCardLimit = 50000;
        numberOfLoans = 1;
        numberOfDependents = 3;
        accountBalance = 250000L;
        dailyWithdrawalLimit = 20000L;
         lastTransactionAmount = 5000L;
          totalDeposits = 500000L;
         totalWithdrawals = 250000L;
         accountHolderName = "John Doe";
          ifscCode = "BANK0011223";
         mobileNumber = "9876543210";
         emailAddress = "john.doe@example.com";
         address = "123 Main Street, City";
        

        System.out.println(accountNumber);
        System.out.println( branchCode);
        System.out.println(accountType);
        System.out.println( customerAge);
        System.out.println(creditScore);
        System.out.println( numberOfTransactions);
        System.out.println( failedLoginAttempts);
        System.out.println( debitCardLimit);
        System.out.println(numberOfLoans);
        System.out.println( numberOfDependents);
        System.out.println(accountBalance);
        System.out.println( dailyWithdrawalLimit);
        System.out.println( lastTransactionAmount);
        System.out.println(totalDeposits);
        System.out.println(totalWithdrawals);
        System.out.println( accountHolderName);
        System.out.println(ifscCode);
        System.out.println( mobileNumber);
        System.out.println( emailAddress);
        System.out.println(address);
    }
}
