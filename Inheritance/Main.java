package JavaGitProg.Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("           Basic Calculator         ");

        System.out.println("Enter the Operation you want to perform :- \n Addition, Subtraction, Multiplication, Division");
        String preference=sc.nextLine();
        System.out.println("You have chosen '"+preference+"'");

        System.out.println(" And enter two numbers for your Operation");
        float a=sc.nextInt();
        float b=sc.nextInt();

        float result;


        switch (preference){
            case "Addition":
            case "Add":
            case "add":
                System.out.println("You have selected Addition of two numbers:- '"+a+"', '"+b+"'");
                Addition addition=new Addition();
                result=addition.add(a,b);
                System.out.println("The Result of the Addition is:- '"+result+"'");
                break;
            case "Difference":
            case "Minus":
            case "Subtract":
            case "sub":
            case "minus":
            case "subtract":
                System.out.println("You choose Difference of two numbers:- '"+a+"', '"+b+"'");
                Difference minus=new Difference();
                result=minus.subtract(a,b);
                    System.out.println("Difference of two numbers is:- '" + result+"'");
                break;
            case "Multiplication":
            case "mul":
            case "multiply":
            case "Multiply":
                System.out.println("You choose Multiplication of two numbers:- '"+a+"', '"+b+"'");
                Multiply mul=new Multiply();
                result=mul.mul(a,b);
                System.out.println("Multiplication of two number is:- '"+result+"'");
                break;
            case "Division":
            case "Divide":
            case "divide":
            case "div":
                System.out.println("You choose Division of two numbers:- '"+a+"', '"+b+"'");
                Division divi=new Division();
                result=divi.div(a,b);
                System.out.println("Division of these two number is:- '"+result+"'");
                break;
        }
        


    }
}
