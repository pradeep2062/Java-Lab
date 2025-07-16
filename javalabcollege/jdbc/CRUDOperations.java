package javalabcollege.jdbc;

public class CRUDOperations {
    public static void main(String[] args) {
        try {
            System.out.println("\n=== Creating new record ===");
            boolean created = DBCrud.createRecord(4, "Ram Karki", "ram@gmail.com", "9884323212", 50000.0);
            System.out.println("Record created: " + created);
            System.out.println("\n=== Reading all records ===");
            DBCrud.readAllRecords();
            System.out.println("\n=== Updating record ===");
            boolean updated = DBCrud.updateRecord(4, "Ram Karku", "ram1@gmail.com", "9876543210", 55000.0);
            System.out.println("Record updated: " + updated);
            System.out.println("\n=== Reading single record ===");
            DBCrud.readOneRecord(1);
            System.out.println("\n=== Deleting record ===");
            boolean deleted = DBCrud.deleteRecord(1);
            System.out.println("Record deleted: " + deleted);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
