package advance.dev.models;

public class circle extends Shape{
	public double bk;
	public circle(String line, double bk) {
	}
	@Override
	public double chuvi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * bk;
	}

	@Override
	public double dientich() {
		// TODO Auto-generated method stub
		return Math.PI * bk *bk;
	}

}
