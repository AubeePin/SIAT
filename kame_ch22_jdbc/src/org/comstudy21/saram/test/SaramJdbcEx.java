package org.comstudy21.saram.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.comstudy21.dbcp.JdbcUtil;

//Model = DAO + DTO
//DAO(CPUD를 위한 클래스)에 구현 될 내용 - Data Access Object
//DTO Data Transfer Object
public class SaramJdbcEx {

   public static void main(String[] args) {
      Connection conn = JdbcUtil.getConnection();
      Statement stmt = null;
      ResultSet rs = null;
      String sql = "SELECT * FROM SARAM";
      try {
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);
         // rs는 Iterator와 비슷하게 사용한다.
         while(rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.printf("%s %s %d\n", id, name, age);
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

}

//MVC패턴 : Model + View +Controller
//Web 애플리케이션의 백엔드 기술 * (Model + Controller) 동일하다.
//자바 애플리케이션에서는 View가 Swing 기술로 구현.
//웹 애플리케이션에서는 HTML + CSS + Javascript로 구현(프론트엔드)