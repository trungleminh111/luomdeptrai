package advance.dev.dao;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

import advance.dev.models.Shape;

public class ShapeComparator implements Comparator<Shape> {

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return o1.chuvi() > o2.chuvi() ? -1 : o1.chuvi() == o2.chuvi() ? 0:1;
	}
	


	

}
