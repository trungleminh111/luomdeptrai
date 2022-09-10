package advance.dev.models;

public class Rectrangle  extends Shape{
	public double a;
	public double b;

	public Rectrangle(double a, double b,String line) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double chuvi() {
		// TODO Auto-generated method stub
		return 2*(a+b);
	}

	@Override
	public double dientich() {
		// TODO Auto-generated method stub
		return a*b;
	}

}
