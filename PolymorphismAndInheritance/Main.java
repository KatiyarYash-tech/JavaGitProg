package JavaGitProg.PolymorphismAndInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Shape: Circle, Rectangle, Triangle.");

        String sh=sc.nextLine();
        System.out.println("You have Chosen "+sh+" shape.");

        if(sh.equals("Circle")|| sh.equals("Rectangle") || sh.equals("Triangle")||sh.equals("circle")|| sh.equals("rectangle") || sh.equals("triangle")){
        switch (sh){
            case "Circle":
            case "circle":
                Circle c=new Circle();
                c.area();
                System.out.println("Enter radius of the Circle:");
                double r=sc.nextDouble();
                System.out.println("Area of Circle is: "+c.area(r)+"sq.units");
                break;

            case "Rectangle":
            case "rectangle":
                Rectangle R=new Rectangle();
                R.area();
                System.out.println("Enter Length and Breath of the Rectangle");
                double l=sc.nextDouble();
                double b= sc.nextDouble();
                System.out.println("The Area of the Rectangle is: "+R.area(l,b)+"sq.units");
                break;
            case "Triangle":
            case "triangle":
                Triangle t=new Triangle();
                t.area();
                System.out.println("Enter the Base and Height of a Triangle");
                double ba=sc.nextInt();
                double h=sc.nextDouble();
                System.out.println("the Area of the Triangle is: "+t.area(ba,h)+"sq.units");
                break;
        }
        }
        else {
            System.out.println("Syntax Error. \n Please try again.");
        }


    }
}
