//package ch04_1;
//
//public class SingleTone {
//	private static SingleTone instance;
//	
//	private SingleTone() {}
//	
//		
//	public static SingleTone getInstance() {
//		if(instance == null) {
//		instance = new SingleTone();
//	}
//		return instance;
//	
//}
//public void run(String message) {
//    System.out.println("���� ... " + message);
// }
//
//}
//public class SingleTone_Me {
//   // �ν��Ͻ��� ���� 1������ Ŭ���� 
//   public static void main(String[] args) {
//      //SingleTone st = new SingleTone();
//      SingleTone st = SingleTone.getInstance(); // Ŭ���� �̸����� ����(static)
//      st.run("s1");
//      
//      SingleTone st2 = SingleTone.getInstance();
//      st.run("s2");
//   }
//}