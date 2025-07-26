package app;

public class ReviewAccount {
    private String ano;      // 계좌번호
    private String owner;    // 예금주
    private int balance;     // 잔고

    public ReviewAccount(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean deposit(int amount) {
        if (amount < 0) return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(int amount) {
        if (amount < 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }
}
