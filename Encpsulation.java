class Account{
    private int amount;
    private String name;
    private int pin;


    public String getName() {
        return name;
    }
    public int getAmount(int pin) {
        if(this.pin==pin)
        return amount;
        else
        return 0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
  }

public class Encpsulation {
    
    public static void main(String[] args) {
        Account a1=new Account();
        Account a2=new Account();

        a1.setName("Gudu");
        a1.setAmount(50000);
        a1.setPin(1234);

        System.out.println(a1.getAmount(1534));
    }
}
