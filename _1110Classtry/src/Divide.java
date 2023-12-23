public class Divide {
    int a;
    int b;
    float val;
    Divide(int val1,int val2){
        this.a=val1;
        this.b=val2;
    }
    public void div() throws Exception{
        val=a/b;
        System.out.println(a + " divided by "+ b+" is "+ val);
    }
}