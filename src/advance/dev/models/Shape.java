package advance.dev.models;

public abstract class Shape {
	public abstract double chuvi();
	public abstract double dientich();
	@Override
	public String toString() {
		return String.format("Cicle cv:%2f -dt:%2f", chuvi(),dientich());
	}
}
