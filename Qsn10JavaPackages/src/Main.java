import SecondPackage.FirstClass2;
import SecondPackage.SecondClass2;
import FirstPackage.*;
public class Main {
    public static void main(String[] args) {
        FirstClass f1=new FirstClass();
        System.out.println("\n First Package First Class:");
        f1.Implementation();
        SecondClass s1=new SecondClass();
        System.out.println("\n First Package Second Class:");
        s1.Implementation();
        FirstClass2 f2=new FirstClass2();
        System.out.println("\n Second Package First Class:");
        f2.Implementation();
        SecondClass2 s2=new SecondClass2();
        System.out.println("\n Second Package Second Class:");
        s2.Implementation();
        System.out.println("\nLab no: 10 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}