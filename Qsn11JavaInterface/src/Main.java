import java.util.Scanner;
interface Shape{
    double area(double x, double y);
    double perimeter(double x, double y);
}
class Rectangle implements Shape{
    public double area;
    public double perimeter;
    public double area(double x, double y){
        area=x*y;
        return area;
    }
    public double perimeter(double x, double y){
        perimeter=2*(x+y);
        return perimeter;
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Scanner sc1=new Scanner(System.in);
        System.out.print("\nEnter length of rectangle: ");
        double l=sc1.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b=sc1.nextDouble();
        double area=r1.area(l,b);
        double perimeter=r1.perimeter(l,b);
        System.out.println("The area of rectangle is "+String.format("%.2f", area)+" unit square and its perimeter is "+String.format("%.2f", perimeter)+" unit");
        System.out.println("\nLab no: 11 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}