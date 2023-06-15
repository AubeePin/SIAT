package org.comstudy21.saram.controller;

import java.util.List;

import org.comstudy21.saram.model.SaramDAO;
import org.comstudy21.saram.model.SaramDTO;

public class SaramController {
   static SaramDAO dao = new SaramDAO();
   
   public static void main(String[] args) {
      SaramDTO dto = new SaramDTO("kim3", "±è±æµ¿3", 30);
      dao.insert(dto);
      testSelectAll();
   }
   
   public static void testSelectOne() {
      SaramDTO dto = new SaramDTO("kim2", null, 0);
      SaramDTO saram = dao.selectOne(dto);
      System.out.println(saram);
   }
   
   public static void testSelectAll() {
      List<SaramDTO> list = dao.selectAll();
      System.out.println(list);
   }

}