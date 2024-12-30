import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class Insert {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Students";
        String username = "root";
        String password = "Renuka@123";

        try(Connection connection= DriverManager.getConnection(url,username,password)){
            System.out.println(connection);
            Statement stmt = connection.createStatement();
            String query= "INSERT INTO employee2 (name, email, hire_date, salary)\n"
                    + "VALUES ('John', 'john.doe1@example.com', '2024-11-30', 60000.00);\n";

            boolean resultset=stmt.execute(query);
            System.out.println("Connection success "+resultset);
        } catch (Exception e) {
            System.out.println("connection failed "+ e.getMessage());
        }
    }
}
