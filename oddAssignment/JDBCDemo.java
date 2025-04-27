import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            Statement stmt = con.createStatement();

            // Insert
            stmt.executeUpdate("INSERT INTO users (id, name) VALUES (1, 'John')");
            
            // Update
            stmt.executeUpdate("UPDATE users SET name = 'Johnny' WHERE id = 1");

            // Select
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            // Delete
            stmt.executeUpdate("DELETE FROM users WHERE id = 1");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
