//package ch04_exerclse;
//
//
//class TV { // �⺻���� extends Object�� ��� �޾� ����.
//   private int size;
//   private String manufacturer;
//   
//   public TV() {
//      this(32, "LG");
//   }
//
//   public TV(String manufacturer) {
//      this(32, manufacturer);
//   }
//
//   public TV(int size, String manufacturer) {
//      this.size = size;
//      this.manufacturer = manufacturer;
//      System.out.println(size + "��ġ " + manufacturer);
//   }
//
//   @Override
//   public String toString() {
//      return "{\"size\":" + size + ", \"manufacturer\":\"" + manufacturer + "\"}";
//   }
//   // ObjectŬ������ toString()�޼ҵ� �������̵�
//}
//
//public class Ch04Ex06 {
//   public static void main(String[] args) {
//      // TV ��ü ����
//      // int�� ���� Ÿ���̴�.
//      // class�� ���� Ÿ���̴�.
//      //int age;
//      TV lgTV = new TV();
//      TV samsungTV = new TV("SAMSUNG");
//      TV sonyTV = new TV(64, "SONY");
//      
//      System.out.println(lgTV.toString());
//      System.out.println(samsungTV);
//      System.out.println(sonyTV);
//   }
//   // ���Ҽ��� ���ư���.
//   // ������...
//}