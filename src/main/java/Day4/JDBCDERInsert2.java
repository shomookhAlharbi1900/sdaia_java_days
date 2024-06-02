package Day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class JDBCDERInsert2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\project1_java\\src\\main\\java\\Day4\\hr.db";
        String query = " insert into jobs values (?,?,?,?)";
        while (true) {
            try (Connection conn = DriverManager.getConnection(url);) {
                PreparedStatement st = conn.prepareStatement(query);
                System.out.println("Enter job_id");
                int jobID = sc.nextInt();
                st.setInt(1, jobID);
                sc.nextLine();
                System.out.println("Enter job_Title");
                String jobTitle = sc.nextLine();
                st.setString(2, jobTitle);
                System.out.println("Enter Min salary");
                double minSalary = sc.nextDouble();
                st.setDouble(3, minSalary);
                System.out.println("Enter Max salary");
                double maxSalary = sc.nextDouble();
                st.setDouble(4, maxSalary);
                int rows = st.executeUpdate();
                System.out.println(" INSERTED" + rows);
                sc.nextLine();
                System.out.println("Do you want save ?");
                String toSave = sc.nextLine();
                if (toSave.equals("yes")) {
                    conn.commit();
                    System.out.println(" Data Save");
                    break;
                } else if (toSave.equals("no")) {
                    conn.rollback();
                    System.out.println(" Data Cancelled");
                }


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }   }
}