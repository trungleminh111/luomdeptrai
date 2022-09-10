package advance.dev.dao;

import advance.dev.models.Shape;

public interface IShape {
	public void add(Shape Shape);
	public void print();
	public void sort();
	public Shape get( int index);
	public void add(String line, double bk);
	

	
}
