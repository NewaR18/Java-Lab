package Threads;

import static java.lang.Thread.sleep;

class qsnA implements Runnable{
    public void run(){
        for(int i=0;i<30;i++){
            System.out.print(i+" ");
            if(i%30==0){
                System.out.println();
            }
        }
    }
}
class qsnB extends Thread{
    public void run(){
        for(int i=0;i<30;i++){
            System.out.print(i+" ");
            if(i%30==0){
                System.out.println();
            }
        }
    }
}
class qsnC extends qsnB{
}
class qsnC_Second extends Thread{
    public void run(){
        for(int i=100;i>=70;--i){
            System.out.print(i+" ");
            if(i%30==0){
                System.out.println();
            }
        }
    }
}
class qsnD extends Thread{
    qsnD(String n){
        super(n);
    }
    public void run(){
        System.out.print(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" ");
    }
}
class qsnE extends Thread{
    synchronized public static void print(){
        for(int i=100;i>=70;--i){
            System.out.print(i+" ");
            if(i%30==0){
                System.out.println();
            }
        }
    }
    public void run(){
        print();
    }
}
class preqsnF{
    public void print(){
        synchronized (this) {
            for (int i = 100; i >= 70; --i) {
                System.out.print(i + " ");
                if (i % 30 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
class qsnF extends Thread{
    preqsnF pre=new preqsnF();
    qsnF(preqsnF pre){
        this.pre=pre;
    }
    public void run(){
        pre.print();
    }
}
class qsnG extends Thread{
    public void run(){
        for(int i=100;i>=0;--i){
            System.out.print(i+" ");
            if(i%30==0){
                System.out.println();
            }
            try{
                sleep(30);
            }catch(Exception ex){
                System.out.println("Errors");
            }
        }
    }
}
class qsnH implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
            try{
                sleep(200);
            }catch(Exception ex){
                System.out.println("Errors");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("\nSet A: ");
        qsnA q1=new qsnA();
        Thread th1=new Thread(q1);
        th1.start();
        for(int i=100;i>=70;--i){
            System.out.print(i+" ");
            if(i%20==0){
                System.out.println();
            }
        }
        sleep(100);
        System.out.println("\n\nSet B: ");
        qsnB q2=new qsnB();
        q2.start();
        for(int i=100;i>=70;--i){
            System.out.print(i+" ");
            if(i%20==0){
                System.out.println();
            }
        }
        sleep(100);
        System.out.println("\n\nSet C: ");
        qsnC q3=new qsnC();
        qsnC_Second q3b=new qsnC_Second();
        q3.start();
        q3b.start();
        System.out.println(q3.isAlive());
        q3.join();
        q3b.join();
        System.out.println("\n"+q3.isAlive());
        System.out.println("\nSet D: ");
        qsnD q4a=new qsnD("First Thread");
        qsnD q4b=new qsnD("Second Thread");
        qsnD q4c=new qsnD("Third Thread");
        qsnD q4d=new qsnD("Fourth Thread");
        qsnD q4e=new qsnD("Fifth Thread");
        q4a.setPriority(2);
        q4b.setPriority(Thread.MIN_PRIORITY);
        q4c.setPriority(4);
        q4d.setPriority(Thread.MAX_PRIORITY);
        q4e.setPriority(3);
        q4a.start();
        q4b.start();
        q4c.start();
        q4d.start();
        q4e.start();
        q4a.join();
        q4b.join();
        q4c.join();
        q4d.join();;
        q4e.join();
        System.out.println();
        System.out.println("\nSet E: ");
        qsnE q5=new qsnE();
        q5.start();
        q5.join();
        System.out.println("\n\nSet F: ");
        preqsnF pre=new preqsnF();
        qsnF q6=new qsnF(pre);
        q6.start();
        q6.join();
        System.out.println("\n\nSet G: ");
        qsnG q7=new qsnG();
        q7.start();
        q7.join();
        System.out.println("\n\nSet H: ");
        qsnH q8=new qsnH();
        Thread th3=new Thread(q8);
        th3.start();
        th3.join();
        System.out.println("Lab no: 13 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}