class qsnA{
    public qsnA(){
        System.out.println("This is parent class");
    }
}
class qsnA_Child extends qsnA{
    public qsnA_Child(){
        super();
    }
}
class qsnB{
    public int a=10;
    public int b=20;
    public void DisplayCalc(){
        System.out.println("In parent class ==> Addition: "+(a+b));
    }
}
class qsnB_Child extends qsnB{
    public int a=30;
    public int b=50;
    public void DisplayCalc(){
        System.out.println("The new value of a: "+a);
        System.out.println("The new value of b: "+b);
        System.out.println("In base class ==> Subtraction: "+ (a-b));
        System.out.println("The old value of a: "+super.a);
        System.out.println("The old value of b: "+super.b);
        super.DisplayCalc();
    }

}
class qsnC{
    int a=10;
}
class qsnC_Child extends qsnC{
    int b=10;
}
class qsnC_Child_Of_Child extends qsnC_Child{
    public void Implementation(){
        System.out.println(a+b);
    }
}
class qsnD{
    public qsnD(){
        System.out.println("Parent CLass");
    }
}
class qsnD_Child extends qsnD{
    public qsnD_Child(){
        System.out.println("Child CLass");
    }
}
class qsnD_Child_Of_Child extends qsnD_Child{
    public qsnD_Child_Of_Child(){
        System.out.println("Child CLass of Child CLass");
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("\nSetA: ");
        qsnA_Child q1=new qsnA_Child();
        System.out.println("\nSetB: ");
        qsnB_Child q2=new qsnB_Child();
        q2.DisplayCalc();
        System.out.println("\nSetC: ");
        qsnC_Child_Of_Child q3=new qsnC_Child_Of_Child();
        q3.Implementation();
        System.out.println("\nSetD: ");
        qsnD_Child_Of_Child q4=new qsnD_Child_Of_Child();
        System.out.println("\nLab no: 7 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}