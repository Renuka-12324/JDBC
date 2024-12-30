import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
       String url = "jdbc:mysql://localhost:3306/Students";

       String username = "root";
       String password = "Renuka@123";

       try(Connection connection = DriverManager.getConnection(url, username, password)){

           System.out.println(connection);

           Statement stmt = connection.createStatement();
           String query = "CREATE TABLE employee2 ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY, "
                   + "name VARCHAR(100) NOT NULL, "
                   + "email VARCHAR(100) NOT NULL UNIQUE, "
                   + "hire_date DATE, "
                   + "salary DECIMAL(10, 2)" + ")";

           boolean result =stmt.execute(query);

           System.out.println("Connected to the database "+result);


       }catch(SQLException e){
           System.out.println("Connection failed: " + e.getMessage());
       }

    }
}