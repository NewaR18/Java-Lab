import java.util.Scanner;

class qsnA{
    public void Div(){
        try{
            System.out.println(1/0);
        }catch(Exception ex){
            System.out.println("Don't divide by 0");
        }finally{
            System.out.println("Implemented");
        }
    }
}
class qsnB{
    public void Multi(){
        Scanner sc1=new Scanner(System.in);
        int[] array=new int[5];
        try{
//            System.out.println(1/0);
            System.out.println("Enter contents: ");
            for(int i=0;i<10;i++){
                array[i]=sc1.nextInt();
            }
        }catch(ArithmeticException ex){
            System.out.println("Don't divide by 0");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Don't use more space than allocated");
        }
    }
}
class qsnC{
    public void NestedTry(){
        Scanner sc1=new Scanner(System.in);
        int[] array=new int[5];
        try{
            try{
            System.out.println("Enter contents: ");
            for(int i=0;i<10;i++){
                array[i]=sc1.nextInt();
            }
            }catch(ArrayIndexOutOfBoundsException ex){
                    System.out.println("Don't use more space than allocated");
            }
            System.out.println(1/0);
        }catch(ArithmeticException ex){
            System.out.println("Don't divide by 0");
        }
    }
}
class qsnD{
    public void ThrowTry(){
        try{
            throw new ArithmeticException("qsn");
        }catch(ArithmeticException ex){
            System.out.println("Exception caught inside ThrowTry");
        }
    }
}
class qsnE{
    public void ThrowTry2() throws ArithmeticException{
        System.out.println(1/0);
    }
}
class qsnF extends Exception{
    public qsnF(String s){
        super(s);
    }
    public static void val(int n) throws qsnF{
        if(n<0){
            throw new qsnF("Value less than 0");
        }else{
            System.out.println("Number valid");
        }
    }
}
public class Main {
    public static void main(String[] args) {

        qsnA q1=new qsnA();
        System.out.println("\nSet A:");
        q1.Div();
        qsnB q2=new qsnB();
        System.out.println("\nSet B:");
        q2.Multi();
        qsnC q3=new qsnC();
        System.out.println("\nSet C:");
        q3.NestedTry();
        qsnD q4=new qsnD();
        System.out.println("\nSet D:");
        q4.ThrowTry();
        qsnE q5=new qsnE();
        System.out.println("\nSet E:");
        try{
            q5.ThrowTry2();
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nSet F:");
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a=sc1.nextInt();
        try{
            qsnF.val(a);
        }catch(qsnF ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nLab no: 12 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}