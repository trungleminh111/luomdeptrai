package advance.dev.dao;

import java.text.CollationElementIterator;
import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import advance.dev.models.Shape;   

public class ShapManager  implements IShape {
	@Override
	public String toString() {
		return "ShapManager [list=" + list + "]";
	}
	private List<Shape> list = new ArrayList<>();
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (Shape shape : list) {
			System.out.println(shape);
			
		}
	}
	@Override
	public void add(Shape shape) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				list.add(shape);
	}
	public Shape get(int index) {
		return list.get(index);
		
	}
	@Override
	public void sort() {
		// TODO Auto-generated method stub
	 Collections.sort(list, new ShapeComparator());	
	}
	@Override
	public void add(String line, double bk) {
		// TODO Auto-generated method stub
		
	}
	
}
