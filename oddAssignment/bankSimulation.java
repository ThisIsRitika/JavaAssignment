class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted withdrawal, insufficient funds!");
        }
    }
}

class AccountHolder extends Thread {
    BankAccount account;

    AccountHolder(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    public void run() {
        account.deposit(500);
        account.withdraw(700);
    }
}

public class bankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        AccountHolder h1 = new AccountHolder(account, "User1");
        AccountHolder h2 = new AccountHolder(account, "User2");
        AccountHolder h3 = new AccountHolder(account, "User3");

        h1.start();
        h2.start();
        h3.start();
    }
}
