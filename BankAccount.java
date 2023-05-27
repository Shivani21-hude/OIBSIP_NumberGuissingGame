import java.util.Scanner;

class BankAccount {

    String name;
    String userName;
    String password;
    String accountNo;
    float balance = 100000f;
    int transactions = 0;
    String transactionHistory = "";


    public void Register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Your Name : ");
        name = sc.nextLine();
        System.out.print("\nEnter Your Username : ");
        userName = sc.nextLine();
        System.out.print("\nEnter Your Password : ");
        password = sc.nextLine();
        System.out.print("\nEnter Your Account Number : ");
        accountNo = sc.nextLine();
        System.out.println("\nRegistration completed, Kindly login..");
    }

    public boolean Login() {
        boolean isLogin = false;
        Scanner sc = new Scanner(System.in);
        while ( !isLogin ) {
            System.out.print("\nEnter Your Username : ");
            String Username = sc.nextLine();
            if ( Username.equals(userName) ) {
                while ( !isLogin ) {
                    System.out.print("\nEnter Your Password : ");
                    String Password = sc.nextLine();
                    if ( Password.equals(password) ) {
                        System.out.print("\nLogin successful!");
                        isLogin = true;
                    }
                    else {
                        System.out.println("\nIncorrect Password");
                    }
                }
            }
            else {
                System.out.println("\nUsername not found");
            }
        }
        return isLogin;
    }

    public void Withdraw() {

        System.out.print("\nEnter amount to withdraw - ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        try {

            if ( balance >= amount ) {
                transactions++;
                balance -= amount;
                System.out.println("\nWithdraw Successfully");
                String total = amount + " Rs Withdraw\n";
                transactionHistory = transactionHistory.concat(total);

            }
            else {
                System.out.println("\nInsufficient Balance");
            }

        }
        catch ( Exception e) {
        }
    }

    public void Deposit() {

        System.out.print("\nEnter amount to deposit - ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        try {
            if ( amount <= 100000f ) {
                transactions++;
                balance += amount;
                System.out.println("\nSuccessfully Deposited");
                String total = amount + " Rs deposited\n";
                transactionHistory = transactionHistory.concat(total);
            }
            else {
                System.out.println("\nSorry...Limit is 100000.00");
            }

        }
        catch ( Exception e) {
        }
    }

    public void Transfer() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Recipient's Name - ");
        String recipient = sc.nextLine();
        System.out.print("\nEnter amount to transfer - ");
        float amount = sc.nextFloat();

        try {
            if ( balance >= amount ) {
                if ( amount <= 50000f ) {
                    transactions++;
                    balance -= amount;
                    System.out.println("\nSuccessfully Transferred to " + recipient);
                    String total = amount + " Rs transferred to " + recipient + "\n";
                    transactionHistory = transactionHistory.concat(total);
                }
                else {
                    System.out.println("\nSorry...Amount transfer limit is 50000.00");
                }
            }
            else {
                System.out.println("\nInsufficient Balance");
            }
        }
        catch ( Exception e) {
        }
    }

    public void CheckBalance() {
        System.out.println("\n" + balance + " Rs");
    }

    public void TransHistory() {
        if ( transactions == 0 ) {
            System.out.println("\nEmpty");
        }
        else {
            System.out.println("\n" + transactionHistory);
        }
    }
}
