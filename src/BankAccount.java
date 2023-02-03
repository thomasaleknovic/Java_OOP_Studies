public class BankAccount {

    public int AccNumber;
    protected String type;
    private String owner;
    private float balance;
    private boolean status;

    // specials methods

    public void currentState () {
        System.out.println("-------------------------------- ");
        System.out.println("Account " + this.getAccNumber());
        System.out.println("Owner " + this.getOwner());
        System.out.println("Type " + this.getType());
        System.out.println("Balance " + this.getBalance());
        System.out.println("Status " + this.getStatus());
    }
    public BankAccount() {
        this.balance = 0;
        this.status = false;
    }


    public int getAccNumber() {
        return AccNumber;
    }

    public void setAccNumber(int accNumber) {
        AccNumber = accNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void openAccount (String type) {
        this.setType(type);
        this.setStatus(true);

        if (type == "CC") {
            this.setBalance(50);
        } else if (type == "CP") {
            this.setBalance(150);
        } else {
            System.out.println("Insert a valid account type.");
        }

        System.out.println("Account created!");
    }

    public void closeAccount () {
        if (this.getStatus()) {
            if(this.getBalance() > 0) {
                System.out.println("Please, just close accounts without any value in balance.");
            } else if (this.getBalance() < 0) {
                System.out.println("Please, just close accounts without any debits in balance.");
            } else {
                this.setStatus(false);
                String result = String.format("Account number %acc closed.", this.getAccNumber());
                System.out.println(result);
            }
        } else {
                       System.out.println("Account do not exist.");
        }
    }

    public void deposit (float value) {
        if (this.getStatus()) {
            this.setBalance(this.getBalance() + value);
            System.out.println("Deposit of " + value + ". Current account balance is " + this.getBalance() + ".");
        } else {
            System.out.println("Account do not exist.");
        }
    }

    public void withdraw (float value) {
        if (this.getStatus()) {
            if (this.getBalance() >= value) {
                this.setBalance(this.getBalance() - value);
                System.out.println("Withdraw of " + value + ". Current account balance is " + this.getBalance() + ".");
            } else {
                System.out.println("Insufficient founds.");
            }
        } else {
            System.out.println("Account do not exist.");
        }
    }

    public void monthlyPayment () {
        float cost = 0;
        if (this.getStatus()) {
            if(this.getType() == "CC") {
                cost = 12;
                this.setBalance(getBalance() - cost);
                System.out.println("Monthly payment of " + cost + ". Current account balance is " + this.getBalance() +
                        ".");
            } else if (this.getType() == "CP") {
                cost = 20;
                this.setBalance(getBalance() - cost);
                System.out.println("Monthly payment of " + cost + ". Current account balance is " + this.getBalance() +
                        ".");
            } else {
                System.out.println("Invalid account type.");
            }

        } else {
            System.out.println("Account do not exist.");
        }


    }
}


