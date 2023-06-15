package org.comstudy21.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {

   // JdbcUtil.getConnection();
   public static Connection getConnection() {
      String url = "jdbc:mariadb://localhost:3306/mingyeong";
      String user = "mingyeong";
      String password = "1234";
      try {
         Class.forName("org.mariadb.jdbc.Driver");
         Connection conn = DriverManager.getConnection(url, user, password);
         return conn;
      } catch (ClassNotFoundException e) {
         System.out.println("����̹� �˻� ����!");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("��� ���� ����!");
         e.printStackTrace();
      }
      return null;
   }
   
   public static void close(Connection conn) {
      if(conn != null) {
         try {
            conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
   
   public static void close(PreparedStatement o) {
      if(o != null) {
         try {
            o.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
   
   public static void close(ResultSet o) {
      if(o != null) {
         try {
            o.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
   
   public static void main(String[] args) {
      System.out.println(getConnection());
   }
   //Finally block���� ��� �� �޼ҵ�
   public static void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
      close(conn);
      close(stmt);
      close(rs);
   }
}