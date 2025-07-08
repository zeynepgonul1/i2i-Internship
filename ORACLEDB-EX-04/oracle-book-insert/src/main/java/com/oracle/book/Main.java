package com.oracle.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1522/XEPDB1";
    private static final String DB_USER = "BOOKUSER";
    private static final String DB_PASSWORD = "1234";

    public static void main(String[] args) {
        String insertSQL = "INSERT INTO BOOK (NAME, ISBN) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            for (int i = 1; i <= 100; i++) {
                String name = "Book " + RandomStringUtils.randomAlphabetic(5);
                String isbn = RandomStringUtils.randomNumeric(13);

                pstmt.setString(1, name);
                pstmt.setString(2, isbn);
                pstmt.executeUpdate();

                System.out.println("Inserted record " + i + ": " + name + ", " + isbn);
            }

            System.out.println("✅ 100 kayıt başarıyla eklendi!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
