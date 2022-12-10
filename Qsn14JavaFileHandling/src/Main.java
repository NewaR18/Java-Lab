
import java.io.*;
import java.util.Scanner;

class qsnA{
    public static void Implementation(){
        final String path="C:\\Users\\sudip\\IdeaProjects\\Files\\qsn1.txt";
        try{
            FileInputStream fin=new FileInputStream(path);
            int a=0;
            while((a=fin.read())!=-1){
                System.out.print((char)a);
            }
            System.out.println();
            fin.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class qsnB{
    public static void Implementation(){
        final String path="C:\\Users\\sudip\\IdeaProjects\\Files\\qsn2.txt";
        try{
            FileOutputStream fout=new FileOutputStream(path);
            String s="Sudip";
            byte byt[]=s.getBytes();
            fout.write(byt);
            fout.close();
            System.out.println("Written in file");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class qsnC {
    static String Path="C:\\Users\\sudip\\Pictures\\wallpaper\\2.jpg";
    static String Path2="C:\\Users\\sudip\\Pictures\\wallpaper\\5.jpg";
    public static void Implementation() {
        FileInputStream fin;
        FileOutputStream fout;
        try{
            fin=new FileInputStream(Path);
            fout=new FileOutputStream(Path2);
            int databyte=0;
            System.out.println("Start Copying File");
            while((databyte=fin.read())!=-1){
                fout.write(databyte);
            }
            System.out.println("Copied");
            fin.close();
            fout.close();
        }catch(FileNotFoundException ex){
            System.out.println("File Not found in the location: "+Path);
        }catch(IOException ex2){
            System.out.println("IO Exception has occurred");
        }
    }
}
class qsnD{
    public static void Implementation() throws IOException{
        InputStream input = new FileInputStream("C:\\Users\\sudip\\IdeaProjects\\Files\\qsn4a.txt");
        DataInputStream DI = new DataInputStream(input);
        int n = input.available();
        byte[] byt = new byte[n];
        DI.read(byt);
        for(byte bt : byt) {
            System.out.print((char)bt);
        }
    }
}
class qsnDb{
    public static void Implementation() throws IOException{
        FileOutputStream file = new FileOutputStream("C:\\Users\\sudip\\IdeaProjects\\Files\\qsn4b.txt");
        DataOutputStream data = new DataOutputStream(file);
        String s="Sudip";
        byte byt[]=s.getBytes();
        data.write(byt);
        data.flush();
        data.close();
        System.out.println("Written in file");
    }
}
class qsnE{
    static String Path ="C:\\Users\\sudip\\IdeaProjects\\Files\\qsn5.txt";
    public static void Implementation() throws IOException{
        RandomAccessFile file = new RandomAccessFile(Path, "r");
        file.seek(16);
        byte[] bytes = new byte[22];
        file.read(bytes);
        for(byte bt : bytes) {
            System.out.print((char)bt);
        }
        file.close();
    }
}
class qsnF{
    public static void Implementation() throws Exception{
        FileReader fr=new FileReader("C:\\Users\\sudip\\IdeaProjects\\Files\\qsn6.txt");
        int i=0;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
}
class qsnG{
    public static void Implementation() throws Exception{
        FileWriter fw=new FileWriter("C:\\Users\\sudip\\IdeaProjects\\Files\\qsn7.txt");
        fw.write("Test FileWriter Class");
        System.out.println("Written in File");
        fw.close();
    }
}
class qsnH{
    public static void Implementation() throws Exception{
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the text you want to enter in file: ");
        String s=sc1.nextLine();
        FileWriter fw=new FileWriter("C:\\Users\\sudip\\IdeaProjects\\Files\\qsn8.txt");
        fw.write(s);
        System.out.println("Written in File");
        fw.close();
    }
}
class qsnI implements Serializable{
    String s="Test Serializable and Deserializable";
    public static void Implementation() throws Exception{
        qsnI q9inside=new qsnI();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\sudip\\IdeaProjects\\Files\\qsn9.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(q9inside);
        System.out.println("Serializaion Completed");
        FileInputStream fis = new FileInputStream("C:\\Users\\sudip\\IdeaProjects\\Files\\qsn9.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        qsnI q92inside= (qsnI) ois.readObject();
        System.out.println("Deserialization completed ");
        System.out.println(q92inside.s);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("\nSet A:");
        qsnA.Implementation();
        System.out.println("\nSet B:");
        qsnB.Implementation();
        System.out.println("\nSet C:");
        qsnC.Implementation();
        System.out.println("\nSet D:");
        try{
            qsnD.Implementation();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nSet D(Second):");
        try{
            qsnDb.Implementation();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nSet E:");
        try{
        qsnE.Implementation();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n\nSet F:");
        try{
            qsnF.Implementation();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n\nSet G:");
        try{
            qsnG.Implementation();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nSet H:");
        try{
            qsnH.Implementation();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nSet I:");
        try{
            qsnI.Implementation();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nLab no: 14 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}