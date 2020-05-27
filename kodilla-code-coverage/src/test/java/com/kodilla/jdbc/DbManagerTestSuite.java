package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException {
        // given
        // when
        // wywołanie metody getInstance, która nawiązuje połaczenie z bazą danych
        DbManager dbManager = DbManager.getInstance();
        // then
        Assert.assertNotNull(dbManager.getConnection());
    }

    // @Test
    // ten test ma wadę, gdyż polega na danych znajdujących sie obecnie w bazie
    //public void testSelectUsers() throws SQLException {
    //given
    // DbManager dbManager = DbManager.getInstance();

    //when
    // String sqlQuery = "SELECT * FROM USERS";
    //tworzymy obiekt implementujący interfejs Statement dostarczany przez java.sql
    // obiekt tworzony jest przez metodę createStatement
    // Statement jest swego rodzaju zapytaniem
    // Statement statement = dbManager.getConnection().createStatement();
    // zapytanie wykonujemy wywołując metodę executeQuery
    // jako argument podajemy String z treścią zapytania czyli Select from users
    //metoda zwraca kolekcję danych typu ResultSet
    // po kolekcji możemy iterować przy pomocy metody next()
    //  ResultSet rs = statement.executeQuery(sqlQuery);

    //then
    // do pobrania danych używamy metod getInt, getString itp
    // metody te udostepnia obiekt klasy ResultSet
    // int counter = 0;
    // while (rs.next()) {
    //    System.out.println(rs.getInt("ID") + ", " +
    //                       rs.getString("FIRSTNAME") + ", " +
    //                       rs.getString("LASTNAME"));
    //     counter++;
    //  }
    // obiekty typu ResultSet i Statement nalezy zamykać przy pomocy metody close(), by zwolnić zasoby systemowe
    //  rs.close();
    // statement.close();
    //  Assert.assertEquals(5, counter);
    //  }

    @Test
    // test niezależny od obecnego stanu bazy danych
    public void testSelectUsers() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();
        //sprawdzamy ile elementów znajduje się w tabeli
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //when
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assert.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }
}

  //  @Test
  //  public void testSelectUsersAndPosts() throws SQLException {
        //given
     //   DbManager dbManager = DbManager.getInstance();

        //when
      //  String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) >= 2";
      //  Statement statement = dbManager.getConnection().createStatement();
     //   ResultSet rs = statement.executeQuery(sqlQuery);

        //then
     //   int counter = 0;
     //   while (rs.next()) {
     //       System.out.println(rs.getString("U.FIRSTNAME") + ", " +
     //                          rs.getString("U.LASTNAME"));
     //       counter++;
    //    }
      //  rs.close();
     //   statement.close();
     //   Assert.assertEquals(2, counter);
 //   }

   // @Test
   // public void testSelectUsersAndPosts() throws SQLException {
        //given
     //   DbManager dbManager = DbManager.getInstance();
     //   String countQuery = "SELECT USER_ID, COUNT(*) AS POSTS_NUMBER FROM POSTS GROUP BY USER_ID HAVING COUNT(*) >= 2";
     //   Statement statement = dbManager.getConnection().createStatement();
     //   ResultSet rs = statement.executeQuery(countQuery);
     //   int count = 0;
     //   while (rs.next()) {
     //       count = rs.getInt("POSTS_NUMBER");
     //   }
     //   String sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES (16, 'testing message!')";
     //   statement.executeUpdate(sql);
     //   sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES (16, 'testing message')";
     //   statement.executeUpdate(sql);

        //when
     //   String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) >= 2";
     //   statement = dbManager.getConnection().createStatement();
     //   rs = statement.executeQuery(sqlQuery);

        // then
     //   int counter = 0;
      //  while(rs.next()) {
     //       System.out.println(
     //                          rs.getString("U.FIRSTNAME") + ", " +
     //                          rs.getString("U.LASTNAME"));
     //       counter++;
     //   }
     //   int expected = count;
     //   Assert.assertEquals(expected, counter);

     //   rs.close();
     //   statement.close();
  //  }


