class Student{
    public int roll_no;
    public void read(int roll_no){
        this.roll_no=roll_no;
    }
    public void display(){
        System.out.println("Name: Sudip Shrestha");
        System.out.println("Roll No: "+roll_no);
    }
}
class Test extends Student{
    public int sub1Marks;
    public int sub2Marks;
    public void read2(int sub1marks,int sub2marks){
        this.sub1Marks=sub1marks;
        this.sub2Marks=sub2marks;
    }
    public void display2(){
        System.out.println("Marks in .NET: "+sub1Marks);
        System.out.println("Marks in Java: "+sub2Marks);
    }
}
class Result extends Test{
    public int total;
    public void Calculate(){
        total=sub1Marks+sub2Marks;
    }
    public void display3(){
        System.out.println("Total Marks:" +total);
    }
}
public class Main {
    public static void main(String[] args) {
        Result rs=new Result();
        rs.read(1);
        rs.read2(50,45);
        rs.display();
        rs.display2();
        rs.Calculate();
        rs.display3();
        System.out.println("\nLab no: 6 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}