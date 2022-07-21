package org;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Circle> circleList=new ArrayList();
        Circle c1=new Circle();
        Circle c2=new Circle();
        Circle c3=new Circle();
        circleList.add(c1);
        circleList.add(c2);
        circleList.add(c3);
        ShapeTest obj=new ShapeTest();
        obj.drawShapes(circleList);
        
		List<Triangle> triList=new ArrayList();
        Triangle t1=new Triangle();
        Triangle t2=new Triangle();
        Triangle t3=new Triangle();
        triList.add(t1);
        triList.add(t2);
        triList.add(t3);
        obj.drawShapes(triList);

	}

}
