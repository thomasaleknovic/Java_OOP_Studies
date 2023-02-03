public class Main {
    public static void main(String[] args) {

        BankAccount p1 = new BankAccount();
        p1.setAccNumber(1111);
        p1.setOwner("Jubileu");
        p1.openAccount("CC");
        p1.deposit(300);
        p1.currentState();
        p1.withdraw(200);
        p1.monthlyPayment();

        BankAccount p2 = new BankAccount();
        p2.setAccNumber(2222);
        p2.setOwner("Creuza");
        p2.openAccount("CP");
        p2.deposit(300);
        p2.currentState();
        p2.withdraw(200);
        p2.monthlyPayment();
    }
}