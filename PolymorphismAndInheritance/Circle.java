package JavaGitProg.PolymorphismAndInheritance;

//this is method overriding the parent class
//this will run when obj of circle is created
public class Circle extends Shapes{
    double r;
    double area(double a){
        r=3.14*a*a;
        return r;
    }
}
