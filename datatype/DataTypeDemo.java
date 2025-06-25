package datatype;

public class DataTypeDemo {
    public static void displayTypeInfo(String typeName, Object value, Number max, Number min) {
        System.out.println(typeName + ": " + value);
        if (max != null && min != null) {
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        displayTypeInfo("Integer", 42, Integer.MAX_VALUE, Integer.MIN_VALUE);
        displayTypeInfo("Byte", (byte) 5, Byte.MAX_VALUE, Byte.MIN_VALUE);
        displayTypeInfo("Character", 'A', (int) Character.MAX_VALUE, (int) Character.MIN_VALUE);
        displayTypeInfo("Boolean", true, null, null);
        displayTypeInfo("Float", 3.14F, Float.MAX_VALUE, Float.MIN_VALUE);
        displayTypeInfo("String", "Hello", null, null);
    }
}
 