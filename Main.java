import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        System.out.println("\n********** WELCOME TO HDFC ATM SYSTEM **********\n");
        System.out.println("1.Register \n2.Exit");
        System.out.print("Enter Your Choice - ");
        int choice = TakeInput(2);

        if (choice == 1) {
            BankAccount ba = new BankAccount();
             ba.Register();

            while (true) {
                System.out.println("\n1.Login \n2.Exit");
                System.out.print("Enter Your Choice - ");
                int option = TakeInput(2);
                if (option == 1) {
                    if (ba.Login()) {
                        System.out.println("\n\n********** WELCOME BACK " + ba.name + " **********\n");
                        boolean isFinished = false;
                        while (!isFinished) {
                            System.out.println("\n1.Transaction History \n2.Withdraw \n3.Deposit \n4.Check Balance \n5.Transfer \n6.Exit");
                            System.out.print("\nEnter Your Choice - ");
                            int c = TakeInput(6);
                            switch (c) {
                                case 1:
                                    ba.TransHistory();
                                    break;
                                case 2:
                                    ba.Withdraw();
                                    break;
                                case 3:
                                    ba.Deposit();
                                    break;
                                case 4:
                                    ba.CheckBalance();
                                    break;
                                case 5:
                                    ba.Transfer();
                                    break;
                                case 6:
                                    isFinished = true;
                                    break;
                            }
                        }
                    }
                }
                else {
                    System.exit(0);
                }
            }
        }
        else {
            System.exit(0);
        }

    }

    public static int TakeInput(int limit) {
        int input = 0;
        boolean flag = false;
        while (true) {
            while (!flag) {

                try {
                    Scanner sc = new Scanner(System.in);
                    input = sc.nextInt();
                    flag = true;

                    if (flag && input > limit || input < 1) {
                        System.out.println("Choose the number between 1 to " + limit);
                        flag = false;
                    }
                }
                catch (Exception e) {
                    System.out.println("Enter only integer value");
                    flag = false;
                }
            }
            return input;
        }
    }
}
