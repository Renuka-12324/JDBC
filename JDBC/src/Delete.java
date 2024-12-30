import java.sql.*;

public class Delete {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Students";
        String username = "root";
        String password = "Renuka@123";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection established!");

            Statement stmt = connection.createStatement();

            String selectQuery = "SELECT * FROM employee2 WHERE id = 1";
            ResultSet result = stmt.executeQuery(selectQuery);

            System.out.println("Record(s) to be deleted:");
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String email = result.getString("email");
                Date hireDate = result.getDate("hire_date");
                double salary = result.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email +
                        ", Hire Date: " + hireDate + ", Salary: " + salary);
            }

            String deleteQuery = "DELETE FROM employee2 WHERE id = 1";
            int rowsDeleted = stmt.executeUpdate(deleteQuery);
            System.out.println("Number of records deleted: " + rowsDeleted);

        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
