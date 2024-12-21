/*
 * Summary:
 * This Java program demonstrates the handling of various exceptions by simulating real-world scenarios.
 * Each exception is triggered intentionally and handled with clear explanations and appropriate mechanisms.
 */

import java.io.*;
import java.sql.*;

public class ExceptionHandlingExamplesV3 {
    public static void main(String[] args) {
        simulateIOException();
        simulateFileNotFoundException();
        simulateEOFException();
        simulateSQLException();
        simulateClassNotFoundException();
        simulateArithmeticException();
        simulateNullPointerException();
        simulateArrayIndexOutOfBoundsException();
        simulateClassCastException();
        simulateIllegalArgumentException();
        simulateNumberFormatException();
    }

    // Example of IOException
    private static void simulateIOException() {
        try {
            FileInputStream fileInput = new FileInputStream("read_only_file.txt");
            fileInput.read();
        } catch (IOException e) {
            System.out.println("IOException handled: An error occurred while accessing the file.");
        }
    }

    // Example of FileNotFoundException
    private static void simulateFileNotFoundException() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("missing_file.txt"));
            reader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException handled: File not found.");
        } catch (IOException e) {
            System.out.println("IOException handled: " + e.getMessage());
        }
    }

    // Example of EOFException
    private static void simulateEOFException() {
        try {
            DataInputStream dataInput = new DataInputStream(new ByteArrayInputStream(new byte[0]));
            dataInput.readUTF();
        } catch (EOFException e) {
            System.out.println("EOFException handled: Unexpected end of file.");
        } catch (IOException e) {
            System.out.println("IOException handled: " + e.getMessage());
        }
    }

    // Example of SQLException
    private static void simulateSQLException() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:invalid:db", "user", "password");
        } catch (SQLException e) {
            System.out.println("SQLException handled: Database connection error.");
        }
    }

    // Example of ClassNotFoundException
    private static void simulateClassNotFoundException() {
        try {
            Class.forName("NonexistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException handled: Class not found.");
        }
    }

    // Example of ArithmeticException
    private static void simulateArithmeticException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled: Division by zero.");
        }
    }

    // Example of NullPointerException
    private static void simulateNullPointerException() {
        try {
            String nullString = null;
            nullString.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled: Attempted to access a null object.");
        }
    }

    // Example of ArrayIndexOutOfBoundsException
    private static void simulateArrayIndexOutOfBoundsException() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: Invalid array index accessed.");
        }
    }

    // Example of ClassCastException
    private static void simulateClassCastException() {
        try {
            Object str = "This is a string";
            Integer num = (Integer) str;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException handled: Invalid type conversion.");
        }
    }

    // Example of IllegalArgumentException
    private static void simulateIllegalArgumentException() {
        try {
            Thread thread = new Thread();
            thread.setPriority(12); // Invalid priority
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled: Invalid argument provided.");
        }
    }

    // Example of NumberFormatException
    private static void simulateNumberFormatException() {
        try {
            int num = Integer.parseInt("NotANumber");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: Unable to parse string to number.");
        }
    }
}

