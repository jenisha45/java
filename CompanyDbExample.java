package javadatabaseconnection;
import java.sql.*;

public class CompanyDbExample {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // 1. Load Driver (updated driver class)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Company",
                    "root",
                    "admin"
            );

            // 3. Create Statement
            st = con.createStatement();

            // 4. Insert 5 Employee Records
            String insertQuery1 = "INSERT INTO Employee VALUES (1,'John',50000,'Sales')";
            String insertQuery2 = "INSERT INTO Employee VALUES (2,'Alice',60000,'HR')";
            String insertQuery3 = "INSERT INTO Employee VALUES (3,'Bob',55000,'Sales')";
            String insertQuery4 = "INSERT INTO Employee VALUES (4,'David',70000,'IT')";
            String insertQuery5 = "INSERT INTO Employee VALUES (5,'Emma',65000,'Sales')";

            st.executeUpdate(insertQuery1);
            st.executeUpdate(insertQuery2);
            st.executeUpdate(insertQuery3);
            st.executeUpdate(insertQuery4);
            st.executeUpdate(insertQuery5);

            System.out.println("5 Employee records inserted successfully.\n");

            // 5. Retrieve Employees from Sales Department
            String selectQuery = "SELECT * FROM Employee WHERE Department='Sales'";
            rs = st.executeQuery(selectQuery);

            System.out.println("Emp_ID\tEmp_Name\tSalary\tDepartment");

            while (rs.next()) {
                int id = rs.getInt("emp_id");
                String name = rs.getString("emp_name");
                double salary = rs.getDouble("Salary");
                String dept = rs.getString("Department");

                System.out.println(id + "\t" + name + "\t\t" + salary + "\t" + dept);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

