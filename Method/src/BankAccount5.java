class BankAccount5 {
    String name;
    int balance;

    void depositMoney(int amount) {
        if (amount < 0) {
            System.out.println("You can't deposit negative money");
            return;
        }
        balance += amount;
    }
    int withdrawMoney(int amount) {
        if (amount > balance) {
            amount = balance;
        }
        balance -= amount;
        return amount;
    }
}
