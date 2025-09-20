import java.util.Scanner ;

public class Main {


  static  Scanner scanner = new Scanner(System.in); // scanner in the main class for every method in the class

    public static void main(String[] args) {


        int choice;
        double balance=0;
        boolean isRunning = true;
        while (isRunning) {
            // Display menu
            System.out.println("the poverty bank ");
            System.out.println("*******************");
            System.out.println("1 to show your Balance");
            System.out.println("2 to deposit ");
            System.out.println("3 to withdraw  ");
            System.out.println("4  to Exist ");
            // Get and process users Choice
            System.out.println("choose one of the following Option:");
            choice = scanner.nextInt();
            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance= balance+ deposite();
                case 3 -> balance= balance-withdraw (balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Error, Wrong Choice");
            }

        }

        scanner.close();  }

        static void showBalance(double balance ){
        System.out.printf("$%.4f",balance );
    }

         static double deposite(){
                     double amount ;// local var
             System.out.println("Enter the amount :");
                amount = scanner.nextDouble();
                                       if (amount<0){
                                           System.out.println("only positive number ");
                                                    return 0;
                                                               }
                                       else {   return amount ;     }
                                                                        }
    static  double withdraw(double balance){
        double amount ;
        System.out.println("enter the amount :");
        amount = scanner.nextDouble ();
        if ( amount>balance){
            System.out.println("sorry you r broke ");
            return 0;
        }
        else if  (amount<0){
            System.out.println("only positive nummbers");
            return 0;
        }
        else {   return amount ;     }

    }
}