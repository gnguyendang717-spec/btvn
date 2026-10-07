public class Account {
    String id, name;
    int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    
    int credit(int amount){
        return balance +=  amount;
    }

    int debit(int amount){
        if (amount <= balance) balance -= amount;
        else System.out.println("Amount exceeded balance");

        return balance;
    }

    int transferTo(Account another, int amount){
        if (amount <= balance){
            another.balance += amount;
            balance -= amount;
        }
        else System.out.println("Amount exceed balance");

        return balance;
    }
    
    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

}
