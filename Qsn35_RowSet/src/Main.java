import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/dab");
        rowSet.setUsername("root");
        rowSet.setPassword("admin");
        rowSet.setCommand("select * from salary");
        rowSet.execute();
        while (rowSet.next()) {
            System.out.println(rowSet.getInt(1)+" "+rowSet.getString(2)+" "+rowSet.getInt(3));
        }
    }
}