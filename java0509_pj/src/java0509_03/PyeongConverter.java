package java0509_03;

public class PyeongConverter extends Converter {

	   public PyeongConverter(double d) {
	      this.ratio = d;
	   }

	   public static void main(String[] args) {
	      PyeongConverter toMM = new PyeongConverter(3.3);
	      toMM.run();
	   }

	   @Override
	   protected double convert(double src) {
	      // TODO Auto-generated method stub
	      return src * ratio;
	   }

	   @Override
	   protected String getSrcString() {
	      // TODO Auto-generated method stub
	      return "Æò";
	   }

	   @Override
	   protected String getDestString() {
	      // TODO Auto-generated method stub
	      return "Á¦°ö¹ÌÅÍ";
	   }

	}