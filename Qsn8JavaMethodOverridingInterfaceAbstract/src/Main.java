class qsnA{
    public void method1(){
        System.out.println("This is parent class");
    }
}
class qsnA_Child extends qsnA{
    public void method1(){
        System.out.println("This is child class");
    }
}
class qsnB{
    public void DisplayCalc(){
        System.out.println("This is parent class");
    }
}
class qsnB_Child extends qsnB{
    public void DisplayCalc(){
        System.out.println("This is child class");
    }
}
class qsnB_SecondChild extends qsnB{
    public void DisplayCalc(){
        System.out.println("This is second child class");
    }
}
abstract class qsnC{
    int a=10;
    public abstract void method1();
}
class qsnC_Child extends qsnC{
    public void method1(){
        System.out.println("This is abstract method from parent class with data member "+a);
    }
}
interface qsnDFirst{
    public void add();
}
interface qsnDSecond{
    public void subtract();
}
class qsnD_Child implements qsnDFirst,qsnDSecond{
    public void add(){
        System.out.println("Addition");
    }
    public void subtract(){
        System.out.println("Subtraction");
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("\nSetA: ");
        qsnA_Child q1=new qsnA_Child();
        q1.method1();
        System.out.println("\nSetB: ");
        qsnB_Child q2=new qsnB_Child();
        q2.DisplayCalc();
        qsnB_SecondChild q2B=new qsnB_SecondChild();
        q2B.DisplayCalc();
        System.out.println("\nSetC: ");
        qsnC_Child q3=new qsnC_Child();
        q3.method1();
        System.out.println("\nSetD: ");
        qsnD_Child q4=new qsnD_Child();
        q4.add();
        q4.subtract();
        System.out.println("\nLab no: 8 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}