package java0509_03;

public class Km2Mile extends Converter{

	public Km2Mile(double d) {
	
	}

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();

	}

	@Override
	protected double convert(double src) {
		
		return km / ratio;
	}

	@Override
	protected String getSrcString() {
		
		return "Km";
	}

	@Override
	protected String getDestString() {
		
		return "Mile";
	}

}
