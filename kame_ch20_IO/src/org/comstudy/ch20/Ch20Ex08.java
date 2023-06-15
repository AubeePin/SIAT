package org.comstudy.ch20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ch20Ex08 {
   
   public static void main(String[] args) throws IOException, ClassNotFoundException {
      File file = new File("D:\\ArrayList.data");
      FileInputStream fis = new FileInputStream(file);
      ObjectInputStream ois = new ObjectInputStream(fis);
      
      ArrayList<Member> memList = (ArrayList<Member>) ois.readObject();
      System.out.println(memList);
      
      ois.close();
      fis.close();
   }

   public static void test(String[] args) throws IOException {
      // ��ü�� ��� List�� ���Ͽ� �����ϰ�
      // �ٽ� �ҷ��ͼ� List�� ��ü�� ��Ƽ� ����ϱ�.
      ArrayList<Member> memList = new ArrayList<Member>();
      memList.add(new Member("KIM", "��浿", 12));
      memList.add(new Member("LEE", "�̱浿", 22));
      memList.add(new Member("PARK", "�ڱ浿", 32));
      memList.add(new Member("KANG", "���浿", 42));

      File file = new File("D:\\ArrayList.data");
      FileOutputStream fos = new FileOutputStream(file);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(memList);
      
      oos.close();
      fos.close();
      
      System.out.println("��ü ����Ʈ�� ���Ͽ� ��� �Ϸ�!");
   }
}