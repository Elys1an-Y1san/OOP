class BankAccount3 {
    String Name;
    int Balance;


    void depositMoney(int amount) {
        if (amount < 0){
            System.out.println("You can't deposit negative money");
            return;
        }
    }
}
