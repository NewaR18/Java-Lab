public class Box {
    public int length;
    public int breadth;
    public int height;
    public Box(int l,int b, int h){
        this.length=l;
        this.breadth=b;
        this.height=h;
    }
    public void printAll(){
        System.out.println("The length of box is: "+length+ " unit");
        System.out.println("The breadth of box is: "+breadth+ " unit");
        System.out.println("The height of box is: "+height+ " unit");
    }
    public void CalculateVolume(){
        System.out.println("The volume of Box is "+ length*breadth*height + " cubic unit\n");
    }
    public static void main(String[] args) {
        Box firstBox=new Box(2,6,8);
        Box secondBox=new Box(3,8,4);
        System.out.println("\nFirst Box Details: ");
        firstBox.printAll();
        firstBox.CalculateVolume();
        System.out.println("\nSecond Box Details: ");
        secondBox.printAll();
        secondBox.CalculateVolume();
        System.out.println("\nLab no: 1 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}