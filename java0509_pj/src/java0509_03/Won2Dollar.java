package java0509_03;

public class Won2Dollar extends Converter {
   
   String src = "¿ø";
   String dest = "´Þ·¯";
   int won;

   public Won2Dollar(int won) {
	  super.ratio = won;
   }

   
   @Override
   protected double convert(double won) {
      
      return won / ratio;
   }

   @Override
   protected String getSrcString() {
      
      return src;
   }

   @Override
   protected String getDestString() {
      
      return dest;
   }
   
	public static void main(String[] args) {
	      Won2Dollar toDollar = new Won2Dollar(1200);
	      toDollar.run();
   }

}