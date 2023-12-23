package newpack;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    static String Path="C:\\Users\\sudip\\Pictures\\wallpaper\\2.jpg";
    static String Path2="C:\\Users\\sudip\\Pictures\\wallpaper\\4.jpg";
    public static void main(String[] args) {
        FileInputStream fins;
        FileOutputStream fouts;
        try{
            fins=new FileInputStream(Path);
            fouts=new FileOutputStream(Path2);
            int databyte=0;
            System.out.println("Start Copying FIle");
            while((databyte=fins.read())!=-1){
                fouts.write(databyte);
            }
            System.out.println("Copied");
            fins.close();
            fouts.close();
        }catch(FileNotFoundException ex){
            System.out.println("Why so serious");
        }catch(IOException ex2){
            System.out.println("All is well");
        }
    }
}