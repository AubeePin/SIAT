package java0509_05;

public class ColorPoint extends Point {
   private String color;
   
   public ColorPoint() {
      this(0,0,"BLACK");
   }
   
   public ColorPoint(int x, int y) {
      this(x, y, "BLACK");
   }
   
   public ColorPoint(int x, int y, String color) {
      super(x, y);
      this.color = color;
   }
   
   public void setXY(int x, int y) {
      move(x, y);
   }
   
   public void setColor(String color) {
      this.color = color;
   }
   
   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return String.format("%s색의 (%d, %d)의점", color, getX(), getY());
   }

   public static void test(String[] args) {
      ColorPoint cp = new ColorPoint(5,5,"YELLOW");
      cp.setXY(10,20);
      cp.setColor("RED");
      System.out.println(cp.toString() + "입니다.");
   }
   
   public static void main(String[] args) {
      ColorPoint zeroPoint = new ColorPoint();
      System.out.println(zeroPoint + "입니다.");
      
      ColorPoint cp = new ColorPoint(10, 10);
      cp.setXY(5, 5);
      cp.setColor("RED");
      System.out.println(cp + "입니다");
   }
}