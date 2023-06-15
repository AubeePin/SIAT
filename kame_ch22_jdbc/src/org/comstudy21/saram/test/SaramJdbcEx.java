package org.comstudy21.saram.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.comstudy21.dbcp.JdbcUtil;

//Model = DAO + DTO
//DAO(CPUD�� ���� Ŭ����)�� ���� �� ���� - Data Access Object
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
         // rs�� Iterator�� ����ϰ� ����Ѵ�.
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

//MVC���� : Model + View +Controller
//Web ���ø����̼��� �鿣�� ��� * (Model + Controller) �����ϴ�.
//�ڹ� ���ø����̼ǿ����� View�� Swing ����� ����.
//�� ���ø����̼ǿ����� HTML + CSS + Javascript�� ����(����Ʈ����)