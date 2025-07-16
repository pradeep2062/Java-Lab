package javalabcollege.jdbc;

import java.sql.ResultSet;
import java.util.Scanner;

public class ImplementingCRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DBCrud dbCrud = new DBCrud();

        while (true) {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Create Record");
            System.out.println("2. Update Record");
            System.out.println("3. Read One Record");
            System.out.println("4. Read All Records");
            System.out.println("5. Delete Record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Full Name: ");
                        String fullname = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter Mobile: ");
                        String mobile = scanner.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();

                        boolean isCreated = dbCrud.createRecord(id, fullname, email, mobile, salary);
                        System.out.println(isCreated ? "Record created successfully." : "Failed to create record.");
                        break;

                    case 2:
                        System.out.print("Enter ID to update: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter new Full Name: ");
                        fullname = scanner.nextLine();
                        System.out.print("Enter new Email: ");
                        email = scanner.nextLine();
                        System.out.print("Enter new Mobile: ");
                        mobile = scanner.nextLine();
                        System.out.print("Enter new Salary: ");
                        salary = scanner.nextDouble();

                        boolean isUpdated = dbCrud.updateRecord(id, fullname, email, mobile, salary);
                        System.out.println(isUpdated ? "Record updated successfully." : "Failed to update record.");
                        break;

                    case 3:
                        System.out.print("Enter ID to read: ");
                        id = scanner.nextInt();
                        ResultSet rs = dbCrud.readOneRecord(id);
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id"));
                            System.out.println("Full Name: " + rs.getString("fullname"));
                            System.out.println("Email: " + rs.getString("email"));
                            System.out.println("Mobile: " + rs.getString("mobile"));
                            System.out.println("Salary: " + rs.getDouble("salary"));
                        }
                        break;

                    case 4:
                        rs = dbCrud.readAllRecords();
                        while (rs.next()) {
                            System.out.println("\nID: " + rs.getInt("id"));
                            System.out.println("Full Name: " + rs.getString("fullname"));
                            System.out.println("Email: " + rs.getString("email"));
                            System.out.println("Mobile: " + rs.getString("mobile"));
                            System.out.println("Salary: " + rs.getDouble("salary"));
                        }
                        break;

                    case 5:
                        System.out.print("Enter ID to delete: ");
                        id = scanner.nextInt();
                        boolean isDeleted = dbCrud.deleteRecord(id);
                        System.out.println(isDeleted ? "Record deleted successfully." : "Failed to delete record.");
                        break;

                    case 6:
                        System.out.println("Exiting program...");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                scanner.nextLine(); // Clear the scanner buffer
            }
        }
    }
}
