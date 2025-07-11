package JavaGitProg;

import java.util.Scanner;

class BankAccount{
    private String Holdername;
    private int AccountNumber;
    private int balance;

    public BankAccount(String holdername, int accountNumber, int balance) {
        this.Holdername = holdername;
        this.AccountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "Holdername='" + Holdername + '\'' +
                ", AccountNumber=" + AccountNumber +
                ", balance in rupees =" + balance +
                '}';
    }
}

public class EnBankManSys {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter name of the Account Holder");
        String name=sc.nextLine();

        System.out.println("Enter account Number of the person");
        int accNo=sc.nextInt();

        System.out.println("Enter amount in the bank");
        int bal=sc.nextInt();
        sc.nextLine();
        System.out.println("\n Name of Account holder : "+name+ "\n Account Number : "+accNo+"\n Balance: "+ bal);
        System.out.println("\n Do you want to Deposit or Withdraw the money");
        String change=sc.nextLine();



        if(change.equals("Deposit")){
            System.out.println("\n Enter the amount you want to deposit");
            int Deposit=sc.nextInt();
            bal=bal+Deposit;
            System.out.println("\n Amount added to account :"+Deposit+" \n Current balance: "+bal);
        }
        else if (change.equals("Withdraw")){
            System.out.println("\n Your balance is "+ bal);
            System.out.println("\n Enter the amount you want to Withdraw ");
            int with=sc.nextInt();
            if(with>bal){
                System.out.println("\nBalance is less than required");
            }
            else {
                bal=bal-with;
                System.out.println("Amount withdrawn successfully :"+ with);
                System.out.println("\n Current Balance: "+bal);
            }
        }
        else{
            System.out.println("syntax error please try again");
        }
        BankAccount B1=new BankAccount(name,accNo,bal);
        System.out.println("\n Current status of account is :\n"+" "+B1);
    }
}
