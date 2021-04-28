package spider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    Hello hello = new Hello();
    hello.hello();

    Connection conn = null;
    try {
      String url = "jdbc:sqlite:spider.db";
      conn = DriverManager.getConnection(url);

      System.out.println("Connection to SQLite has been established.");

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (conn != null) {
          conn.close();
        }
      } catch (SQLException ex) {
        System.out.println(ex.getMessage());
      }
    }
    System.out.println(new App().getGreeting());
  }
}
