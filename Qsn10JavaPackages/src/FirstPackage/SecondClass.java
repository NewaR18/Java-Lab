package FirstPackage;
import java.util.*;
public class SecondClass{
    public String bestday;
    public void Implementation(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("This is to Demonstrate Java all util");
        System.out.println("Enter your best day");
        bestday=sc1.next();
        System.out.println("Your best day is "+bestday.toUpperCase());
    }
}