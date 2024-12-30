import java.sql.*;

public class Select {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Students";
        String username = "root";
        String password = "Renuka@123";

        try(Connection connection= DriverManager.getConnection(url,username,password)){
            System.out.println(connection);
            Statement stmt = connection.createStatement();

            String query = "SELECT * FROM employee2";

            ResultSet result=stmt.executeQuery(query);
            System.out.println("Connection success "+result);

            while (result.next()) {
                String empName = result.getString("name");
                String empEmail = result.getString("email");
                String empHdate = result.getString("hire_date");
                String empSalary = result.getString("salary");

                System.out.println("empName : " + empName);
                System.out.println("empEmail : " + empEmail);
                System.out.println("empHdate : " + empHdate);
                System.out.println("empSalary : " + empSalary);
            }
        } catch (Exception e) {
            System.out.println("connection failed "+ e.getMessage());
        }
    }
}
