package advance.dev.models;

public class TRiangle extends Shape {
	public double a;
	public double b;
	public double c;
	
	public TRiangle(double a, double b, double c, String line) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double chuvi() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public double dientich() {
		// TODO Auto-generated method stub
		double p =chuvi();
		return Math.sqrt(p * (p-a) * (p-b)*(p-c));
	}

	

}
