import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        char ch;
        do {
            System.out.println("Select your Shape!!!");
            System.out.println("Enter 1 for Triangle");
            System.out.println("Enter 2 for Rectangle");
            System.out.println("Enter 3 for Square");
            System.out.println("Enter 4 for Circle");
            System.out.println("Enter 5 for Dividing");
            int choice = sc1.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the base of Triangle: ");
                    int base = sc1.nextInt();
                    System.out.print("Enter the height of Triangle: ");
                    int height = sc1.nextInt();
                    Triangle t1 = new Triangle(height, base);
                    t1.Calculate1();
                    t1.print();
                    break;
                case 2:
                    System.out.print("\nEnter the length of Rectangle: ");
                    int length = sc1.nextInt();
                    System.out.print("Enter the breadth of Rectangle: ");
                    int breadth = sc1.nextInt();
                    rectangle r1 = new rectangle(length, breadth);
                    r1.calculatethis();
                    r1.print();
                    break;
                case 3:
                    System.out.print("\nEnter the length of Square: ");
                    int length1 = sc1.nextInt();
                    square s1 = new square(length1);
                    s1.calculatethis();
                    s1.print();
                    break;
                case 4:
                    System.out.print("\nEnter the radius of Circle: ");
                    int radius = sc1.nextInt();
                    Circle c1 = new Circle(radius);
                    c1.calculatethis();
                    c1.print();
                    break;
                case 5:
                    System.out.print("\nEnter first number: ");
                    int firstval=sc1.nextInt();
                    System.out.print("Enter second number: ");
                    int secondval=sc1.nextInt();
                    Divide d1=new Divide(firstval,secondval);
                    try {
                        d1.div();
                    }catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }finally{
                        System.out.println("Program  Executed successfully");
                    }
                    break;
                default:
                    System.out.println("No shape selected");
            }
            System.out.print("\nDo you want to continue(y/n): ");
            ch=sc1.next().charAt(0);
        }while(ch=='y');
    }
}