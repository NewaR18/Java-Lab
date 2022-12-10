class qsnA{
    static int id=10;
    static String str="Sudip";
}
class qsnB{
    public static void Implementation(){
        System.out.println("This is Static Method");
    }
}
class qsnC{
    static{
        System.out.println("This is static block");
    }
}
final class qsnD{
    final int id=5;
    final void Implementation() {
        System.out.println(id);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nSetA: ");
        System.out.println("Static Variables");
        System.out.println("Id: "+qsnA.id);
        System.out.println("String: "+qsnA.str);
        System.out.println("\nSetB: ");
        qsnB.Implementation();
        System.out.println("\nSetC: ");
        qsnC q3=new qsnC();
        qsnD q4=new qsnD();
        System.out.println("\nSetD: ");
        q4.Implementation();
        System.out.println("\nLab no: 5 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}