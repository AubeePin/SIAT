package Org.comstudy.ch15.ex01;

public class Ch15Ex02 {
   // ������ ���ο� �̳�� - ���汸
   public static void main(String[] args) {
      String str1 = "1|�����|���α׷���|38";
      
      // StringBuffer�� ����ڽ� ���� ����.
      // String�� ����ڽ� ������ �����ϱ� ���� ���� �߰��� Ŭ�����̴�.
      // ����ڽ� ��� new�� �̿��ؼ� ��ü ���� �ؾ� �Ѵ�.
      // ��÷� �Ÿ��� �� �� (���� �����ϱ�)
      //StringBuffer strbf = new StringBuffer(str1);
      StringBuffer strbf = new StringBuffer();
      strbf.append(str1);
      strbf.append("|comstudy21@naver.com");
      
      // ���α׷��� -> ������ ����
      String s = "���α׷���";
      int start = strbf.indexOf(s);
      int end = start + s.length();
      strbf.replace(start, end, "������");
      System.out.println(strbf);
      
      strbf.delete(strbf.indexOf("������"), strbf.indexOf("������")+"������|".length());
      
      System.out.println(strbf);
   }
   
   public static void test(String[] args) {
      String str1 = "1|�����|���α׷���|38";
      
      int idx = str1.indexOf("���α׷���");
      System.out.println("idx = " + idx);
      
      // String�� �Һ� ��ü�̹Ƿ� ����� ��ȯ �޾ƾ� �Ѵ�.
      str1 = str1.replace("���α׷���", "������");
      System.out.println(str1);
   }
}