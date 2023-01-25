class Thread1 extends Thread{
    public void run(){
        for (int i=0 ; i<=100 ; i++){
            if (i % 2 != 0){
                System.out.print(i+"\t");
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        for (int i=200 ; i<=300 ; i++){
            if (i % 2 == 0){
                System.out.print(i+"\t");
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class Main{
    public static void main(String[] args) throws InterruptedException {
        Thread1 odd = new Thread1();
        odd.run();
        odd.join();
        Thread2 even = new Thread2();
        Thread t1=new Thread(even);
        t1.run();

    }
}