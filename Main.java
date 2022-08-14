import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance=0;
        int withdraw;
        int deposit;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("WELCOME to RBI");
            System.out.println("Choose 1 for Withraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose option");

            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter money to be withrawn");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw){
                        balance-=withdraw;
                        System.out.println(("Please collect your money"));
                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 2:
                    System.out.println("Enter money to be deposited");
                    deposit=sc.nextInt();
                    balance+=deposit;
                    System.out.println("Your money has been successfully deposited");
                    break;
                case 3:
                    System.out.println("Balance : "+balance);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}