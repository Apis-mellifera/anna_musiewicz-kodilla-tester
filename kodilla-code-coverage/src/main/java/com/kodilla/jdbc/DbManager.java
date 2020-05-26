package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//klasa ta odpowiedzialna jest za połączenia z bazą danych;
// wzorzec projektowy Singleton - chcemy nawiązac połączenie z bazą danych tylko raz i utrzymywac je otwarte
public class DbManager {
    private Connection conn;
    private static DbManager dbManagerInstance;

    // pole conn przechowuje referencję do obiektu reprezentującego połączenie do bazy danych
    // Connection jest interfejsem dostarczanym przez bibliotekę java.sql
    // pole dbManagerInstance przechpwuje referencję do instancji klasy dbManager; jest potrzebne by w pamięci komputera dostępna bya zawsze tylko jedna instacja obiektu klasy DbManager

    // definicja konstruktora; celowo jest prywatny
    private DbManager() throws SQLException {
        // tworzymy obiekt klasy Properties dostarczanej przez java.util
        // klasa ta jest podobna do HAshMap, przechowuje pary key-value
        Properties connectionProps = new Properties();
        connectionProps.put("user", "kodilla");
        connectionProps.put("password", "kodilla");

        //tworzymy połączenie do bazy danych klasy DriverManager dostarczanej przez java.sql
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_tester?serverTimezone=Europe/Warsaw"
                        + "&useSSL=False", connectionProps);

        // pierwszy parametr url: jdbc:mysql:// korzystamy ze sterownika
        // localhost:3306/ serwer i port
        // kodilla tester / baza danych
        // strefa czasowa serwera
        // &useSSL=False / parametr wyłączający używanie protokołu SSL
        // drugi parametr (info) to obiekt typu Properties (tu zaiwera nazwę i hasło uzytkownika)
    }

    // klasa DbManager sama zarządza powołaniem do życia swojej instancji przy pomocy metody getInstance
    // zgodnie ze wzorcem Singleton
    // lazy insatntiating
    public static DbManager  getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    // definicja metody getConnection, która zwraca obiekt klasy Connection
    // obiekt ten przechowuje połączenie z bazą danych
    // uzywamy go do tworzenia zapytań do bazy danych
    public Connection getConnection() {
        return conn;
    }
}
