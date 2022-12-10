class qsnA{
    static class QsnA_Inner{
        static void Implementation(){
            System.out.println("This is first question");
        }
    }
}
class qsnB{
    class qsnB_Inner{
        public void Implementation(){
            System.out.println("This is second question");
        }
    }
}
class qsnC{
    public void Implementation(){
        class qsnC_Inner{
            void Inner_Implementation(){
                System.out.println("This is third question");
            }
        }
        qsnC_Inner innerq3=new qsnC_Inner();
        innerq3.Inner_Implementation();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("\nSetA: ");
        qsnA.QsnA_Inner.Implementation();
        qsnB q2=new qsnB();
        qsnB.qsnB_Inner q2a=q2.new qsnB_Inner();
        System.out.println("\nSetB: ");
        q2a.Implementation();
        qsnC q3=new qsnC();
        System.out.println("\nSetC: ");
        q3.Implementation();
        System.out.println("\nLab no: 9 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}