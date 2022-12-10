import java.util.Scanner;
class qsnA{
    public void Implementation(){
        int[] arry=new int[15];
        for(int i=0;i<15;i++){
            arry[i]=i+1;
        }
        System.out.println("\nSet A");
        System.out.println("The sum of third and last element of array is: "+(arry[2]+arry[arry.length-1]));
    }
}
class qsnB{
    public void Implementation(){
        int[][] arry=new int[3][3];
        Scanner sc1=new Scanner(System.in);
        System.out.println("\nSet B");
        System.out.println("Enter the elements of array. ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Array["+(i+1)+"]["+(j+1)+"]: ");
                arry[i][j]=sc1.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arry[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Diagonal Elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    System.out.print(arry[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
class qsnC{
    public void Implementation(){
        int arry[][] = new int[][]  {
                new int[] {1,2,3},
                new int[] {4,5,6,7,8},
                new int[] {2,5}
        };
        System.out.println("\nSet C");
        System.out.print("Elements in Array: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<arry[i].length;j++){
                System.out.print(arry[i][j]+" ");
            }
        }
    }
}
class qsnD{
    public void Implementation(){
        int[] arry=new int[15];
        for(int i=0;i<15;i++){
            arry[i]=i+1;
        }
        System.out.println("\n\nSet D");
        System.out.print("Elements in Sample Array: ");
        for(int items: arry){
            System.out.print(items+" ");
        }
        System.out.println();
    }

}
public class Main {
    public static void main(String[] args) {
        qsnA q1= new qsnA();
        q1.Implementation();
        qsnB q2=new qsnB();
        q2.Implementation();
        qsnC q3=new qsnC();
        q3.Implementation();
        qsnD q4=new qsnD();
        q4.Implementation();
        System.out.println("\nLab no: 3 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}