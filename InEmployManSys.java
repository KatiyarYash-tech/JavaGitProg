package JavaGitProg;
import java.util.Scanner;

class Employee {
    public String name;
    public int Id;
    public int Salary;
    public String Depart;

    public Employee(String name, int id,String depart) {
        this.name = name;
        this.Id = id;
        this.Depart=depart;
    }
    public int Calculate(int bonus){
        this.Salary=Salary+bonus;
        return Salary;
    }

}


class Manager extends Employee {
    public String projname;
    public int Bonus;
    public Manager(String name, int id,String depart,String projname,int bonus) {
        super(name, id,depart);
        this.projname=projname;
        this.Bonus=bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                " Name of Employee='" + name + '\'' +
                ", Id of Employee=" + Id +
                ", Project Name='" + projname + '\''+
                ", Department='" + Depart + '\'' +
                ", Salary(in Rupee)=" + Salary +
                '}';
    }
}

class Developer extends Employee{
    int Bonus;
    public String projname;

    public Developer(String name, int id, String depart,String projname,int bonus) {
        super(name, id,depart);
        this.projname=projname;
        this.Bonus=bonus;
    }

    @Override
    public String toString() {
        return "Developer{" +
                " Name of Employee='" + name + '\'' +
                ", Id of Employee=" + Id +
                ", Department='" + Depart + '\'' +
                ", Project Name='" + projname + '\'' +
                ", Salary(in Rupee)=" + Salary +
                '}';
    }
}

class Intern extends Employee{

    public int Time;
    public int stipend;
    public Intern(String name, int id, String depart,int time,int stipend) {
        super(name, id, depart);
        this.Time=time;
        this.stipend=stipend;
    }

    @Override
    public String toString() {
        return "Intern{" +
                " Name of Intern='" + name + '\'' +
                ", Id of Intern=" + Id +
                ", Department='" + Depart + '\'' +
                ", Time period of Internship(in Months)=" + Time +
                ", Stipend(in Rupee)=" + stipend +
                '}';
    }
}


public class InEmployManSys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your Employee Id");
        int Id=sc.nextInt();
        sc.nextLine();
        while (true){
        System.out.println("Enter your Work profile:- Manager, Developer, Intern ");
        String workProfile=sc.nextLine();

        if (workProfile.equals("Manager")){
            System.out.println("Enter project name");
            String pro=sc.nextLine();
            Manager m=new Manager(name,Id,"Management",pro,10000);
            m.Salary=45000;
            int totalsal=m.Calculate(m.Bonus);
            System.out.println("total Salary : "+totalsal);
            System.out.println(m);
            break;
        }
        else if (workProfile.equals("Developer")) {
            System.out.println("Enter project name");
            String pro2=sc.nextLine();
            Developer dev=new Developer(name,Id,"Development",pro2,10000);
            dev.Salary=35000;
            int totalsal= dev.Calculate(dev.Bonus);
            System.out.println("total Salary: "+totalsal);
            System.out.println(dev);
            break;
        }
        else if (workProfile.equals("Intern")) {
            Intern i=new Intern(name,Id,"Internship",6,15000);
            System.out.println(i);
            break;
        }
        else {
            System.out.println("WRONG SYNTAX \n Please Choose Again");
        }
        }

    }
}