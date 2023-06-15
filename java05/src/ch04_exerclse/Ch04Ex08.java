//package ch04_exerclse;
//
//// ÀÚ¹Ù ºó(Bean)
//class Power {
//   private int kick;
//   private int punch;
//   public Power() {}
//   public Power(int kick) {
//      this.kick = kick;
//   }
//   public Power(int kick, int punch) {
//      this.kick = kick;
//      this.punch = punch;
//   }
//   public int getKick() {
//      return kick;
//   }
//   public void setKick(int kick) {
//      this.kick = kick;
//   }
//   public int getPunch() {
//      return punch;
//   }
//   public void setPunch(int punch) {
//      this.punch = punch;
//   }
//   @Override
//   public String toString() {
//      return "Power [kick=" + kick + ", punch=" + punch + "]";
//   }
//}
//
//public class Ch04Ex08 {
//   public static void main(String[] args) {
//      Power robot = new Power();
////      robot.kick = 10;
////      robot.punch = 20;
//      robot.setKick(10);
//      robot.setPunch(20);
//      System.out.println(robot);
//   }
//}