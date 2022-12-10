package FirstPackage;
import java.util.Scanner;
public class FirstClass{
    public long Sec;
    public int age;
    public void Implementation(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("This is to Demonstrate Java Scanner");
        System.out.print("Enter your age: ");
        age=sc1.nextInt();
        Sec=age*365*24*60*60;
        System.out.println("Its around "+Sec+ " seconds of your existence in this earth and you are still to achieve great things, Carry on");
    }
}
