import javax.sql.rowset.*;
public class Main {
    public static void main(String args[]) throws Exception {
        RowSetFactory factory = RowSetProvider.newFactory();
        CachedRowSet rowSet = factory.createCachedRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/dab");
        rowSet.setUsername("root");
        rowSet.setPassword("admin");
        rowSet.setCommand("select * from salary");
        rowSet.execute();
        System.out.println("Contents of the row set");
        while(rowSet.next()) {
            System.out.println(rowSet.getInt(1)+" "+rowSet.getString(2)+" "+rowSet.getInt(3));
        }
    }
}