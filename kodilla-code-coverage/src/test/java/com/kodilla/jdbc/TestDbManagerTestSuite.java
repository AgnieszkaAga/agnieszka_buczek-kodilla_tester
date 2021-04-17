package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();

        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }

        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUE('Zara', 'Ali')";
        statement.execute(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUE('Otman', 'Use')";
        statement.execute(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + "," +
                                rs.getString("FIRSTNAME") + "," +
                                rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);
        rs.close();
        statement.close();
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();
        String query = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) >= 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(query);
        int counter = 0;
        while (rs.next()) {
            String firstName = rs.getString("FIRSTNAME");
            String lastName = rs.getString("LASTNAME");
            System.out.println(firstName + " " + lastName);
            counter++;
        }
        String sqlInsert = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES('TestName', 'TestSurname')";
        statement.executeUpdate(sqlInsert);
        sqlInsert = "SELECT ID FROM USERS WHERE FIRSTNAME = 'TestName' AND LASTNAME ='TestSurname'";
        rs = statement.executeQuery(sqlInsert);
        int newId = 0;
        while (rs.next()) {
            newId = rs.getInt("ID");
        }
        sqlInsert = "INSERT INTO POSTS(USER_ID, BODY) VALUES("+newId + ", 'Hello, it is my first post')";
        statement.executeUpdate(sqlInsert);
        sqlInsert = "INSERT INTO POSTS(USER_ID, BODY) VALUES("+newId + ", 'Hello, it is my second post')";
        statement.executeUpdate(sqlInsert);

        //When
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(query);

        //Then
        int finalCounter = 0;
        while (rs.next()) {
            finalCounter++;
        }
        int expected = counter + 1;
        Assertions.assertEquals(expected, finalCounter);

        String sqlDelete = "DELETE FROM POSTS WHERE USER_ID = "+newId;
        statement.executeUpdate(sqlDelete);
        sqlDelete = "DELETE FROM USERS WHERE ID = "+newId;
        rs.close();
        statement.close();
    }
}
