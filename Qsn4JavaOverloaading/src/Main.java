class qsnA{
    public int Display(int a,int b){
        return a+b;
    }
    public int Display(int a){
        return a*a;
    }
    public void Display(String s){
        System.out.println("Hello " + s);
    }
}
class qsnB{
    public int id;
    public qsnB(){
        id=10;
    }
    public qsnB(int id){
        this.id=id;
    }
}
public class Main {
    public static void main(String[] args) {
        qsnA q1=new qsnA();
        System.out.println("\nSet A: ");
        System.out.println("Sum: "+q1.Display(4,5));
        System.out.println("Square: "+q1.Display(10));
        q1.Display("Sudip");
        qsnB q2=new qsnB();
        System.out.println("\nSet B: ");
        System.out.println("Value of Id in Default Constructor: "+q2.id);
        qsnB q2sec=new qsnB(50);
        System.out.println("Value of Id in Parametrized Constructor: "+q2sec.id);
        System.out.println("\nLab no: 4 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}