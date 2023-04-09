import java.sql.*;
import java.util.Scanner;
public class Main{
    static String driver="com.mysql.cj.jdbc.Driver";
    static String dbURL="jdbc:mysql://localhost:3306/dab";
    static String dbUser="root";
    static String dbPassword="admin";
    public void connectAndFireQuery(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID: ");
        int ID=sc.nextInt();
        System.out.print("Enter Name: ");
        String Name = sc.nextLine();
        System.out.print("Enter Address:");
        String Address= sc.nextLine();
        System.out.print("Enter Salary: ");
        int Salary=sc.nextInt();

        try{
            Class.forName(driver);
            Connection con=DriverManager.getConnection(dbURL,dbUser,dbPassword);


            Statement st=con.createStatement();
            String myQuery="INSERT INTO student VALUES("+ID+",'"+Name+"','"+Address+"',"+Salary+")";
            int res = st.executeUpdate(myQuery);
            System.out.println("Data inserted" +res+"row(s) affected!");

            st.close();

            con.close();
        }
        catch(Exception e){
            System.out.println("Oops!"+e);
        }
    }



    public static void main(String[] args) {
        Main dl=new Main();
        dl.connectAndFireQuery();
        System.out.println("Lab No:29 \nName:Sunisha Bhattarai \nRoll No:21 Section:A");
    }

}