package sudip;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/dab";
        String uname = "root";
        String pw = "admin";
        char s='y';
        Scanner sc1=new Scanner(System.in);
        Connection conn= DriverManager.getConnection(url,uname,pw);
        ResultSet rs=null;
        do{
            System.out.println("1: Type 1 to insert");
            System.out.println("2: Type 2 to read");
            System.out.println("3: Type 3 to delete");
            System.out.println("4: Type 4 to use prepared statement");
            System.out.print("Type here: ");
            int n=sc1.nextInt();
            Statement st=null;
            String query="";
            switch(n){
                case 1:
                    st= conn.createStatement();
                    System.out.print("Enter id: ");
                    int id=sc1.nextInt();
                    System.out.print("Enter name: ");
                    String name=sc1.next();
                    System.out.print("Enter Age: ");
                    int age=sc1.nextInt();
                    System.out.print("Enter Address: ");
                    String address=sc1.next();
                    query="Insert into employee values ("+id+",'"+name+"',"+age+",'"+address+"')";
                    st=conn.createStatement();
                    int a=st.executeUpdate(query);
                    if(a>0){
                        System.out.println("Data Inserted Successfully");
                    }else{
                        System.out.println("Could not Insert, Sorry :(");
                    }
                    st.close();
                    System.out.println();
                    break;
                case 2:
                    query="Select* from employee";
                    st=conn.createStatement();
                    rs=st.executeQuery(query);
                    System.out.print("Id\t");
                    System.out.print("Name\t");
                    System.out.print("Age\t");
                    System.out.print("Address\t");
                    System.out.println();
                    while(rs.next()){
                        System.out.print(rs.getInt("empid")+"\t");
                        System.out.print(rs.getString("empnme")+"\t");
                        System.out.print(rs.getInt("empage")+"\t");
                        System.out.print(rs.getString("empaddress")+"\t");
                        System.out.println();
                    }
                    st.close();
                    System.out.println();
                    break;
                case 3:
                    st= conn.createStatement();
                    System.out.print("Enter id that you want to deleete: ");
                    int id2=sc1.nextInt();
                    query="Delete from employee where empid="+id2;
                    st=conn.createStatement();
                    int a2=st.executeUpdate(query);
                    if(a2>0){
                        System.out.println("Data Deleted Successfully");
                    }else{
                        System.out.println("Could not Delete, Sorry :(");
                    }
                    st.close();
                    System.out.println();
                    break;
                case 4:
                    query="Select* from employee";
                    PreparedStatement pt=conn.prepareStatement(query);
                    pt.setDouble(1,1000);
                    rs=pt.executeQuery(query);
                    System.out.print("Id\t");
                    System.out.print("Name\t");
                    System.out.print("Age\t");
                    System.out.print("Address\t");
                    System.out.println();
                    while(rs.next()){
                        System.out.print(rs.getInt("empid")+"\t");
                        System.out.print(rs.getString("empnme")+"\t");
                        System.out.print(rs.getInt("empage")+"\t");
                        System.out.print(rs.getString("empaddress")+"\t");
                        System.out.println();
                    }
                    st.close();
                    System.out.println();
                    break;
                default:
                    System.out.println("Enter one of them");

            }
            System.out.println("Do you want to continue(y/n)?");
            s=sc1.next().charAt(0);
        }while(s=='y');
        conn.close();
    }
}