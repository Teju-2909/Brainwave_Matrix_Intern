package Assignment;


class Account {
    private String accountNumber;
    private String pin;
    private double currentBalance;

    public Account(String accountNumber, String pin, double currentBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.currentBalance = currentBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return currentBalance;
    }

    public void deposit(double amount) {
    	currentBalance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= currentBalance) {
        	currentBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
