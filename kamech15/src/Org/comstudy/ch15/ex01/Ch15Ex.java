package Org.comstudy.ch15.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;

class Saram implements Comparable<Saram> {
   private int seq;
   private String id;
   private String name;
   private String email;
   private int nai;
   
   public Saram() {
      this(0, "","","");
   }
   
   public Saram(int seq) {
      this(seq, "", "", "");
   }

   public int getNai() {
      return nai;
   }

   public void setNai(int nai) {
      this.nai = nai;
   }

   public Saram(String id, String name, String email) {
      this(0, id, name, email);
   }

   public Saram(int seq, String id, String name, String email) {
      this.seq = seq;
      this.id = id;
      this.name = name;
      this.email = email;
   }

   public Saram(int seq, String id, String name, String email, int nai) {
      this.seq = seq;
      this.id = id;
      this.name = name;
      this.email = email;
      this.nai = nai;
   }

   public int getSeq() {
      return seq;
   }

   public void setSeq(int seq) {
      this.seq = seq;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      // ���ڿ� �ȿ� Ư������ : ��Ŭ������ �ڵ����� ��������(\) �ٿ��ش�.
      return String.format("{\"seq\":%d,\"id\":\"%s\",\"name\":\"%s\",\"email\":\"%s\",\"nai\":\"%d\"}", seq, id, name, email, nai);
   }

   // ���Ϻ����� (�質�� �Ʒ��� �� ���� ���� ����. ���ܹ翡�� �Ź߲� ���� ���� ����.)
   // �÷��ǿ� ����� ��Ҹ� �˻��ϱ� ���� hashCode, equals �ʿ��ϴ�.
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + seq;
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Saram) {
         Saram saram  = (Saram)obj;
         if(saram.seq == this.seq) {
            return true;
         }
      }
      
      return false;
      
//      if (this == obj)
//         return true;
//      if (obj == null)
//         return false;
//      if (getClass() != obj.getClass())
//         return false;
//      Saram other = (Saram) obj; // �ٿ�ĳ����
//      if (this.seq != other.seq)
//         return false;
//      return true;
   }

   @Override
   public int compareTo(Saram o) {
      // �̸������� ���� �ǵ��� �Ѵ�.
//      if(this.nai > o.getNai()) {
//         return -1;
//      } else if(this.nai < o.getNai()) {
//         return 1;
//      } 
      
      if(this.name.compareToIgnoreCase(o.getName()) > 0) {
         return 1;
      } else if(this.name.compareToIgnoreCase(o.getName()) < 0) {
         return -1;
      }
      return 0;
   }
}

public class Ch15Ex {
   
   public static void main(String[] args) {
      ArrayList<Saram> saramList = new ArrayList<Saram>();
      saramList.add(new Saram(101, "kim","��浿", "kim@saram.com", 45));
      saramList.add(new Saram(102, "lee","�̱浿2", "lee@saram.com", 27));
      saramList.add(new Saram(103, "park","�ڱ浿3", "park@saram.com", 30));
      saramList.add(new Saram(104, "hong","ȫ�浿4", "hong@saram.com", 25));
      saramList.add(new Saram(105, "jjang","��浿5", "jjang@saram.com", 33));
      
      // ArrayList ���� Collection�� ����� ��ü�� �˻� �ϱ� ����
      // �߿�: hashCode()�� equals()�� �� ���� �ؾ� �����ϴ�.
      int seq = 104;
      int findIdx = saramList.indexOf(new Saram(seq));
      System.out.println(String.format("seq�� %d�� ��Ҵ� %d��° index�̴�.", seq, findIdx));
      System.out.println(saramList.get(findIdx));
      
      // �ǽ� : saramList�� ��Ҹ� ���̼����� �����϶�.
      // Collections.sort(list)�� �����ϰ� �Ϸ��� Comparable�� Ȱ���϶�.
//      Collections.sort(saramList, new Comparator<Saram>() {
//         @Override
//         public int compare(Saram o1, Saram o2) {
//            if(o1.getNai() > o2.getNai()) {
//               return -1;
//            } else if(o1.getNai() < o2.getNai()) {
//               return 1;
//            }
//            return 0;
//         }
//      });
      
      
      Collections.sort(saramList);
      
//      for(Saram saram: saramList) {
//         System.out.println(saram);
//      }
      
      Enumeration<Saram> e= Collections.enumeration(saramList);
      
      while(e.hasMoreElements()) {//�̳ʸӷ��̼�
    	  System.out.println(e.nextElement());//����Ʈ
      }
   }

   public static void test(String[] args) {
      Saram saram1 = new Saram(1, "kim","��浿", "kim@saram.com");
      Saram saram2 = new Saram(2, "kim","��浿", "kim@saram.com");

      if(saram1.equals(saram2)) {
         System.out.println("���� ��ü�Դϴ�.");
      } else {
         System.out.println("���� ��ü�� �ƴմϴ�.");
      }
   }
}